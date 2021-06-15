package com.piqotech.cryotos.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inp = sc.nextLine();
        String[] split = inp.split("");
        int mid = split.length / 2;
        List<String> res = new ArrayList<>();
        for (int i = mid; i < split.length; i++) {
            res.add(split[i]);
            for (String op : res)
                System.out.print(op);
            System.out.println();
        }
        for (int i = 0; i < mid; i++) {
            res.add(split[i]);
            for (String fs : res)
                System.out.print(fs);
            System.out.println();
        }


    }


}
