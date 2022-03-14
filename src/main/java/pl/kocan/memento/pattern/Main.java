package pl.kocan.memento.pattern;

import pl.kocan.memento.pattern.smart.SmartApp;
import pl.kocan.memento.pattern.smart.SmartAppCaretaker;

public class Main {

    public static void main(String[] args) {

        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();

        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);
        smartApp.changeVersion(1.4);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCaretaker.getMemento(0));

    }
}
