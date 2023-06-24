package com.example.kalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import model.kalc;

public class HelloController {

    @FXML
    private Label label1;
    @FXML

    private ListView ilist;
    @FXML
    private TextField elec;
    @FXML
    private TextField kol;
    @FXML
    private TextField potreb;
    @FXML
    private Button butadd;
    @FXML
    private kalc kal = new kalc();

    @FXML
    protected void update(){
        ilist.getItems().clear();
        int i = 0;
        while (kal.getit(i) != "NONE"){
            ilist.getItems().add(kal.getit(i));
            i++;
        }

    }


    @FXML protected void ButtonItemAdd() {
        kal.Add(elec.getText(),kol.getText(),potreb.getText());
        update();
        label1.setText(String.valueOf(kal.AllPower()));
    }

}