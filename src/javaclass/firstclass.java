package javaclass;

import calculation.additionclass;

public class firstclass {
static int result;

    public static void main(String[] args) {
       // System.out.println("Hello world");
        firstclass fc = new firstclass();

        additionclass ac = new additionclass();
        result = ac.getaddition();
        System.out.println("result is: = "+result);

    }

}
