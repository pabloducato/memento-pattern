package pl.kocan.memento.pattern.smart;

import java.util.ArrayList;
import java.util.List;

public class SmartApp {

    private Double version;
    private List<Double> doubleList = new ArrayList<>();

    public void setVersion(Double version) {
        this.version = version;
    }

    public List<Double> getDoubleList() {
        return doubleList;
    }

    public void setDoubleList(List<Double> doubleList) {
        this.doubleList = doubleList;
    }

    @Override
    public String toString() {
        return "SmartApp{" +
                "version=" + version +
                '}';
    }
}
