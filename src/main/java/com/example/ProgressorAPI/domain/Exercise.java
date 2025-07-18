package com.example.ProgressorAPI.domain;

import com.example.ProgressorAPI.domain.enums.MuscleGroup;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name", nullable = false, length = 100)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "muscle_group", length = 50)
    private MuscleGroup muscleGroup;

    public Exercise(){
    }

    public Exercise(String name, MuscleGroup muscleGroup) {
        this.name = name;
        this.muscleGroup = muscleGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return id != null && id.equals(exercise.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
