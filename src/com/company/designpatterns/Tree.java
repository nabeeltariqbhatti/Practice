package com.company.designpatterns;

import java.math.BigDecimal;
import java.util.Locale;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 11:28 PM
 */
public abstract  class Tree <E>{
    public interface Visitor<E,R>{

        public R leaf(E elt);
        public R branch(R left, R right);
    }
    public abstract <R> R visit(Visitor<E,R>v);
    public static <T> Tree<T> leaf (final T e){
        return new Tree<T>() {
            @Override
            public <R> R visit(Visitor<T, R> v) {
                return v.leaf(e);
            }
        };
    }
    public static <T> Tree<T> branch (final Tree<T>l,final Tree<T>r){
        return new Tree<T>() {
            @Override
            public <R> R visit(Visitor<T, R> v) {
                return v.branch(l.visit(v),r.visit(v));
            }
        };
    }


}

class Main{
    public static void main(String[] args) {

        Product build = new Product.Builder().name("Apple").color("red").price(BigDecimal.valueOf(23)).build();


        System.out.println(build);

    }
}
