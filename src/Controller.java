import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private TextField f;

    @FXML
    private Label test;

    @FXML
    private ListView<String> list;

    @FXML
    void onC() {
        String m=f.getText();

        if(!list.getItems().contains(m)){
            list.getItems().add(m);
        }

    }
}
