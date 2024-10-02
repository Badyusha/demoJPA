package by.bsuir.demo;

import by.bsuir.demo.entities.GroupRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloController {

    @Autowired
    private GroupRepository groupRepository;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println(groupRepository.findAll());
    }
}