package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

  @FXML
  private MenuItem menuItemProprietario;

  @FXML
  private MenuItem menuItemApartamento;

  @FXML
  private MenuItem menuItemInquilino;

  @FXML
  private MenuItem menuItemBuscaProprietario;

  @FXML
  private MenuItem menuItemBuscaApartamento;

  @FXML
  private MenuItem menuItemBuscaInquilino;

  @FXML
  private MenuItem menuItemAbout;


  @FXML
  public void onMenuItemProprietarioAction() {
    System.out.println("onMenuItemProprietarioAction");
  }

  @FXML
  public void onMenuItemApartamentoAction() {
    System.out.println("onMenuItemApartamentoAction");
  }

  @FXML
  public void onMenuItemInquilinoAction() {
    System.out.println("onMenuItemInquilinoAction");
  }

  @FXML
  public void onMenuItemBuscaProprietarioAction() {
    System.out.println("onMenuItemBuscaProprietarioAction");
  }

  @FXML
  public void onMenuItemBuscaApartamentoAction() {
    System.out.println("onMenuItemBuscaApartamentoAction");
  }

  @FXML
  public void onMenuItemBuscaInquilinoAction() {
    System.out.println("onMenuItemBuscaInquilinoAction");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
  }
}
