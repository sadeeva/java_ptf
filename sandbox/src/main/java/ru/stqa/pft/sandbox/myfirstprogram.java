package ru.stqa.pft.sandbox;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class Myfirstprogram {

    public static void main(String[] args) {
        hello("World");
        hello("User");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s) );

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоyгольника со сторонами " + r.a + " и " + r.b + " = " + area(r) );

    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }

    public static double area(Square s) {
        return s.l * s.l;

    }

    public static double area ( Rectangle r) {
        return r.a * r.b;
    }


}
