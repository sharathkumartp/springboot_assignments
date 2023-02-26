package com.sharath.FebTest.service;

import com.sharath.FebTest.dao.CourseRepository;
import com.sharath.FebTest.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public String deleteCourse(String courseId) {
        for (Course course : courseRepository.findAll()) {
            if (course.getCourse_Id()==(Integer.valueOf(courseId))){
                courseRepository.delete(course);
                return "Deleted";
            }
        }
        return "Not found";
    }
}
