import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1113994920668659455L;
	
	private int id;
	private String nome;
	private String telefone;
	private int idade;
	private String endereco;
	private String cidade;
	private String estado;
	private Double salario;
	private String nomePai;
	private String nomeMae;
	
	public void gerarAumnento() {
		if(this.idade <= 20) {
			this.salario = this.salario + (this.salario/100)*10 ;
		}else if(this.idade > 20 && this.idade <= 30) {
			this.salario = this.salario + (this.salario/100)*15 ;
		}else if(this.idade > 30) {
			this.salario = this.salario + (this.salario/100)*20 ;
		}
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getSalario() {
		return this.salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
		gerarAumnento();
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}
