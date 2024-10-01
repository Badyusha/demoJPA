package by.bsuir.demo;

import javafx.fxml.FXMLLoader;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringFXMLLoader {

	private final ApplicationContext context;

	public SpringFXMLLoader(ApplicationContext context) {
		this.context = context;
	}

	public FXMLLoader load(String fxmlPath) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			@Override
			public Object call(Class<?> param) {
				return context.getBean(param);
			}
		});
		return loader;
	}
}

