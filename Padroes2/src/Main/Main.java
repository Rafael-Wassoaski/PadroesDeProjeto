package Main;

import Form.Formulario;
import Interfaces.CNPJ;
import Interfaces.CPFValid;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formulario form = new Formulario("Rafa", "12345678900", "23-10-1998");
		
		
		form.validName();
		form.setValidator(new CPFValid());
		form.isValid(form.getInscricao());
		form.validDate();
		
		
		

	}

}
