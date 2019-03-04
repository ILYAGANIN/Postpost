package ru.mera.ganin;

public class ICF {
    public static void main(String args[]){
        int a = 1632;
        int b = -80;
        if(a < 0 || b < 0){
            System.out.println("Есть  отрицательное число");
        }
        if(b != 0){
            System.out.println("Результат деления:" + a%b);
        }
        if(a > b){
            System.out.println("Первое число больше второго");
        }else if( b > a){
            System.out.println("Второе число больше первого");
        }
        String odd_even = (a%2==0) ? "Число a - четное" : "Число a - нечетное";
        System.out.println(odd_even);
    }
}

