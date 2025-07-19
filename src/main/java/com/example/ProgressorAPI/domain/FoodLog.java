package com.example.ProgressorAPI.domain;

import com.example.ProgressorAPI.domain.enums.ServingUnit;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "food_logs")
public class FoodLog {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "user_id", nullable = false)
    private User user;

    @Column (name = "food_name", nullable = false)
    private String foodName;

    @Column (name = "consumed_at", nullable = false)
    private LocalDateTime consumedAt;

    @Column (name = "quantity")
    private Double quantity;

    @Enumerated (EnumType.STRING)
    @Column (name = "serving_unit")
    private ServingUnit unit;

    @Column (name = "calories")
    private Double calories;

    @Column (name = "protein_g")
    private Double protein;

    @Column (name = "carbs_g")
    private Double carbs;

    @Column (name = "fat_g")
    private Double fat;

    public FoodLog(){

    }

    public FoodLog(User user, String foodName, LocalDateTime consumedAt, Double quantity, ServingUnit unit, Double calories, Double protein, Double carbs, Double fat) {
        this.user = user;
        this.foodName = foodName;
        this.consumedAt = consumedAt;
        this.quantity = quantity;
        this.unit = unit;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public LocalDateTime getConsumedAt() {
        return consumedAt;
    }

    public void setConsumedAt(LocalDateTime consumedAt) {
        this.consumedAt = consumedAt;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public ServingUnit getUnit() {
        return unit;
    }

    public void setUnit(ServingUnit unit) {
        this.unit = unit;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodLog foodLog = (FoodLog) o;
        return id != null && id.equals(foodLog.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
