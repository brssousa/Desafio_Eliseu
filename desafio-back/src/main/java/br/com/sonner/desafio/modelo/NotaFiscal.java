package br.com.sonner.desafio.modelo;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class NotaFiscal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Long numero;

	private String fornecedor;

	@Temporal(TemporalType.DATE)
	private Date data;

	@OneToMany(mappedBy="nota", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private List<Itens> itens;





	public NotaFiscal(){

	}

	public NotaFiscal(long id,Long numero, String fornecedor,Date data) {
		this.id = id;
		this.numero = numero;
		this.fornecedor = fornecedor;
		this.data = data;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
