package caseStudies;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PredictorGUI extends Application{

	@Override
	public void start(Stage primaryStage){
		try{
			BorderPane bp = new BorderPane();
			Scene sc = new Scene(bp);
			sc.getStylesheets().add("caseStudies/application.css");

			GridPane gp = set1();

			bp.setCenter(gp);

			primaryStage.setScene(sc);
			primaryStage.show();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public GridPane set1(){
		GridPane set1 = new GridPane();
		Label number;
		int num = 1;

		for(int row = 0; row < 4; row ++){

			for(int col = 0; col < 4; col++){
				number = new Label (num + "");
				if((row + col) % 2 != 0){
					number.getStyleClass().add("odd");
				}
				else{
					number.getStyleClass().add("even");
				}
				number.setAlignment(Pos.CENTER);
				number.setPrefHeight(75);
				number.setPrefWidth(100);

				set1.add(number, col, row);
				num += 2;
			}

		}

		return set1;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
