package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label enemyHP;
    @FXML
    private Slider slider;
    @FXML
    private TextField tf;
    private Player enemy;

    @FXML
    public void initialize() {
        enemy = new Player();
        enemyHP.textProperty().bind(enemy.getHPProperty().asString());
        tf.textProperty().bind(slider.valueProperty().asString());
    }

    public void performKick() {
        int force = (int) slider.getValue();
        //enemyHP.setText(Integer.parseInt(enemyHP.getText()) - (int) slider.getValue() + "");
        enemy.decHP(force);
    }
}
