package model.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController implements Initializable {

  @FXML
  private TextField textFieldUsuario;

  @FXML
  private PasswordField passwordFieldSenha;

  @FXML
  private Button buttonEntrar;

  @FXML
  private Button buttonCadastrar;

  @FXML
  public void onButtonEntrarAction() {
    System.out.println("Entrou!");
  }

  @FXML
  public void onButtonCadastrarAction() {
    System.out.println("Cadastrou!");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
  }
}
