package by.bsuir.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class HelloApplication extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() {
        context = SpringApplication.run(DemoApplication.class);
        // OR context = new SpringApplicationBuilder(DemoApplication.class).run();
    }

    @Override
    public void start(Stage primaryStage) {
        Parent fxmlLoader = SpringFXMLLoader.load(context, DemoApplication.class, "hello-view.fxml");
        Scene scene = new Scene(fxmlLoader, 320, 240);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() {
        context.close();
    }
}
