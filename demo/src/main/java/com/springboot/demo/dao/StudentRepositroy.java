package com.springboot.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.models.Student;

public interface StudentRepositroy extends CrudRepository<Student, Integer> {

}
