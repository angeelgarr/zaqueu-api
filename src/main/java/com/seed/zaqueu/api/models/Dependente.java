package com.seed.zaqueu.api.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.seed.zaqueu.api.enums.TipoDependenteEnum;

@Entity
public class Dependente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	private Date dataCadastro;
	@Enumerated(EnumType.STRING)
	private TipoDependenteEnum tipoDependente;
	@ManyToOne(fetch = FetchType.EAGER)
	private Membro membro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public TipoDependenteEnum getTipoDependente() {
		return tipoDependente;
	}

	public void setTipoDependente(TipoDependenteEnum tipoDependente) {
		this.tipoDependente = tipoDependente;
	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}
}
