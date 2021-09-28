package com.rudkin.restaurant_v2.global;

import com.rudkin.restaurant_v2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<Product>();
    }
}
