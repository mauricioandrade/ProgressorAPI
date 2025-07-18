package com.example.ProgressorAPI.domain;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "body_measurements")
public class BodyMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "measurement_date", nullable = false)
    private LocalDate measurementDate;


    @Column(name = "weight_kg")
    private Double weight;

    @Column(name = "body_fat_percentage")
    private Double bodyFatPercentage;


    @Column(name = "chest")
    private Double chest;

    @Column(name = "abdomen")
    private Double abdomen;

    @Column(name = "waist")
    private Double waist;

    @Column(name = "hips")
    private Double hips;

    @Column(name = "right_arm")
    private Double rightArm;

    @Column(name = "left_arm")
    private Double leftArm;

    @Column(name = "right_thigh")
    private Double rightThigh;

    @Column(name = "left_thigh")
    private Double leftThigh;

    @Column(name = "right_calf")
    private Double rightCalf;

    @Column(name = "left_calf")
    private Double leftCalf;



    public BodyMeasurement() {
    }


    public BodyMeasurement(User user, LocalDate measurementDate, Double weight, Double bodyFatPercentage, Double chest, Double abdomen, Double waist, Double hips, Double rightArm, Double leftArm, Double rightThigh, Double leftThigh, Double rightCalf, Double leftCalf) {
        this.user = user;
        this.measurementDate = measurementDate;
        this.weight = weight;
        this.bodyFatPercentage = bodyFatPercentage;
        this.chest = chest;
        this.abdomen = abdomen;
        this.waist = waist;
        this.hips = hips;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.rightThigh = rightThigh;
        this.leftThigh = leftThigh;
        this.rightCalf = rightCalf;
        this.leftCalf = leftCalf;
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

    public LocalDate getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(LocalDate measurementDate) {
        this.measurementDate = measurementDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(Double abdomen) {
        this.abdomen = abdomen;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getHips() {
        return hips;
    }

    public void setHips(Double hips) {
        this.hips = hips;
    }

    public Double getRightArm() {
        return rightArm;
    }

    public void setRightArm(Double rightArm) {
        this.rightArm = rightArm;
    }

    public Double getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Double leftArm) {
        this.leftArm = leftArm;
    }

    public Double getRightThigh() {
        return rightThigh;
    }

    public void setRightThigh(Double rightThigh) {
        this.rightThigh = rightThigh;
    }

    public Double getLeftThigh() {
        return leftThigh;
    }

    public void setLeftThigh(Double leftThigh) {
        this.leftThigh = leftThigh;
    }

    public Double getRightCalf() {
        return rightCalf;
    }

    public void setRightCalf(Double rightCalf) {
        this.rightCalf = rightCalf;
    }

    public Double getLeftCalf() {
        return leftCalf;
    }

    public void setLeftCalf(Double leftCalf) {
        this.leftCalf = leftCalf;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyMeasurement that = (BodyMeasurement) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
