package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.Scene;
//import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz= null;
//		raiz = new TesteAnchorPane();
//		raiz = new TesteBorderPane();
//		raiz = new TesteFlowPane();
//		raiz = new TesteGridPane();
//		raiz = new TesteStackPane();
		raiz = new testeTilePane();
		
		
		
//		Scene principal = new Scene(new TesteAnchorPane(), 800,600);
		Scene principal = new Scene(raiz, 800,600);
		
//		VBox temp = new VBox();
//		
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
		
//		temp.getChildren().add(new Caixa().comTexto("1"));
//		temp.getChildren().add(new Caixa().comTexto("2"));
//		temp.getChildren().add(new Caixa().comTexto("3"));
//		temp.getChildren().add(new Caixa().comTexto("4"));
//		temp.getChildren().add(new Caixa().comTexto("5"));
//		temp.getChildren().add(new Caixa().comTexto("6"));
//		temp.getChildren().add(new Caixa().comTexto("7"));
		
//		Scene principal = new Scene(temp, 800,600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciador de Layout");
		primaryStage.show();
		
		}

	public static void main(String[] args) {
		launch(args);
	}
}
