import java.util.Scanner;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

/**
*
* @author Aluno
*/
public class ToDoListProfessor {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String[] tarefas = new String[10];
boolean[] concluidas = new boolean[10];
int finalizacao = 0;
while(finalizacao == 0){
System.out.println("Lista de Tarefas\n");
System.out.println("1. Adicionar Tarefas");
System.out.println("2. Listar Tarefas");
System.out.println("3. Concluir Tarefa");
System.out.println("4. Excluir Tarefa");
System.out.println("5. Sair ");
int escolha = scan.nextInt();
switch (escolha){
case 1: {
int posicaoLivre = -1;
for (int i = 0; i<tarefas.length ; i++){
if (tarefas[i] == null){
posicaoLivre = i;
break;
}
}
if (posicaoLivre == -1){
System.out.println("A lista de tarefas esta cheia");
} else {
System.out.println("Digite a tarefa: ");
tarefas[posicaoLivre] = scan.nextLine();
concluidas[posicaoLivre] = false;
System.out.println("Tarefa adicionada");
}
break;
}
case 2: {
System.out.println("===========MINHAS TAREFAS==========");
boolean existeTarefa = false;
for (int i = 0; i < tarefas.length; i++){
if(tarefas[i] != null){
existeTarefa = true;
if (concluidas[i] == true){
System.out.println((i + 1) + "- [x]" + tarefas[i]);
}else{
System.out.println((i + 1) + "- []" + tarefas[i]);
}
}
}
if (existeTarefa == false){
System.out.println("Nenhuma tarefa cadastrada");
                }
                } break;
}
case 3: {
System.out.println("Digite o numero da tarefa que deseja concluir");
int numeroConcluir = scan.nextInt();
int indiceConcluir = numeroConcluir - 1;

if(indiceConcluir >= 0 && indiceConcluir < tarefas.length && tarefas[indiceConcluir] != null){
concluidas[indiceConcluir] = true;
System.out.println("Tarefa concluida");
}else {
System.out.println("Tarefas invalida");
                } break;
            }
            case 4: {
                System.out.println("Qual tarefa deseja excluir?");
                int nuemroExcluir = scan.nextInt();
                int indiceExcluir = nuemroExcluir - 1;
               
                if(indiceExcluir >= 0 && indiceExcluir < tarefas.length && tarefas[indiceExcluir] != null){
                    tarefas[indiceExcluir] = null;
                    concluidas[indiceExcluir] = false;
                    System.out.println("Tarefa excluida");
                } else {
                    System.out.println("Tarefa invalida");
}
                break;
            }
            case 5: {
                System.out.println("Encerrando...");
                finalizacao++;
                break;
            }
            default -> {
                System.out.println("Nao tem essa opçao");
}

}//switch
}//while
}