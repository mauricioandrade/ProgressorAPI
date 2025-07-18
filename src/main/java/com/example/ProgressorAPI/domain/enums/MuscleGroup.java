package com.example.ProgressorAPI.domain.enums;

public enum MuscleGroup {
    CHEST("Peito"),
    BACK("Costas"),
    LEGS("Pernas"),
    SHOULDERS("Ombros"),
    BICEPS("Biceps"),
    TRICEPS("Triceps"),
    ABS("Abdomen"),
    CARDIO("Cardio"),
    FULL_BODY("Corpo Inteiro"),
    OTHER("Outro");

    private final String displayName;

    MuscleGroup(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
