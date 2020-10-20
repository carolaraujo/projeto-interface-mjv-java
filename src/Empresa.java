
public class Empresa {
	
	private String nome;
	private Integer numero;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {		
		if(numero < 0) {
			this.numero = 0;
			return;
		}
		
		this.numero = 0;
	}
}
