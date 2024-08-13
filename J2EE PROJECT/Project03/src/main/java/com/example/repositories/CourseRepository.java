package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Courses;

import jakarta.transaction.Transactional;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Integer> {

	@Query(value = "SELECT course_description FROM Courses WHERE course_name = :name", nativeQuery = true)
    String getDiscription(@Param("name") String name);
	
	@Query(value="select course_name from Courses where course_is_active=true",nativeQuery=true)
	public List<String> getActiveCourse();
	
	@Query(value="select * from courses where course_name=:course",nativeQuery=true)
	public Courses findByCourseName(@Param("course") String course_name);
	
	@Modifying
    @Transactional
    @Query("UPDATE Courses c SET c.courseDescription = :description, c.courseDuration = :duration, c.courseIsActive = :isActive, c.courseName = :name, c.courseSyllabus = :syllabus, c.coverPhoto = :photo, c.videoId = :videoId WHERE c.courseId = :id")
    void updateCourseDetails(@Param("description") String courseDescription,
                             @Param("duration") int courseDuration,
                             @Param("isActive") boolean courseIsActive,
                             @Param("name") String courseName,
                             @Param("syllabus") String courseSyllabus,
                             @Param("photo") String coverPhoto,
                             @Param("videoId") int videoId,
                             @Param("id") int id);
}
	
