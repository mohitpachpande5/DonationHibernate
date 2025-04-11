package model;

import jakarta.persistence.*;

@Entity
@Table(name = "donor")
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "don_id")
    private int donId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String mobileNumber;

    @Column(nullable = false)
    private String event;

    @Column(nullable = false)
    private double amount;

    public Donor() {}

    public Donor(String firstName, String lastName, String email, String mobileNumber, String event, double amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.event = event;
        this.amount = amount;
    }

    // Getters and setters
    public int getDonId() { return donId; }
    public void setDonId(int donId) { this.donId = donId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
    public String getEvent() { return event; }
    public void setEvent(String event) { this.event = event; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
