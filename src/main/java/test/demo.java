package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    private String getIn(String in){
//        return in;
//    }

    public String getIn(String in){
        return in;
    }

    public int calculate(String expresseion){
        String[] ss = expresseion.split("\\+");
        System.out.println(Arrays.toString(ss));
        int sum = 0;
        for (String s : ss) {
            sum = sum + Integer.valueOf(s);
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("test");
        String[] ss = "1+2+3".split("\\+");
        System.out.println(Arrays.toString(ss));

    }

}
