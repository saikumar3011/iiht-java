package com.springboot.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.models.Course;

public interface CourseRepositroy extends CrudRepository<Course, Integer> {

}
