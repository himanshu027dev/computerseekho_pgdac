import React, { useState, useEffect } from 'react';
import useAuth from './useAuth';
import AdminEnquiryTable from './AdminEnquiryTable';

const AdminEnquiry = () => {
    const [enquiries, setEnquiries] = useState([]);
    const [showForm, setShowForm] = useState(false);
    const [editing, setEditing] = useState(false);
    const [currentEnquiry, setCurrentEnquiry] = useState(null);
    const { fetchData } = useAuth();
    const [courses, setCourses] = useState([]);
    const [staff, setStaff] = useState([]);

    useEffect(() => {
        fetchEnquiries();
        fetchCourses();
        fetchStaff();
    }, []);

    const fetchEnquiries = async () => {
        const url = 'http://localhost:8080/api/pta/getEn';
        try {
            const data = await fetchData(url);
            setEnquiries(data);
        } catch (error) {
            console.error('Error fetching enquiries:', error);
        }
    };

    const fetchCourses = async () => {
        const url = 'http://localhost:8080/api/pta/getallcourse/course';
        try {
            const data = await fetchData(url);
            setCourses(data);
        } catch (error) {
            console.error('Error fetching courses:', error);
        }
    };

    const fetchStaff = async () => {
        const url = 'http://localhost:8080/api/pta/getstaff';
        try {
            const data = await fetchData(url);
            setStaff(data);
        } catch (error) {
            console.error('Error fetching staff:', error);
        }
    };

    const addEnquiry = async (enquiry) => {
        const url = 'http://localhost:8080/api/admin/Add';
        try {
            await fetchData(url, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(enquiry),
            });
            fetchEnquiries();
            setShowForm(false);
        } catch (error) {
            console.error('Error adding enquiry:', error);
        }
    };

    // const updateEnquiry = async (id, updatedEnquiry) => {
    //     const url = `http://localhost:8080/api/admin/up/${id}`;
    //     try {
    //         await fetchData(url, {
    //             method: 'PUT',
    //             headers: {
    //                 'Content-Type': 'application/json',
    //             },
    //             body: JSON.stringify(updatedEnquiry),
    //         });
    //         fetchEnquiries();
    //         setEditing(false);
    //         setShowForm(false);
    //     } catch (error) {
    //         console.error('Error updating enquiry:', error);
    //     }
    // };
    const updateEnquiry = async (id, updatedEnquiry) => {
        const url = `http://localhost:8080/api/admin/up/${id}`;
        try {
            const response = await fetch(url, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': `Bearer ${sessionStorage.getItem('jwt')}`,
                },
                body: JSON.stringify(updatedEnquiry),
            });
            if (!response.ok) {
                throw new Error('Failed to update enquiry');
            }
            fetchEnquiries();
        } catch (error) {
            console.error('Error updating enquiry:', error);
        }
    };

    const updateEnquiryStatus = async (id, isActive) => {
        const updatedEnquiry = enquiries.find(enquiry => enquiry.enquiryId === id);
        if (updatedEnquiry) {
            updatedEnquiry.isActive = isActive;
            await updateEnquiry(id, updatedEnquiry);
        }
    };

    const deleteEnquiry = async (id) => {
        const url = `http://localhost:8080/api/admin/del/${id}`;
        try {
            await fetchData(url, {
                method: 'DELETE',
            });
            fetchEnquiries();
        } catch (error) {
            console.error('Error deleting enquiry:', error);
        }
    };

    const editEnquiry = (enquiry) => {
        setCurrentEnquiry(enquiry);
        setEditing(true);
        setShowForm(true);
    };

    return (
        <div>
            <h1>Admin Enquiries</h1>
           
            <AdminEnquiryTable
                enquiries={enquiries}
                updateEnquiryStatus={updateEnquiryStatus}
                deleteEnquiry={deleteEnquiry}
            />
        </div>
    );
};

export default AdminEnquiry;
