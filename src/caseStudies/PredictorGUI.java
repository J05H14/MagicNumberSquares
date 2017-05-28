package caseStudies;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PredictorGUI extends Application{

	int result = 0;
	@Override
	public void start(Stage primaryStage){
		try{
			BorderPane bp = new BorderPane();
			Scene sc = new Scene(bp);
			sc.getStylesheets().add("caseStudies/application.css");



			Label instructions = new Label("Think of a Number Between 1-31.");
			Label question = new Label("Is Your Number here?");
			instructions.getStyleClass().add("text");
			question.getStyleClass().add("text");
			VBox top = new VBox(instructions, question);
			top.getStyleClass().add("question");



			bp.setTop(top);
			bp.setCenter(set1());
			bp.setBottom(buttonBox(1));

			primaryStage.setScene(sc);
			primaryStage.setTitle("Number Guesser");
			primaryStage.show();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public HBox buttonBox(int setNum){
		HBox buttons = new HBox();
		Button yes = new Button("YES");
		Button no = new Button("NO");

		no.setMinWidth(150);
		yes.setMinWidth(150);

		yes.setOnAction(e -> {
			if(setNum == 1){
				set2();
				result += 1;
			}
			else if(setNum == 2){
				set3();
				result +=2;
			}
			else if(setNum == 3){
				set4();
				result +=4;
			}
			else if(setNum == 4){
				set5();
				result +=8;
			}
			else if(setNum == 5){
				result +=16;
				resultStage();
			}
			System.out.println(result);
		});
		no.setOnAction(e -> {
			if(setNum == 1){
				set2();
			}
			else if(setNum == 2){
				set3();
			}
			else if(setNum == 3){
				set4();
			}
			else if(setNum == 4){
				set5();
			}
			else if(setNum == 5){
				resultStage();
			}
		});

		buttons.getChildren().addAll(yes, no);
		buttons.getStyleClass().add("buttons");

		return buttons;
	}
	public void resultStage(){
		Stage rStage = new Stage();
		BorderPane bp = new BorderPane();
		Scene sc = new Scene(bp);
		sc.getStylesheets().add("caseStudies/application.css");
		
		Image image = new Image("file:image/fortune.png");
		ImageView iv = new ImageView(image);
		iv.setPreserveRatio(true);
		iv.setFitHeight(400);
		
		Label beginning = new Label("Your number is...");
		beginning.getStyleClass().add("text");
		HBox top = new HBox(beginning);
		top.getStyleClass().add("ansText");
		
		Label answer = new Label(result + "");
		answer.getStyleClass().add("text");
		HBox res = new HBox(answer);
		res.getStyleClass().add("ans");
		
		bp.setTop(top);
		bp.setCenter(iv);
		bp.setBottom(res);
		
		rStage.setScene(sc);
		rStage.setTitle("Number Fortune Teller");
		rStage.show();
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
		secondaryStage(set2, 2);
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

		secondaryStage(set3, 3);
	}
	public void set4(){
		int[] set4Numbers = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
		GridPane set4 = new GridPane();
		
		for(int row = 0, count = 0; row < 4; row++){
			for(int col = 0; col < 4; col++){
				int num = set4Numbers[count];
				Label number = new Label (num + "");
				number = color(number, row + col, 4);
				set4.add(number, col, row);
				count++;
			}
		}
		
		secondaryStage(set4, 4);
	}
	public void set5(){
		int[] set5Numbers = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
		GridPane set5 = new GridPane();
		
		for(int row = 0, count = 0; row < 4; row++){
			for(int col = 0; col < 4; col++){
				int num = set5Numbers[count];
				Label number = new Label(num + "");
				number = color(number, col + row, 5);
				set5.add(number, col, row);
				count++;
			}
		}
		
		secondaryStage(set5, 5);
	}

	public void secondaryStage(GridPane gp, int setNum){
		Stage stage = new Stage();
		BorderPane bp = new BorderPane();
		Scene sc = new Scene(bp);
		sc.getStylesheets().add("caseStudies/application.css");

		Label instructions = new Label("Think of a Number Between 1-31.");
		Label question = new Label("How About Here?");
		question.getStyleClass().add("text");
		instructions.getStyleClass().add("text");
		VBox top = new VBox(instructions, question);
		top.getStyleClass().add("question");

		bp.setTop(top);
		bp.setCenter(gp);
		bp.setBottom(buttonBox(setNum));

		stage.setScene(sc);
		stage.setTitle("Number Guesser");
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
		else if(set == 3){
			if(num % 2 == 0){
				label.getStyleClass().add("even3");
			}
			else{
				label.getStyleClass().add("odd3");
			}
		}
		else if(set == 4){
			if(num % 2 == 0){
				label.getStyleClass().add("even4");
			}
			else{
				label.getStyleClass().add("odd4");
			}
		}
		else if(set == 5){
			if(num % 2 == 0){
				label.getStyleClass().add("even5");
			}
			else{
				label.getStyleClass().add("odd5");
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
