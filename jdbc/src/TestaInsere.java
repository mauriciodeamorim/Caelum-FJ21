import java.util.Calendar;


public class TestaInsere {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("Email");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO(null);
		
		dao.Adiciona(contato);
		System.out.println("Gravado!!");
	}

}
