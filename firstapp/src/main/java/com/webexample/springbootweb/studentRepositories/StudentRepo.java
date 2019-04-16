package com.webexample.springbootweb.studentRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webexample.springbootweb.model.studentdata;
@Repository
public interface StudentRepo extends JpaRepository<studentdata,Integer> {

}
