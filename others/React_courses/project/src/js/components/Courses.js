import { useEffect, useState } from "react";

export default function Courses(){
    var [Courses,setCourse]=useState([]);
    useEffect(()=>{
        fetch("https://localhost:8080/api/course")
        .then((res)=>res.json())
        .then((result)=>{setCourse(result)})
    },[])
    return(
        <>
            <h3>The Active course are</h3>
            <tbody>
                {Courses.map(Course=>(
                    <td>{Course.CourseName}</td>
                ))}
            </tbody>
        </>
         );
}
