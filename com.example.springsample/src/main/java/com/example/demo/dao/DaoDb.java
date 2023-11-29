package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modelpojo.Model;

public interface DaoDb extends JpaRepository<Model, Integer> {
}
