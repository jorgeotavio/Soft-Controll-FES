package app;

import model.BaseDados;

import view.TelaLogin;

import controller.Controller;

//Mensagem de teste
public class App {
	public static void main(String[] args) {
		
		TelaLogin telaLogin = new TelaLogin();
		BaseDados baseDados = new BaseDados();
		new Controller(baseDados, telaLogin);
		
	}
}
