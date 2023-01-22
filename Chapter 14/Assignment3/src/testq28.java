import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class testq28 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox(5); // 5 is the spacing between elements
        hbox.getChildren().addAll(new PaneOne(), new PaneTwo());
        Scene scene = new Scene(hbox, 600, 300);
        primaryStage.setTitle("Drawings");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
  class PaneOne extends Pane {
      public PaneOne() {
          Line line1 = new Line(10, 10, 290, 290);
          Line line2 = new Line(10, 290, 290, 10);
          getChildren().addAll(line1, line2);
      }
  }
    class PaneTwo extends Pane {
    public PaneTwo() {
    double centerX = 150;
    double centerY  = 150;
    double radius = 135;
    Circle c = new Circle(centerX, centerY, radius);
    Arc a1 = new Arc(centerX, centerY, radius, radius, 0, 180);
    a1.setType(ArcType.ROUND);
    c.setStroke(Color.BLACK);
    c.setFill(Color.WHITE);
    getChildren().addAll(c,a1);
}
  }