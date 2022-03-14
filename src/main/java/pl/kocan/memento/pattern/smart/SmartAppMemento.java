package pl.kocan.memento.pattern.smart;

public class SmartAppMemento {

    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
