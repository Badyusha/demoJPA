//package by.bsuir.demo;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//	@Override
//	public void start(Stage stage) throws IOException {
//		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//		Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//		stage.setTitle("Hello!");
//		stage.setScene(scene);
//		stage.show();
//	}
//
//	public static void main(String[] args) {
//		launch();
//	}
//}

package by.bsuir.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@SpringBootApplication
public class HelloApplication extends Application {

	private ConfigurableApplicationContext context;

	@Override
	public void init() {
		context = SpringApplication.run(HelloApplication.class);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SpringFXMLLoader loader = context.getBean(SpringFXMLLoader.class);
		VBox root = loader.load("hello-view.fxml").load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() {
		context.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
