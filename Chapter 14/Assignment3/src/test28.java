import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout. Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage. Stage;
public class test28 extends Application {
        public void start (Stage primaryStage){
        Circle circ = new Circle(150, 120, 100);
        Rectangle rect = new Rectangle(50, 80, 200, 80);
        BorderPane pane = new BorderPane();
        HBox hbox = new HBox(10);
        Button btnCirc = new Button(" Draw Circle");
        Button btnRect = new Button("Draw Rectangle");
        hbox.setPadding(new Insets(10, 7, 10, 7));
        hbox.getChildren().addAll(btnCirc,btnRect);
        pane.setBottom(hbox);
        Pane drawPane = new Pane();
        pane.setTop(drawPane);
            btnCirc.setOnAction(e -> {
                drawPane.getChildren().clear();
                drawPane.getChildren().add(circ);
            });

            btnRect.setOnAction(e -> {
                drawPane.getChildren().clear();
                drawPane.getChildren().add(rect);
            });

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Draw shape");
        primaryStage.setScene(scene);
        primaryStage.show();
}

public static void main(String[] args) {
    launch(args);
}
}