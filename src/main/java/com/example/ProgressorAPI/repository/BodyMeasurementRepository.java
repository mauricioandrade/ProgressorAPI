package com.example.ProgressorAPI.repository;

import com.example.ProgressorAPI.domain.BodyMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyMeasurementRepository extends JpaRepository <BodyMeasurement, Long> {
}
