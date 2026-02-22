package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    // Constructor
    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    // Healthplan ekleme metodu
    public void addHealthPlan(int index, String name) {

        // 1️⃣ Dizi null mı?
        if (healthPlans == null) {
            System.out.println("Healthplans dizisi tanımlı değil (null).");
            return;
        }

        // 2️⃣ Index geçerli mi?
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index!");
            return;
        }

        // 3️⃣ Name geçerli mi?
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Geçersiz healthplan ismi!");
            return;
        }

        // 4️⃣ Slot boş mu?
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Healthplan eklendi: " + name);
        } else {
            System.out.println("Bu index dolu: " + index + " -> " + healthPlans[index]);
        }
    }

    // Getter & Setter

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
