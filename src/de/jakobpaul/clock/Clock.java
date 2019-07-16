package de.jakobpaul.clock;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends Application {

    private Controller ctrl;

    public static void main(String args[]) throws Exception {
        System.out.println("Hello World");
        Application.launch(args);
    }

    @Override
    public void init() {
        /*Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            int second = LocalDateTime.now().getSecond();
            int minute = LocalDateTime.now().getMinute();
            int hour = LocalDateTime.now().getHour();
            String sec = String.valueOf(second);
            String min = String.valueOf(minute);
            String hours = String.valueOf(hour);
            if(second < 10) sec = "0" + second;
            if (minute < 10) min = "0" + min;
            if (hour < 10) hours = "0" + hour;
            splitSecond(sec);
            splitMinute(min);
            splitHour(hours);
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();*/

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Binäre Uhr");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        /**
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.getChildren().add(timeLabel);
        root.getChildren().add(hourLabel);
        root.getChildren().add(minuteLabel);
        root.getChildren().add(secondLabel);
        **/
        ctrl = loader.getController();
        Scene scene = new Scene(root, 800, 450);

        primaryStage.setScene(scene);

        primaryStage.show();

        Timer timer = new Timer();
        timer.schedule(new TimerTask()  {
            @Override
            public void run() {
                setAllInActive();
                setTime();
                System.out.println(LocalDateTime.now().getSecond());
            }
        },1000, 1000);

    }

    private void setTime() {
            int second = LocalDateTime.now().getSecond();
            int minute = LocalDateTime.now().getMinute();
            int hour = LocalDateTime.now().getHour();
            String sec = String.valueOf(second);
            String min = String.valueOf(minute);
            String hours = String.valueOf(hour);
            if(second < 10) sec = "0" + second;
            if (minute < 10) min = "0" + min;
            if (hour < 10) hours = "0" + hour;
            splitSecond(sec);
            splitMinute(min);
            splitHour(hours);

    }
    
    private void splitHour(String hour) {
        String[] time = hour.split("");
        String[] TimeSplit = hour.split("");
        int i1 = Integer.valueOf(TimeSplit[0]);
        int i2 = Integer.valueOf(TimeSplit[1]);
        if(i1 == 1) ctrl.setActive("h10");
        if(i1 == 2) ctrl.setActive("h20");
        if(i1 == 3) {ctrl.setActive("h10"); ctrl.setActive("h20");}
        if(i1 == 4) ctrl.setActive("h40");
        if(i1 == 5) {ctrl.setActive("h10"); ctrl.setActive("h40");}
        if(i1 == 6) {ctrl.setActive("h20"); ctrl.setActive("h40");}
        if(i2 == 1) ctrl.setActive("h1");
        if(i2 == 2) ctrl.setActive("h2");
        if(i2 == 3) {ctrl.setActive("h1"); ctrl.setActive("h2");}
        if(i2 == 4) ctrl.setActive("h4");
        if(i2 == 5) {ctrl.setActive("h1"); ctrl.setActive("h4");}
        if(i2 == 6) {ctrl.setActive("h2"); ctrl.setActive("h4");}
        if(i2 == 7) {ctrl.setActive("h1"); ctrl.setActive("h2"); ctrl.setActive("h4");}
        if(i2 == 8) ctrl.setActive("h8");
        if(i2 == 9) {ctrl.setActive("h1"); ctrl.setActive("h8");}
    }

    private void splitMinute(String min) {
        String[] time = min.split("");
        String[] TimeSplit = min.split("");
        int i1 = Integer.valueOf(TimeSplit[0]);
        int i2 = Integer.valueOf(TimeSplit[1]);
        if(i1 == 1) ctrl.setActive("m10");
        if(i1 == 2) ctrl.setActive("m20");
        if(i1 == 3) {ctrl.setActive("m10"); ctrl.setActive("m20");}
        if(i1 == 4) ctrl.setActive("m40");
        if(i1 == 5) {ctrl.setActive("m10"); ctrl.setActive("m40");}
        if(i1 == 6) {ctrl.setActive("m20"); ctrl.setActive("m40");}
        if(i2 == 1) ctrl.setActive("m1");
        if(i2 == 2) ctrl.setActive("m2");
        if(i2 == 3) {ctrl.setActive("m1"); ctrl.setActive("m2");}
        if(i2 == 4) ctrl.setActive("m4");
        if(i2 == 5) {ctrl.setActive("m1"); ctrl.setActive("m4");}
        if(i2 == 6) {ctrl.setActive("m2"); ctrl.setActive("m4");}
        if(i2 == 7) {ctrl.setActive("m1"); ctrl.setActive("m2"); ctrl.setActive("m4");}
        if(i2 == 8) ctrl.setActive("m8");
        if(i2 == 9) {ctrl.setActive("m1"); ctrl.setActive("m8");}
    }

    private void splitSecond(String sec) {
        String[] TimeSplit = sec.split("");
        int i1 = Integer.valueOf(TimeSplit[0]);
        int i2 = Integer.valueOf(TimeSplit[1]);
        if(i1 == 1) ctrl.setActive("s10");
        if(i1 == 2) ctrl.setActive("s20");
        if(i1 == 3) {ctrl.setActive("s10"); ctrl.setActive("s20");}
        if(i1 == 4) ctrl.setActive("s40");
        if(i1 == 5) {ctrl.setActive("s10"); ctrl.setActive("s40");}
        if(i1 == 6) {ctrl.setActive("s20"); ctrl.setActive("s40");}
        if(i2 == 1) ctrl.setActive("s1");
        if(i2 == 2) ctrl.setActive("s2");
        if(i2 == 3) {ctrl.setActive("s1"); ctrl.setActive("s2");}
        if(i2 == 4) ctrl.setActive("s4");
        if(i2 == 5) {ctrl.setActive("s1"); ctrl.setActive("s4");}
        if(i2 == 6) {ctrl.setActive("s2"); ctrl.setActive("s4");}
        if(i2 == 7) {ctrl.setActive("s1"); ctrl.setActive("s2"); ctrl.setActive("s4");}
        if(i2 == 8) ctrl.setActive("s8");
        if(i2 == 9) {ctrl.setActive("s1"); ctrl.setActive("s8");}
    }
    
    private void setAllInActive() {
        ctrl.setInActive("s10");
        ctrl.setInActive("s20");
        ctrl.setInActive("s40");
        ctrl.setInActive("s1");
        ctrl.setInActive("s2");
        ctrl.setInActive("s4");
        ctrl.setInActive("s8");

        ctrl.setInActive("m10");
        ctrl.setInActive("m20");
        ctrl.setInActive("m40");
        ctrl.setInActive("m1");
        ctrl.setInActive("m2");
        ctrl.setInActive("m4");
        ctrl.setInActive("m8");

        ctrl.setInActive("h10");
        ctrl.setInActive("h20");
        ctrl.setInActive("h1");
        ctrl.setInActive("h2");
        ctrl.setInActive("h4");
        ctrl.setInActive("h8");
    }

}
