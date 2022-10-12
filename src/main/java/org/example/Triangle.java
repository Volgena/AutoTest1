package org.example;

public class Triangle {
    public static boolean isTriangle = false;
    public static String triangleType = "scalene";
    public static boolean checkTriangle(int aNum, int bNum, int cNum) {
        if (aNum != 0 && bNum!= 0 && cNum != 0) {
            if(aNum+bNum> cNum && aNum + cNum > bNum && bNum + cNum > aNum) {
                isTriangle = true;
                System.out.println("It is a triangle!");
                if(aNum == bNum && bNum == cNum) {
                    triangleType = "Equilateral";
                    System.out.println("It is an equilateral triangle");
                } else if (aNum == bNum||bNum == cNum || aNum == cNum) {
                    triangleType = "Isosceles";
                    System.out.println("It is an isosceles triangle");
                }else {
                    System.out.println("It is a scalene triangle");
                }
            }
        }

        if(!isTriangle) {
            System.out.println("It is not a triangle");
        }

        return isTriangle;
    }
}