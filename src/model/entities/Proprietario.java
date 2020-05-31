package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Proprietario implements Serializable {

  private Integer id;
  private String name;
  private String rg;
  private String cpf;
  private String telefone;
  private Boolean ativo;
  private String anotacao;

  public Proprietario() {}

  public Proprietario(Integer id, String name, String rg, String cpf, String telefone, Boolean ativo, String anotacao) {
    this.id = id;
    this.name = name;
    this.rg = rg;
    this.cpf = cpf;
    this.telefone = telefone;
    this.ativo = ativo;
    this.anotacao = anotacao;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Proprietario that = (Proprietario) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(cpf, that.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cpf);
  }

  @Override
  public String toString() {
    return "Proprietario{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", rg='" + rg + '\'' +
            ", cpf='" + cpf + '\'' +
            ", telefone='" + telefone + '\'' +
            ", ativo=" + ativo +
            ", anotacao='" + anotacao + '\'' +
            '}';
  }
}
