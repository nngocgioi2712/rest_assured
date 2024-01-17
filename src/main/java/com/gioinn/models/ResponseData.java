package com.gioinn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseData {
    //private int id;
    private String title;
    /*private String description;
    private int price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;*/
}
