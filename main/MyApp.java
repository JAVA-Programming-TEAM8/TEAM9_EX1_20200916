package main;


/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Integer[] array;
        String data = "2, 3, 5, 2, 3, 10";
        array = makeToken(data);
        Circle c1 = makeCircle(array[0], array[1], array[2]);
        Circle c2 = makeCircle(array[3], array[4], array[5]);
        
        System.out.println("원1 : " + c1 + " ==> 면적 : " + c1.getArea());
        System.out.println("원1 : " + c2 + " ==> 면적 : " + c2.getArea());
        if() 
    }
}
