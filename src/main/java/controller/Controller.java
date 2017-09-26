package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import view.MainView;

public class Controller implements EventHandler<ActionEvent>{




    public Parent setMainView(){
        MainView mainView = new MainView();
        Parent parent = mainView.buildView();
        return parent;
    }
    @Override
    public void handle(ActionEvent event){

    }
}
