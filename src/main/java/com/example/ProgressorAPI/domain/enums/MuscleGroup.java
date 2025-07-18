package com.example.ProgressorAPI.domain.enums;

public enum MuscleGroup {
    CHEST("Peito"),
    BACK("Costas"),
    LEGS("Pernas"),
    SHOULDERS("Ombros"),
    BICEPS("Bíceps"),
    TRICEPS("Tríceps"),
    ABS("Abdômen"),
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
