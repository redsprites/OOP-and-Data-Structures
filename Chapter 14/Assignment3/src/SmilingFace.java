import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
public class SmilingFace extends Application  {
    @Override
    public void start(Stage stage) throws Exception {
//        create eyes
        Ellipse lEyeOut = new Ellipse(125,100,40,20);
        Ellipse rEyeOut = new Ellipse(275,100,40,20);
        Circle lEyeIn = new Circle (125,100,15);
        Circle rEyeIn = new Circle (275,100,15);
//        change eye fill color
        lEyeOut.setFill(Color.WHITE);
        rEyeOut.setFill(Color.WHITE);
        lEyeOut.setStroke(Color.BLACK);
        rEyeOut.setStroke(Color.BLACK);
//        create a nose
        Polygon nose = new Polygon(200,150,150,225,250,225,200,150);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);
//        create a mouth
        Arc mouth =  new Arc(200, 225, 100, 90, -165, 150);
            mouth.setFill(Color.WHITE);
            mouth.setType(ArcType.OPEN);
            mouth.setStroke(Color.BLACK);
//        create face
        Circle face = new Circle(200,200,190);
        face.setStroke(Color.BLACK);
        face.setFill(Color.WHITE);
    Pane lPane = new Pane(face,lEyeOut,rEyeOut,lEyeIn,rEyeIn,nose,mouth);
    Scene scene = new Scene(lPane, 400, 400);
    stage.setTitle("Smiling Face"); // Set the stage title
    stage.setScene(scene); // Place the scene in the stage
    stage.show(); // Display the stage
    }
 }
