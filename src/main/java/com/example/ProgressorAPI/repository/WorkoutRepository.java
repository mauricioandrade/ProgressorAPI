package com.example.ProgressorAPI.repository;

import com.example.ProgressorAPI.domain.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository <Workout, Long> {
}
