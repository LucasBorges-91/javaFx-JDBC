package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Proprietario;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ProprietarioListController implements Initializable {

  @FXML
  private TableView<Proprietario> tableViewProprietario;

  @FXML
  private TableColumn<Proprietario, Integer> tableColumnId;

  @FXML
  private TableColumn<Proprietario, String> tableColumnNome;

  @FXML
  private TableColumn<Proprietario, String> tableColumnRg;

  @FXML
  private TableColumn<Proprietario, String> tableColumnCpf;

  @FXML
  private TableColumn<Proprietario, String> tableColumnTelefone;

  @FXML
  private TableColumn<Proprietario, Boolean> tableColumnAtivo;

  @FXML
  private TableColumn<Proprietario, String> tableColumnAnotacao;

  @FXML
  private Button btBuscar;

  @FXML
  private Button btCadastrar;

  @FXML
  private TextField textFieldBuscar;

  @FXML
  public void onBtNewAction() {
    System.out.println("onBtNewActionProp");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    initializeNode();
  }

  private void initializeNode() {
    tableColumnId.setCellValueFactory( new PropertyValueFactory<>( "id") );
    tableColumnNome.setCellValueFactory( new PropertyValueFactory<>( "name") );
    tableColumnRg.setCellValueFactory( new PropertyValueFactory<>( "rg") );
    tableColumnCpf.setCellValueFactory( new PropertyValueFactory<>( "cpf") );
    tableColumnTelefone.setCellValueFactory( new PropertyValueFactory<>( "telefone") );
    tableColumnAtivo.setCellValueFactory( new PropertyValueFactory<>( "ativo") );
    tableColumnAnotacao.setCellValueFactory( new PropertyValueFactory<>( "anotacao") );

    Stage stage = ( Stage )Main.getMainScene().getWindow();
    tableViewProprietario.prefHeightProperty().bind( stage.heightProperty() );
  }
}
