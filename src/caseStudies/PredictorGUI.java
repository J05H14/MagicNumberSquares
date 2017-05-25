package caseStudies;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PredictorGUI extends Application{

	HBox buttons = new HBox();
	@Override
	public void start(Stage primaryStage){
		try{
			BorderPane bp = new BorderPane();
			Scene sc = new Scene(bp);
			sc.getStylesheets().add("caseStudies/application.css");

			int setNumber = 1;

			Label instructions = new Label("Think of a Number Between 1-31.");
			Label question = new Label("Is Your Number here?");
			instructions.getStyleClass().add("text");
			question.getStyleClass().add("text");
			VBox top = new VBox(instructions, question);
			top.getStyleClass().add("question");

			Button yes = new Button("YES");
			Button no = new Button("NO");

			no.setMinWidth(150);
			yes.setMinWidth(150);

			yes.setOnAction(e -> {
				if(setNumber == 1){
					set2();
				}
				else if(setNumber == 2){
					set3();
				}
				System.out.println("TESTING");
			});

			buttons.getChildren().addAll(yes, no);
			buttons.getStyleClass().add("buttons");

			bp.setTop(top);
			bp.setCenter(set1());
			bp.setBottom(buttons);

			primaryStage.setScene(sc);
			primaryStage.setTitle("Number Guesser");
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
				number = color(number, row + col, 1);
				set1.add(number, col, row);
				num += 2;
			}

		}
		return set1;
	}

	public void set2(){
		int[] set2Numbers = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19 ,22, 23, 26, 27, 30, 31};
		GridPane set2 = new GridPane();

		for(int row = 0, count = 0; row < 4; row++){
			for(int col = 0; col < 4; col++){
				int num = set2Numbers[count];
				Label number = new Label(num + "");
				number = color(number, row + col, 2);
				set2.add(number, col, row);
				count++;
			}
		}
		secondaryStage(set2);
	}
	public void set3(){
		int[] set3Numbers = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
		GridPane set3 = new GridPane();
		
		for(int row = 0, count = 0; row < 4; row++){
			for(int col = 0; col < 4; col++){
				int num = set3Numbers[count];
				Label number = new Label (num + "");
				number = color(number, row + col, 3);
				set3.add(number, col, row);
				count++;
			}
		}
		
		secondaryStage(set3);
	}

	public void secondaryStage(GridPane gp){
		Stage stage = new Stage();
		BorderPane bp = new BorderPane();
		Scene sc = new Scene(bp);
		sc.getStylesheets().add("caseStudies/application.css");

		Label question = new Label("How About Here?");
		question.getStyleClass().add("text");
		HBox top = new HBox(question);
		top.getStyleClass().add("question");

		bp.setTop(top);
		bp.setCenter(gp);

		stage.setScene(sc);
		stage.show();
	}

	private Label color(Label label, int num, int set){
		if(set == 1){
			if(num % 2 == 0){
				label.getStyleClass().add("even1");
			}
			else{
				label.getStyleClass().add("odd1");
			}
		}
		else if(set == 2){
			if(num % 2 == 0){
				label.getStyleClass().add("even2");
			}
			else{
				label.getStyleClass().add("odd2");
			}
		}
		label.setAlignment(Pos.CENTER);
		label.setPrefHeight(75);
		label.setPrefWidth(100);
		return label;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
