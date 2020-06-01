package model.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Proprietario;
import model.service.ProprietarioService;
import sample.Main;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ProprietarioListController implements Initializable {


  private ProprietarioService service;

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

  private ObservableList<Proprietario> observableList;

  @FXML
  public void onBtNewAction() {
    System.out.println("onBtNewActionProp");
  }

  public void setProprietarioService( ProprietarioService service ) {
    this.service = service;
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

  public void updateTableView() {
    if ( service == null ) {
      throw new IllegalStateException( "Service was null" );
    }
    List<Proprietario> list = service.findAll();
    observableList = FXCollections.observableArrayList( list );
    tableViewProprietario.setItems( observableList );
  }
}
