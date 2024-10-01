module by.bsuir.demo {
	requires javafx.controls;
	requires javafx.fxml;
	requires static lombok;
	requires jdk.jfr;
	requires jakarta.persistence;
	requires spring.data.commons;
	requires spring.context;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.core;


	opens by.bsuir.demo to javafx.fxml;
	exports by.bsuir.demo;
}