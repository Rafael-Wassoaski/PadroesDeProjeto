package Form;

import java.text.SimpleDateFormat;
import java.util.Date;

import Interfaces.MainInterface;

public class Formulario {

	private String nome;
	private String inscricao;
	private String data;
	private MainInterface validator;

	public Formulario(String nome, String inscricao, String date) {
		super();
		this.nome = nome;
		this.inscricao = inscricao;
		this.data = date;
	}

	public String getNome() {
		return nome;
	}

	public String getInscricao() {
		return inscricao;
	}

	public String getData() {
		return data;
	}

	public void setValidator(MainInterface validator) {
		this.validator = validator;
	}

	public void isValid(String field) {

		System.out.println(field + " " + validator.isValid(field));
	}
	
	public void validName() {
		// TODO Auto-generated method stub

		if (!this.nome.matches("[a-zA-Z_]+")) {
			System.out.println("Nome nao confere");
		return;
		}
		
		System.out.println("Nome  confere");
		return;
	}
	
	public void validDate() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			formato.parse(data);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Data com formato incorreto");
			return;
		}
		
		System.out.println("Data com formato correto");
		
	}
	
	

}
