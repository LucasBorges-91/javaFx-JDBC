package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Inquilino implements Serializable {

  private Integer id;
  private String nome;
  private String rg;
  private String cpf;
  private String telefone;
  private Boolean ativo;
  private String anotacao;

  public Inquilino() {}

  public Inquilino(Integer id, String nome, String rg, String cpf, String telefone, Boolean ativo, String anotacao) {
    this.id = id;
    this.nome = nome;
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

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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
    Inquilino inquilino = (Inquilino) o;
    return Objects.equals(id, inquilino.id) &&
            Objects.equals(nome, inquilino.nome) &&
            Objects.equals(cpf, inquilino.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cpf);
  }

  @Override
  public String toString() {
    return "Inquilino{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", rg='" + rg + '\'' +
            ", cpf='" + cpf + '\'' +
            ", telefone='" + telefone + '\'' +
            ", ativo=" + ativo +
            ", anotacao='" + anotacao + '\'' +
            '}';
  }
}
