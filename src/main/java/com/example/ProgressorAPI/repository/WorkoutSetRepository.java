package com.example.ProgressorAPI.repository;

import com.example.ProgressorAPI.domain.WorkoutSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutSetRepository extends JpaRepository <WorkoutSet, Long> {
}
