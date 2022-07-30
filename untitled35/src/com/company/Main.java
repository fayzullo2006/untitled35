package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        class calender {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Calendar cal = Calendar.getInstance();

                System.out.print("달력 연도를 입력해 주세요.(yyyy):");
                int year = sc.nextInt();
                System.out.print("달력 월을 입력해 주세요.(mm)");
                int month = sc.nextInt();
                sc.close();

                System.out.printf("[%d년 %d월]",year, month);
                System.out.println();
                System.out.println(" 얼  월   화   수   목   금   토");

                cal.set(Calendar.YEAR, year);
                cal.set(Calendar.MONTH, month);

                cal.set(year,month - 1,1);

                int endday = cal.getActualMaximum(Calendar.DATE);
                int dayofweek = cal.get(Calendar.DAY_OF_WEEK);

                for (int i = 1; i <= endday; i++) {
                    if (i == 1) {
                        for (int j = 1; j < dayofweek; j++) {
                            System.out.print("    ");
                        }
                    }
                    if (i < 10) {
                        System.out.print(" ");
                    }

                    System.out.print(" "+ i +" ");

                    if(dayofweek%7 == 0) {
                        System.out.println();
                    }
                    dayofweek++;

                }



            }
        }
    }
}
