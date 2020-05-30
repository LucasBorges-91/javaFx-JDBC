package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import sample.Main;

import java.io.IOException;
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

  @FXML
  public void onMenuItemAboutAction() {
    loadView( "/gui/About.fxml");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
  }

  private synchronized void loadView( String absoluteName ) {
    try {
      FXMLLoader loader = new FXMLLoader( getClass().getResource( absoluteName ) );
      VBox newVBox = loader.load();

      Scene mainScene = Main.getMainScene();
      VBox mainVBox = ( VBox ) ( ( ScrollPane ) mainScene.getRoot() ).getContent();

      Node mainMenu = mainVBox.getChildren().get( 0 );
      mainVBox.getChildren().clear();
      mainVBox.getChildren().add( mainMenu );
      mainVBox.getChildren().addAll( newVBox.getChildren() );
    } catch ( IOException e ) {
      Alerts.showAlert( "IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR );
    }
  }
}
