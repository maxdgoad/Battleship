

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.image.Image;


/*

Battleship!

KU EECS 448 project 1

Team Name:
Poor Yorick

Team members:
Max Goad
Jace Bayless
Tri Pham
Apurva Rai
Meet Kapadia
*/

//This class serves as a the executive class of Battleship as well as making basic gui elements.

public class BattleshipGUI extends Application {

    private static Stage stage1;
    private static Font font1;

    /*
     * @ pre none
     *	@ param array of strings
     *	@ post launches the file/specific part of the program
     * @ return none
     */
    public static void main(String[] args) {
        launch(args);
    }

    /*
     * @ pre none
     *	@ param Stage windom
     *	@ post starts the stage
     * @ return none
     */
    @Override
    public void start(Stage primaryStage) {

        stage1 = primaryStage;
        stage1.setTitle("Battleship!");

        font1 = new Font("Georgia", 20);

        stage1.getIcons().add(new Image(getClass().getResourceAsStream("icon.jpg")));
        //https://media.istockphoto.com/vectors/aircraft-carrier-transportation-cartoon-character-side-view-vector-vector-id981633486


        stage1.setScene(new MenuScene(stage1, font1).getScene());
        stage1.show();
        stage1.setAlwaysOnTop(false);

    }

    /*
     * @ pre first scene to be over/done being interacted with
     *	@ param the next scene and the max size of the screen
     *	@ post sets the next scene
     * @ return none
     */
    public static void nextScene(Scene next, int max) {


        stage1.setScene(next);
        //stage1.setMaxHeight(max*300);
        //stage1.setMaxWidth(max*300);
        //stage1.setMinHeight(100);
        //stage1.setMinWidth(100);

    }

    /*
     * @ pre none
     *	@ param none
     *	@ post gets the next stage
     * @ return returns stage
     */
    public static Stage getStage() {
        return stage1;
    }

    /*
     * @ pre none
     *	@ param a string thats going to be a title
     *	@ post changes the title
     * @ return none
     */
    public void changeTitle(String title) {
        stage1.setTitle(title);
    }

    /*
     * @ pre none
     *	@ param none
     *	@ post gets the font
     * @ return returns the font
     */
    public static Font getFont() {
        return font1;
    }

}
