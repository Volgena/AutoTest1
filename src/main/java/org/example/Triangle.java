package org.example;

import java.util.Scanner;

public  class Triangle {


    private enum TriangleTypes {
        EQUILATERAL_TRIANGLE("It is an equilateral triangle"),
        ISOSCELES_TRIANGLE("It is an isosceles triangle"),
        VERSATILE_TRIANGLE("It is a scalene triangle");

        String type;

        TriangleTypes(String type) {
            this.type = type;
        }
    }


    private int aNum;
    private int bNum;
    private int cNum;
    public Triangle(int aNum, int bNum, int cNum) {
        this.aNum = aNum;
        this.bNum = bNum;
        this.cNum = cNum;
    }


    public Triangle() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Value A: ");
        this.aNum = scanner.nextInt();
        System.out.println("Value B: ");
        this.bNum = scanner.nextInt();
        System.out.println("Value C: ");
        this.cNum = scanner.nextInt();
        System.out.println("One more time? Y/N: ");

    }

    public Boolean isPositive() {
        return aNum > 0 && bNum > 0 && cNum > 0;
    }

    public Boolean regularTriangle() {
        return aNum + bNum > cNum && aNum + cNum > bNum && bNum + cNum > aNum;
    }

    public Boolean equilateral() {
        return aNum == bNum && bNum == cNum;
    }

    public Boolean isosceles() {
        return aNum == bNum || bNum == cNum || aNum == cNum;
    }


    public void triangleType() {


   if (isPositive() && regularTriangle()) {
        if (equilateral()) {
            if (isosceles()) {
                System.out.println(TriangleTypes.ISOSCELES_TRIANGLE.type);
            } else System.out.println(TriangleTypes.VERSATILE_TRIANGLE.type);
        } else {
            System.out.println(TriangleTypes.EQUILATERAL_TRIANGLE.type);
        }
    } else System.out.println("It is a not triangle");


    }
}


      /*if (aNum != 0 && bNum != 0 && cNum != 0) {
            if (aNum + bNum > cNum && aNum + cNum > bNum && bNum + cNum > aNum) {
                isTriangle = true;
                System.out.println("It is a triangle!");
                if (aNum == bNum && bNum == cNum) {
                    triangleType = "Equilateral";
                    System.out.println("It is an equilateral triangle");
                } else if (aNum == bNum || bNum == cNum || aNum == cNum) {
                    triangleType = "Isosceles";
                    System.out.println("It is an isosceles triangle");
                } else {
                    System.out.println("It is a scalene triangle");
                }
            }
        }

        if (!isTriangle) {
            System.out.println("It is not a triangle");
        }

    }*/


