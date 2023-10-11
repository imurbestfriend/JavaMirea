package fourthPrac.one;

import fourthPrac.one.one;

public class two {

    public void processEnumValue(one.seasons value) {
        switch (value) {
            case winter:
                System.out.println("I love " + one.seasons.winter);
                break;
            case spring:
                System.out.println("I love " + one.seasons.spring);
                break;
            case summer:
                System.out.println("I love " + one.seasons.summer);
                break;
            default:
                System.out.println("I love " + one.seasons.autumn);
                break;
        }

    }



}
