
public class ClienteOracleImpl implements ClienteDAO {
	
	public Integer recuperarIdSequence() {
		return 1;
	}
		
	@Override
	public Integer incluir(Empresa empresa) {
		// TODO Auto-generate method stub
		return recuperarIdSequence();
	}
}
