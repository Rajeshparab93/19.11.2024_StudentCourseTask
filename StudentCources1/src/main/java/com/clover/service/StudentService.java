package com.clover.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clover.model.Course;
import com.clover.model.Student;
import com.clover.repo.CourseRepo;
import com.clover.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	public Student registerCourse(Long studentId, Long courseId) {
	    Student student = studentRepo.findById(studentId).orElse(null);
	    Course course = courseRepo.findById(courseId).orElse(null);

	    if (student == null || course == null) {
	        return null; // Return null if student or course not found
	    }

	    student.getCourses().add(course); // Add course to student's course list
	    return studentRepo.save(student); // Save updated student
	  //  return student; // Return updated student
	}
	
	public Student getStudentCourses(Long studentId) {
	    return studentRepo.findById(studentId).orElse(null);
	}
	
	  // Create a new student
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    // Create a new course
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }
	
	

}
