/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1 - Adicionar tarefa\n" +
"2 - Listar tarefas\n" +
"3 - Concluir tarefa\n" +
"4 - Excluir tarefa\n" +
"5 - Sair");
        
    Scanner ler = new Scanner(System.in);

        System.out.print("Qual quer acessar: ");
        
        int acesso = ler.nextInt();
        switch (acesso) {
            case 1:
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
