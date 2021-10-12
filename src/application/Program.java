package application;

import entities.Courses;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Courses> set = new HashSet<>();

    Scanner sc = new Scanner(System.in);

        System.out.println("How many Students for course A:");
        int A = sc.nextInt();
        for (int i=0; i < A;i++){
            System.out.println("Code student " + (i+1) + ":" );
            int studentId = sc.nextInt();
            set.add(new Courses(studentId));
        }

        System.out.println("How many Students for course B:");
        int B = sc.nextInt();
        for (int i=0; i < B;i++){
            System.out.println("Code student " + (i+1) + ":" );
            int studentId = sc.nextInt();
            set.add(new Courses(studentId));
        }

        System.out.println("How many Students for course C:");
        int C = sc.nextInt();
        for (int i=0; i < C;i++){
            System.out.println("Code student " + (i+1) + ":" );
            int studentId = sc.nextInt();
            set.add(new Courses(studentId));
        }



        System.out.println("Total students:" + set.size());

    }
}
