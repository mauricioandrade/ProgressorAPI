package com.example.ProgressorAPI.domain.enums;

public enum ServingUnit {

        GRAMS("g"),
        MILLILITERS("ml"),
        UNIT("unidade"),
        SPOON("colher"),
        CUP("xícara");

        private final String displayName;

        ServingUnit(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

