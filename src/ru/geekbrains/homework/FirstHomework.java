package ru.geekbrains.homework;

import java.util.Scanner;

public class FirstHomework {
    public static void main(String[] args) {
        int myInt=48;
        byte myByte=1;
        short myShort=32000;
        long myLong=64000;
        boolean myBoolean=true;
        char myChar='Z';
        float myFloat=3;
        double myDouble=0.00001;
        /*__________________________________________________________________________________________________________*/
        int a =1;
        int b=2;//<---Здесь можно поменять значения для 3 задачи и проверить
        int c=6;
        int d=3;
        Task3(a,b,c,d);
        /*__________________________________________________________________________________________________________*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 2. Введите число"); //пробовал ввод сделать через сканер но что то пошло не так(
        int inputNumber = Scanner.Int();*/
        int x=10;//<---Здесь можно поменять значения для 4 задачи и проверить их
        int y=0;
        Task4(x,y);
        /*__________________________________________________________________________________________________________*/
        int Number=-20;//<---Здесь можно проверить 5 задачу
        Task5(Number);
        /*__________________________________________________________________________________________________________*/
        int J=-5;//<---Здесь можно проверить 6 задачу
        Task6(J);
        /*__________________________________________________________________________________________________________*/
        String name= "наставник";//<---Здесь можно поменять имя для 7-ой задачи
        Task7(name);
        /*__________________________________________________________________________________________________________*/
        int Year=2400;//<---Здесь можно поменять значение чтобы узнать високосный ли год или нет
        Task8(Year);
    }
    private static void Task3(int a, int b, int c, int d){ /*зачем в параметрах идея просит писать инты если
                                                                         если я обьявил их в мейне?*/
        int result=0;
        int formula=a * (b + (c / d));
        result=formula;
        System.out.println("Задача 3. "+result);
    }
    private static void Task4(int x, int y){
     boolean result;
     int sum;
     sum=x+y;
     if (sum>=10 & sum<=20){
         result=true;
         System.out.println("задача 4. "+result);
        }else{
         result=false;
         System.out.println("задача 4. "+result);}
    }
    private static void Task5(int Number){
       if (Number>=0){
           System.out.println("Задача 5. Число положительно");
       }else{
           System.out.println("Задача 5. число отрицательно");
       }
    }
    private static void Task6(int J){
     boolean result;
     if (J<0){
         result=true;
         System.out.println("Задача 6. "+result);
     }
    }
    private static void Task7(String name){
        System.out.println("Задача 7. Привет, "+name);
    }
    private static void Task8(int Year){
        if (Year % 4==0 & Year % 100!=0 | Year % 400==0) {
            System.out.println("Задача 8. Год високосный");
        }else{
            System.out.println("Задача 8. Год невисокосный");
        }
    }

}
