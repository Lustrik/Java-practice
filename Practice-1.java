//С некоторого момента прошло 234 дня.
//Сколько полных недель прошло за этот период?
//А месяцев?

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 234;
      int b = a/7;
      int c = a/30;
      System.out.printf("Прошло %d недель\n", b);
      System.out.printf("Прошло %d месяцев\n", c);
  }
}

//Дано двузначное число 39. Найти:
//a. число десятков в нем;
//b. число единиц в нем;
//c. сумму его цифр;
//d. произведение его цифр.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 39;
      int b = a/10;
      int c = a%10;
      
      System.out.printf("В числе 39 %d десятков\n", b);
      System.out.printf("В числе 39 %d единиц\n", c);
      System.out.println("Сумма цифр =" + (b+c));
      System.out.println("Произведение цифр =" + (b*c));
  }
}

//Найти длину окружности радиуса 4

import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      double radius = 4;
      
      double C = 2 * Math.PI * radius;
      
      System.out.println(C);
  }
}


//Известно значение температуры по шкале Цельсия 36,6. Найти соответствующее значение температуры по шкале:
//1. Фаренгейта;
//2. Кельвина.
//Для пересчета по шкале Фаренгейта необходимо исходное значение температуры умножить на 1,8 и к результату прибавить 32, а по шкале Кельвина абсолютное значение нуля соответствует 273,15 градуса по шкале Цельсия.

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      double Celc = in.nextDouble();
      double Far = Celc*1.8 + 32;
      double Kel = Celc + 273.15;
      System.out.printf("Температура по Цельсию = %.1f градусов,\nтемпература по Фаренгейту = %.2f градусов,\nтемпература по Кельвину = %.2f градусов.", Celc, Far, Kel);
    }
}

//Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a = -50;
      int b = -30;
      
      System.out.printf("a = %d, b = %d\n", a, b);
      
      System.out.println("Думаю...");
      
      if(Math.abs(a) > Math.abs(b)) 
      {
        a = a / 2;
      }
      
      System.out.printf("a = %d, b = %d\n", a, b);
  }
}

//Дано трехзначное число. Найти:
//- число единиц в нем;
//- число десятков в нем;
//- сумму его цифр;
//- произведение его цифр.

import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      
      int number = 173;
      
      int e = number % 10;
      int d = number / 10 % 10;
      int s = number / 100;
      
      // System.out.println(number + " = " + s + " x 100 + " + d + " x 10 + " + e);
      System.out.printf("%d = %d x 100 + %d x 10 + %d\n", number, s, d, e);
      
      System.out.println("Сумма цифр числа " + number + " равна " + (s + e + d));
      System.out.println("Произведение цифр числа " + number + " равно " + (s * e * d));
  }
}

//Дано натуральное число. Определить:
//1. является ли оно четным;
//2. оканчивается ли оно цифрой 7

import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 2353;
      
      boolean isEven = (number % 2 == 0);
      boolean isEndedBySeven = (number % 10 == 7);
      
      System.out.println("Оканчивается ли на 7? " + isEndedBySeven);
      System.out.println("Четно ли число? " + isEven);
  }
}

