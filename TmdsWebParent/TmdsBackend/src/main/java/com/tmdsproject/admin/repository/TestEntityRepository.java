package com.tmdsproject.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.TestEntity;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long>{

}
