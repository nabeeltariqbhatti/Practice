package com.company.ref.service;

import com.company.ref.annotations.Call;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/30/2022
 * @Time at 3:14 PM
 */

public class ProductService {

    private int x; // 1000


    private ProductService() {

    }
    @Call
    public void addProduct() {
        System.out.println("Adding product in the DB.");
    }

    @Call
    public void editingProduct() {
        System.out.println("Editing product in the DB.");
    }

    @Call
    public void printX() {
        System.out.println(x); // 1000
    }
}
