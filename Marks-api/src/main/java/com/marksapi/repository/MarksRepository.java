package com.marksapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marksapi.entity.Marks;

public interface MarksRepository extends JpaRepository<Marks, Integer> {

}
