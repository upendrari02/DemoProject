package com.demo.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.project.models.Company;
import com.demo.project.models.Student;
import com.demo.project.models.one.to.one.uni.dir.Address;
import com.demo.project.one.to.many.bi.dir.models.Color;
@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

	@Query("select s.studentClass, Count(*) from Student s group by s.studentClass")
	List<String> findAllGroupBy();

}
