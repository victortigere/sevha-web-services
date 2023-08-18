package com.objectraven.sevha.repository;

import com.objectraven.sevha.model.SavingProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingProjectRepository extends JpaRepository<SavingProject, Long> {
}
