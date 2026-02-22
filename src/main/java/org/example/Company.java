package org.example;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor
    public Company(int id, String name, double giro, String[] developerNames) {

        this.id = id;
        this.name = name;

        if (giro < 0) {
            throw new IllegalArgumentException("Giro 0'dan küçük olamaz!");
        }
        this.giro = giro;

        this.developerNames = developerNames;
    }

    // addEmployee metodu
    public void addEmployee(int index, String name) {

        // Dizi null kontrolü
        if (developerNames == null) {
            System.out.println("Developer listesi tanımlı değil.");
            return;
        }

        // Index kontrolü
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index!");
            return;
        }

        // Slot boş mu?
        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Developer eklendi: " + name);
        } else {
            System.out.println("Bu index dolu: " + developerNames[index]);
        }
    }

    // Getter & Setter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro 0'dan küçük olamaz!");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", giro=").append(giro)
                .append(", developers=[");

        if (developerNames != null) {
            for (int i = 0; i < developerNames.length; i++) {
                sb.append(developerNames[i]);
                if (i < developerNames.length - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append("]}");
        return sb.toString();
    }
}
