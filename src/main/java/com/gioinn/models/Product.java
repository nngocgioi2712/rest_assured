package com.gioinn.models;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private int id;
    private String title;
    private String description;
    private int price;
    private double discount;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;
}
