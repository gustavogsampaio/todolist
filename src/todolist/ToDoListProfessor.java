/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoListProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] tarefas = new String(10);
        boolean[] concluidas = new boolean(10);
        
        int opcao = 0;
        
        while(opcao != 5){
            System.out.println("Lista de Tarefas");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefa");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Excluir Tarefa");
            System.out.println("5 - Sair");
            
            System.out.println("\n =Escolha uma Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
            case 1:
                int posicaolivre = -1;
                for(int i = 0; i < tarefas.length; i++){
                    if(tarefas[1] == null){
                        posicaolivre = i;
                        break;
                    }
                }
                if (posicaolivre == -1){
                    System.out.println("A lista de tarefas está cheia");
                }else{
                    System.out.println("Digite a tarefa: ");
                    tarefas[posicaolivre] = scanner.nextLine();
                    concluidas[posicaolivre] = false;
                    System.out.println("Tarefa adicionada com sucesso");
                }
                break;
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            case 4:
                System.out.println("d");
                break;
            case 5:
                System.out.println("e");
                break;
            default:
                System.out.println("f");
                break;
        }
            
            
            
        }
        
    }
    
}
