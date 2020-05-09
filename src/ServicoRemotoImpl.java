
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto{

	private static final long serialVersionUID = 1L;

	public ServicoRemotoImpl() throws RemoteException {
		
	}
	
	public List<Pessoa> lstObjeto = new ArrayList<>(); 

	@Override
	public void inserir(Pessoa p) throws RemoteException{
		lstObjeto.add(p);
	}

	@Override
	public List<Pessoa> getLista() throws RemoteException {
		return lstObjeto;
	}
	
}
