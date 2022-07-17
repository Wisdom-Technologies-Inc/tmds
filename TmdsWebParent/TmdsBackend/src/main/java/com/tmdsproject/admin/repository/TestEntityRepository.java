package com.tmdsproject.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmdsproject.TmdsCommon.entities.TestEntity;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Long>{

}
