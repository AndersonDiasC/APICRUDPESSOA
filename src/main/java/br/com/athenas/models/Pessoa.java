package br.com.athenas.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String nome;
	private Date data_nasc;	
	private String CPF;

	@Column(length = 1)	
	private Character sexo;
	private Float altura;
	private Float peso;
	
	
	
	
	public Pessoa() {
			
	}
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
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", data_nasc=" + data_nasc + ", CPF=" + CPF + ", sexo=" + sexo
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}
	public Pessoa(Long id, String nome, Date data_nasc, String cPF, Character sexo, Float altura, Float peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_nasc = data_nasc;
		CPF = cPF;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	
	
	
	

}
