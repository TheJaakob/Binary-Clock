package de.jakobpaul.clock;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Date;

public class Controller {


    @FXML
    private Circle h10;
    @FXML
    private Circle h20;
    @FXML
    private Circle h1;
    @FXML
    private Circle h2;
    @FXML
    private Circle h4;
    @FXML
    private Circle h8;
    @FXML
    private Circle s10;
    @FXML
    private Circle s20;
    @FXML
    private Circle s40;
    @FXML
    private Circle s1;
    @FXML
    private Circle s2;
    @FXML
    private Circle s4;
    @FXML
    private Circle s8;
    @FXML
    private Circle m10;
    @FXML
    private Circle m20;
    @FXML
    private Circle m40;
    @FXML
    private Circle m1;
    @FXML
    private Circle m2;
    @FXML
    private Circle m4;
    @FXML
    private Circle m6;
    @FXML
    private Circle m8;


    public void setActive(String name) {
        if(name.equalsIgnoreCase("h10")){
            h10.setFill(Color.RED);
        } else if(name.equalsIgnoreCase("h20")){
            h20.setFill(Color.RED);
        } else if(name.equalsIgnoreCase("h1")){
            h1.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("h2")){
            h2.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("h4")){
            h4.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("h8")){
            h8.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m10")){
            m10.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m20")){
            m20.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m40")){
            m40.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m1")){
            m1.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m2")){
            m2.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m4")){
            m4.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("m8")){
            m8.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s10")){
            s10.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s20")){
            s20.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s40")){
            s40.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s1")){
            s1.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s2")){
            s2.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s4")){
            s4.setFill(Color.RED);

        } else if(name.equalsIgnoreCase("s8")){
            s8.setFill(Color.RED);

        }
    }

    public void setInActive(String name) {
        if(name.equalsIgnoreCase("h10")){
            h10.setFill(Color.rgb(30,144,255));
        } else if(name.equalsIgnoreCase("h20")){
            h20.setFill(Color.rgb(30,144,255));
        } else if(name.equalsIgnoreCase("h1")){
            h1.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("h2")){
            h2.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("h4")){
            h4.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("h8")){
            h8.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m10")){
            m10.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m20")){
            m20.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m40")){
            m40.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m1")){
            m1.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m2")){
            m2.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m4")){
            m4.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("m8")){
            m8.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s10")){
            s10.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s20")){
            s20.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s40")){
            s40.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s1")){
            s1.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s2")){
            s2.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s4")){
            s4.setFill(Color.rgb(30,144,255));

        } else if(name.equalsIgnoreCase("s8")){
            s8.setFill(Color.rgb(30,144,255));

        }
    }

}
