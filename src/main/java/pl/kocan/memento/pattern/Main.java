package pl.kocan.memento.pattern;

import pl.kocan.memento.pattern.smart.SmartApp;

public class Main {

    public static void main(String[] args) {

        SmartApp smartApp = new SmartApp();

        smartApp.setVersion(1.0);

        System.out.println(smartApp);

        smartApp.setVersion(1.1);

        System.out.println(smartApp);

        smartApp.getDoubleList().add(1.1);

        smartApp.setVersion(1.2);

        System.out.println(smartApp);

        smartApp.setVersion(2.0);

        System.out.println(smartApp);

        smartApp.setVersion(smartApp.getDoubleList().get(0));

        System.out.println(smartApp);
    }
}
