package com.example.springprojeck.customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name = "customer")public class Customer {
    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int ID;
    private String name;
    private String email;
    private int age;
}