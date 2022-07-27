package com.tutorial;

public class Main {
    public static void main(String[] args) {
        String [][]mhs={{"01","Rizky Faisal Rafi","Tangerang"},{"02","Septy Wijayanti","Surabaya"},{"03","Verry Sulistyawan","Jakarta"}};
        // get value of elements
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(mhs[i][j]);
            }
            System.out.println();
        }
    }
}