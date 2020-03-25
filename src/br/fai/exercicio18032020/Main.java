package br.fai.exercicio18032020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	Scanner entrada = new Scanner(System.in);
	
	
	static Map<Integer, String> mapaDeAnimais = new HashMap<Integer, String>();
	static List<Cavalo> listaDeCavalos = new ArrayList<Cavalo>();
	static List<Girafa> listaDeGirafas = new ArrayList<Girafa>();
	
	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		 int opcao = 0;
		 int i;
	    
	        
	        do{
	            System.out.println("Digite o número da opção: "); 
	            opcao = entrada.nextInt();
	            entrada.nextLine();
	            
	            
	            switch(opcao){
	            case 1:{
	            	
	            	cadastrarCavalo();
	            }
	                
	                break;
	                
	            case 2:
	            {
	            	cadastrarGirafa();
	            }
	                
	                break;
	                
	            case 3:
	            {
	            	listarCavalos();
	            }
	                break;
	                
	            case 4:
	            {
	            	listarGirafas();
	            }
	                
	                break;
	                
	            case 5:
	            {
	            	listarTodosAnimais();;
	            }
	            break;
	            
	            case 6: 
	            {
	            	int idRemover;
	            	Boolean encontrou = false;
	            	System.out.println("Digite o Id do animal para remover");
	            	idRemover = entrada.nextInt();
	            	entrada.nextLine();
	            	
	            	for (int = 0; i < listaDeCavalos.size(); i++)
	            	{
	            		Cavalo cavalo = listaDeCavalos.get(i);
	            		if (cavalo.getID() == idRemover)
	            		{
	            			listaDeCavalos.remove(i);
	            			encontrou = true;
	            		}
	            	}
	            	
	            	if (!encontrou)
	            	{
	            		for (int i = ;i <listaDeGirafas.size(); i++)
	            		{
	            			Girafa girafa = listaDeGirafas.get(i);
	            			if(girafa.getID() == idRemover)
	            			{
	            				listaDeGirafas.remove(i);
	            			}
	            		}
	            		
	            	}
	            	
	            	mapaDeAnimais.remove(idRemover);
	            }
	            
	            break;
	            
	            case 7:
	            {
	            	menu();
	            }
	            
	            case 8: 
	            {
	            	System.out.println("Saindo");
	            }
	            break;
	            
	            default:
	                System.out.println("Opção inválida.");
	            }
	            break;
	            
	        } while(opcao != 8);
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



private void cadastrarCavalo() {
	int novoId;
	String novoNome;
	
	System.out.print("\nDigite o nome do cavalo: ");
	novoNome = entrada.nextLine();
	
	novoId = listaDeCavalos.size() + listaDeGirafas.size();
	Cavalo novoCavalo = new Cavalo (novoId, novoNome);
	listaDeCavalos.add(novoCavalo);
	mapaDeAnimais.put(novoId, novoNome);
	System.out.println("O cavalo foi inserido com sucesso.");
}

private void cadastrarGirafa() {
	int novoId;
	String novoNome;
	
	System.out.print("\nDigite o nome da girafa: ");
	novoNome = entrada.nextLine();
	
	novoId = listaDeCavalos.size() + listaDeGirafas.size();
	Girafa novaGirafa = new Girafa (novoId, novoNome);
	listaDeGirafas.add(novaGirafa);
	mapaDeAnimais.put(novoId, novoNome);
	System.out.println("A girafa foi inserida com sucesso.");
}

private void listarCavalos() {
	for (Cavalo cavalo : listaDeCavalos) {
		System.out.println("Dados do cavalo: " + cavalo.getID() + " | " + cavalo.getNome());
	}
}

private void listarGirafas() {
	for (Girafa girafa : listaDeGirafas) {
		System.out.println("Dados da girafa: " + girafa.getID() + " | " + girafa.getNome());
	}
}

private void listarTodosAnimais() {
	for (Cavalo cavalo : listaDeCavalos) {
		System.out.println("Dados do animal: Cavalo | " + cavalo.getID() + " | " + cavalo.getNome());
	}
	
	for (Girafa girafa : listaDeGirafas) {
		System.out.println("Dados do animal: Girafa | " + girafa.getID() + " | " + girafa.getNome());
	}
}

}

