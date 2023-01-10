package day08nestedifternary;

import java.util.Scanner;

public class NestedIfExercises {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Cisiyetinizi giriniz.");
        String gender =input.next();
        System.out.println("yaşınızı giriniz");
        int age=input.nextInt();
        System.out.println("eğitim Durumunuzu giriniz");
        String education=input.next();
        if(education=="lise"){
            System.out.println("çalış");
        }else
            System.out.println("çalışma");
        if(gender.equalsIgnoreCase("kadın")){
            if (age>60){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("çalışmalı");

            }
        } else if (gender.equalsIgnoreCase("erkek")) {
          if(age>65){
              System.out.println("emekli olabilir");
          }else{
              System.out.println("çalışmalı");
          }
        }


    }



    }

