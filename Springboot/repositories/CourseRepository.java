package com.example.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entity.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Integer> {

	@Query(value = "SELECT Course_Discription FROM Courses WHERE Course_name = :name", nativeQuery = true)
    String getDiscription(@Param("name") String name);
	
	@Query(value="select * from Courses where Course_isactive=true",nativeQuery=true)
	public List<Courses> getActiveCourse();

}
