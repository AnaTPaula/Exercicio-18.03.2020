package br.fai.exercicio18032020;

import java.util.Scanner;

public class Main {

	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		 int opcao = 0;
	    
	        
	        do{
	            System.out.println("Digite o número da opção: "); 
	            opcao = entrada.nextInt();
	            entrada.nextLine();
	            
	            
	            switch(opcao){
	            case 1:
	                
	                break;
	                
	            case 2:
	                
	                break;
	                
	            case 3:
	              
	                break;
	                
	            case 4:
	                
	                break;
	            
	            default:
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);
	    }
	

	public void menu() {
		
		System.out.println("------------------------------------------------------------");
		System.out.println("                     CLINICA DE ANIMAIS                     ");
		System.out.println("1. Cadastrar Cavalo");
		System.out.println("2. Cadastrar Girrafa");
		System.out.println("3. Listar Cavalos");
		System.out.println("4. Listar Girrafas");
		System.out.println("5. Listar todos os animais");
		System.out.println("6. Remover um animal por ID");
		System.out.println("7. Exibir a quantidade de animais cadastrados por tipo");
		System.out.println("8. Sair: ");
		System.out.println("Opção: ");
		System.out.println("------------------------------------------------------------");
	}

}
