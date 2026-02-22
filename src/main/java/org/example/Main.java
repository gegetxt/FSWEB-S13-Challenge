package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        runApp();   // ✅ main içinden başka metod çağırımı
    }

    private static void runApp() {
        // ✅ 1) Her sınıftan en az 1 obje oluştur

        // Healthplan örneği (senin Healthplan constructorına göre)
        Healthplan hp1 = new Healthplan(1, "Starter Healthplan", Plan.BASIC);

        // Employee örneği (constructor: id, fullName, email, password, healthplans)
        String[] empPlans = new String[3];
        Employee e1 = new Employee(1, "Gizem Gündüz", "gizem@mail.com", "1234", empPlans);

        // Company örneği (constructor: id, name, giro, developerNames)
        String[] devs = new String[3];
        Company c1 = new Company(1, "GG Tech", 100000, devs);

        // ✅ 2) add metotlarını test et (isteğe bağlı ama iyi olur)
        e1.addHealthPlan(0, "BASIC");
        c1.addEmployee(0, "Gizem");

        // ✅ 3) Her obje için toString çağır ve ekrana yazdır
        System.out.println(hp1.toString());
        System.out.println(e1.toString());
        System.out.println(c1.toString());

        // ✅ 4) Encapsulation testi: giro negatif olamaz
        // Aşağıdaki satırı açarsan runtime’da exception beklenir (senin kontrolüne bağlı)
        // c1.setGiro(-10);
    }
}