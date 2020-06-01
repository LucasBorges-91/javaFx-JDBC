package model.service;

import model.entities.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class ProprietarioService {

  public List<Proprietario> findAll(){
    List<Proprietario> list = new ArrayList<>();
    list.add( new Proprietario( 1, "Ivanir Demenech", "0000000000", "000.000.000-00", "999999999", true, "" ) );
    list.add( new Proprietario( 2, "Aurea Maria", "1111111111", "111.111.111-11", "888888888", true, "" ) );
    list.add( new Proprietario( 3, "Jose Allonso", "2222222222", "222.222.222-22", "7777777777", true, "" ) );
    list.add( new Proprietario( 4, "Maltide Josefa", "333333333", "333.333.333-33", "66666666666", false, "Depositar valor de um aluguel referente a entrega do apartamento. Proprietario se responsabiliziou pela pintura" ) );
    return list;
  }
}
