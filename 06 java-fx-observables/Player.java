package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Player {
    private StringProperty name;
    private IntegerProperty hp;

    public IntegerProperty getHPProperty() {
        return hp;
    }

    public Player() {
        name = new SimpleStringProperty();
        name.set("Eldar");
        hp = new SimpleIntegerProperty(100);
    }

    public void decHP(int force) {
        hp.set(hp.get() - force);
    }
}
