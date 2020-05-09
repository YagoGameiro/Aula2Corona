import java.rmi.Naming;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		try {
			IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");
			
			Professor p1 = new Professor();
			
			p1.setId(1);
			p1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
			p1.setTelefone("33312233");
			p1.setCidade("Araraquara");
			p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, p1.getNome() + ", Digite sua idade")));
			p1.setSalario(new Double(100.0));

			Professor p2 = new Professor();
			
			p2.setId(1);
			p2.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
			p2.setTelefone("33222223");
			p2.setCidade("Araraquara");
			p2.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, p2.getNome() + ", Digite sua idade")));
			p2.setSalario(new Double(100.0));
			
			objPessoa.inserir(p1);
			objPessoa.inserir(p2);
			
			for (Pessoa professor : objPessoa.getLista()) {
				System.out.println("ID:" + professor.getId());
				System.out.println("Nome:" + professor.getNome());
				System.out.println("Telefone:" + professor.getTelefone());
				System.out.println("Cidade:" + professor.getCidade());
				System.out.println("Idade:" + professor.getIdade());
				System.out.println("Salario:" + professor.getSalario());
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
