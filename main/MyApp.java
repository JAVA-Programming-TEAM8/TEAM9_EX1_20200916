package main;
import base.Circle;

/**
 * main 메소드를 실행시키는 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.09.16)
 */
public class MyApp implements Circle
{
    public static void main(String[] args){
        Integer[] array;
        String data = "2, 3, 5, 2, 3, 10";
        array = makeToken(data);
        Circle c1 = makeCircle(array[0], array[1], array[2]);
        Circle c2 = makeCircle(array[3], array[4], array[5]);
        
        System.out.println("원1 : " + c1 + " ==> 면적 : " + c1.getArea());
        System.out.println("원1 : " + c2 + " ==> 면적 : " + c2.getArea());
        if(c1.equals(c2)) 
            System.out.println("같은원");
        else
            System.out.println("서로 다른 원");
            
    }
}
