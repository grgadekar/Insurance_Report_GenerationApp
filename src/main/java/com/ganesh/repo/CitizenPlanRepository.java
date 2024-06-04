package com.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {

}
