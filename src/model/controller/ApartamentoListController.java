package model.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Apartamento;
import model.entities.Inquilino;
import model.entities.Proprietario;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ApartamentoListController implements Initializable {

  @FXML
  private TableView<Apartamento> tableViewApartamento;

  @FXML
  private TableColumn<Apartamento, Integer> tableColumnId;

  @FXML
  private TableColumn<Apartamento, String> tableColumnEndereco;

  @FXML
  private TableColumn<Apartamento, Integer> tableColumnNumero;

  @FXML
  private TableColumn<Apartamento, Integer> tableColumnApto;

  @FXML
  private TableColumn<Apartamento, Proprietario> tableColumnProprietario;

  @FXML
  private TableColumn<Apartamento, Inquilino> tableColumnInquilino;

  @FXML
  private TableColumn<Apartamento, Boolean> tableColumnAtivo;

  @FXML
  private TableColumn<Apartamento, String> tableColumnAnotacao;

  @FXML
  private Button btBuscar;

  @FXML
  private Button btCadastrar;

  @FXML
  private TextField textFieldBuscar;

  @FXML
  public void onBtNewAction() {
    System.out.println("onBtNewActionApto");
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    initializeNode();
  }

  private void initializeNode() {
    tableColumnId.setCellValueFactory( new PropertyValueFactory<>( "id" ) );
    tableColumnEndereco.setCellValueFactory( new PropertyValueFactory<>( "endereco" ) );
    tableColumnNumero.setCellValueFactory( new PropertyValueFactory<>( "numero" ) );
    tableColumnApto.setCellValueFactory( new PropertyValueFactory<>( "apto" ) );
    tableColumnProprietario.setCellValueFactory( new PropertyValueFactory<>( "proprietario" ) );
    tableColumnInquilino.setCellValueFactory( new PropertyValueFactory<>( "inquilino" ) );
    tableColumnAtivo.setCellValueFactory( new PropertyValueFactory<>( "ativo" ) );
    tableColumnAnotacao.setCellValueFactory( new PropertyValueFactory<>( "anotacao" ) );

    Stage stage = ( Stage ) Main.getMainScene().getWindow();
    tableViewApartamento.prefHeightProperty().bind( stage.heightProperty() );
  }


}
