package base;


/**
 * 3개의 속성을 가지는 Circle 클래스
 * 
 * @author (2019315020 오성빈,2018210032 김태영) 
 * @version (2020.09.16)
 */
public class Circle
{
    int x;
    int y;
    int radius;
    
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if (x == c.x && y == c.y)
            return true;
        else
            return false;
    }
}
