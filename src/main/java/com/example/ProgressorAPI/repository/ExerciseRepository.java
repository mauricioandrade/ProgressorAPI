package com.example.ProgressorAPI.repository;

import com.example.ProgressorAPI.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository <Exercise, Long> {
}
