import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import java.text.DecimalFormat;
public class ModernArt extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane canvas = new Pane();
        for (int i = 0; i<50; i++){
        Rectangle Rec1 = randomRectangleGenerator();
            canvas.getChildren().add(Rec1);
        }
        Scene scene = new Scene(canvas, 600, 300);
        stage.setTitle("Modern Art"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
//   A Method that creates a random rectangle with random size, color, opacity
    public static Rectangle randomRectangleGenerator(){
        DecimalFormat df = new DecimalFormat("#.#");
        Rectangle sampleRec = new Rectangle(((Math.random() * 600)+ 0),((Math.random() * 300)+ 0), ((Math.random() * 90) + 10), ((Math.random() * 90) + 10));
        sampleRec.setFill(Color.color(
                Double.parseDouble(df.format(Math.random())),
                Double.parseDouble(df.format(Math.random())),
                Double.parseDouble(df.format(Math.random())),
                Double.parseDouble(df.format(Math.random()))
        ));
       return sampleRec;
    }
}
