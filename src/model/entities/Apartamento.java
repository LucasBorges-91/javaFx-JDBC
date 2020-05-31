package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Apartamento implements Serializable {

  private Integer id;
  private String endereco;
  private Integer numero;
  private Integer apto;
  private Boolean ativo;
  private String anotacao;

  private Proprietario proprietario;
  private Inquilino inquilino;


  public Apartamento() {}

  public Apartamento(Integer id, String endereco, Integer numero, Integer apto, Boolean ativo, String anotacao, Proprietario proprietario) {
    this.id = id;
    this.endereco = endereco;
    this.numero = numero;
    this.apto = apto;
    this.ativo = ativo;
    this.anotacao = anotacao;
    this.proprietario = proprietario;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Integer getApto() {
    return apto;
  }

  public void setApto(Integer apto) {
    this.apto = apto;
  }

  public Boolean getAtivo() {
    return ativo;
  }

  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  public String getAnotacao() {
    return anotacao;
  }

  public void setAnotacao(String anotacao) {
    this.anotacao = anotacao;
  }

  public Proprietario getProprietario() {
    return proprietario;
  }

  public void setProprietario(Proprietario proprietario) {
    this.proprietario = proprietario;
  }

  public Inquilino getInquilino() {
    return inquilino;
  }

  public void setInquilino(Inquilino inquilino) {
    this.inquilino = inquilino;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Apartamento that = (Apartamento) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(endereco, that.endereco) &&
            Objects.equals(numero, that.numero) &&
            Objects.equals(apto, that.apto) &&
            Objects.equals(proprietario, that.proprietario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, endereco, numero, apto, proprietario);
  }

  @Override
  public String toString() {
    return "Apartamento{" +
            "id=" + id +
            ", endereco='" + endereco + '\'' +
            ", numero=" + numero +
            ", apto=" + apto +
            ", ativo=" + ativo +
            ", anotacao='" + anotacao + '\'' +
            ", proprietario=" + proprietario +
            ", inquilino=" + inquilino +
            '}';
  }
}
