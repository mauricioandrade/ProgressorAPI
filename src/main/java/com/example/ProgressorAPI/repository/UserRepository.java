package com.example.ProgressorAPI.repository;

import com.example.ProgressorAPI.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long> {


}
