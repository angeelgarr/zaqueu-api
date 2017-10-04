package com.seed.zaqueu.api.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.seed.zaqueu.api.enums.EstadoCivilEnum;

@Entity
public class Membro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private EstadoCivilEnum estadoCivilEnum;
	@OneToOne
	private Endereco endereco;
	private Date dataCadastro;
	private Date dataUltimaAtualizacao;
	private Date dataConversao;
	private String conjugue;
	private boolean carteiraEmitida;
	@OneToMany(mappedBy = "membro", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Dependente> dependentes;
	@ManyToOne(fetch = FetchType.EAGER)
	private Igreja igreja;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivilEnum getEstadoCivilEnum() {
		return estadoCivilEnum;
	}

	public void setEstadoCivilEnum(EstadoCivilEnum estadoCivilEnum) {
		this.estadoCivilEnum = estadoCivilEnum;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public Date getDataConversao() {
		return dataConversao;
	}

	public void setDataConversao(Date dataConversao) {
		this.dataConversao = dataConversao;
	}

	public String getConjugue() {
		return conjugue;
	}

	public void setConjugue(String conjugue) {
		this.conjugue = conjugue;
	}

	public boolean isCarteiraEmitida() {
		return carteiraEmitida;
	}

	public void setCarteiraEmitida(boolean carteiraEmitida) {
		this.carteiraEmitida = carteiraEmitida;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Igreja getIgreja() {
		return igreja;
	}

	public void setIgreja(Igreja igreja) {
		this.igreja = igreja;
	}
}
