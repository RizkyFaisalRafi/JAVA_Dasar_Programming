package com.tutorial;

public class Main {
    // Looping bersarang = ada looping didalam looping
    public static void main(String[] args) {
//        for(int i = 0; i <= 3; i++){
//            for (int j = 0; j <= 3; j++){
//                System.out.println("*");
//            }
//            System.out.println("\n");
//        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("* ");
                if(i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print("* ");
                if(i + j == 9){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println();

        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 10){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
