import { useEffect, useState } from "react";
import '../css/Crawling.css';

export default function Crawling()
{
    const[message,setMessage]=useState('');
    useEffect(()=>{
        fetch("http://localhost:8080/api/admin/annoucement")
        .then(res=>res.text())
        .then(data=>{
            console.log("fetched message: "+data);
            setMessage(data)})
        .catch(error => console.error('Error fetching courses:', error));
    },[])
    return(
        <div className="marquee-container">
            <div className="marquee"><b>{message}</b></div>
        </div>
    );
}