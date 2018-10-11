/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Nhozx
 */
//lop Shape la lop cha
public class Shape {
    protected String color = "red";
    protected boolean filled = true;
    // ham khoi tao khong co tham so
    public Shape(){}
    //ham khoi tao co tham so
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //cac ham setter getter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //ham toString in ra thong tin lop shape
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
}
