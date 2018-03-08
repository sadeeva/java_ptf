package first.lecture.point.sandbox;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import ru.stqa.pft.sandbox.Rectangle;
import ru.stqa.pft.sandbox.Square;

public class FirstLecture {

    public static void main(String[] args) {

        Point point1 = new Point(3, -4);
        Point point2 = new Point(6, 0);

        System.out.println("The distance between point1 (" + point1.x + " , " + point1.y + ")"
                + " and point2 (" + point2.x + " , " + point2.y + ") = " + Point.distance(point1, point2) );


    }


    }
