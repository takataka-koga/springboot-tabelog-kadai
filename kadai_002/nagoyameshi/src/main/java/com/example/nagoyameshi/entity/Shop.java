package com.example.nagoyameshi.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "shops")
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "description")
    private String description;

    @Column(name = "price_min")
    private Integer price_min;
    
    @Column(name = "price_max")
    private Integer price_max;

    @Column(name = "open_time")
    private String open_time;
    
    @Column(name = "close_time")
    private String close_time;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;
    
    @Column(name = "rest_day")
    private String rest_day;

    @Column(name = "created.at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "update_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
}
