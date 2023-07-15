/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.List;
import java.util.Scanner;


public class Aluno {
    
    //declaração de variavel
    private String nome;
    private int[] notas;

    public Aluno(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public Aluno() {
    }
   

   
    
    public static int Menu(Scanner ler){
        boolean entrada=false;
        int opcao=0;
        String pegar;
        while(!entrada){
        System.out.println("-------------------------------------------------------- ");
        System.out.println("--------------| Escolha uma opção que dezejar |----------");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("-----------1--|   Adicionar Alunos num vetor    |--------");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("-----------2--|   Mostrar a media do aluno      |--------");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("-----------3--|   Ordenar a notas do aluno      |--------");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("-----------4--|   Mostrar aluno com melhor notas|--------");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("-----------0--|     sair                          |------");
        System.out.println("-------------------------------------------------------- ");

        
        try{
            pegar=ler.nextLine();
            opcao=Integer.parseInt(pegar);
            if(opcao >=0 && opcao<=4){
                entrada=true;
            }else{
                System.err.println("Entrada Incorreta Tente novamente");
            }
        }catch(Exception e){
            System.err.println("Entrada Incorreta Tente novamente");
        }
        }
        return opcao;
        
    }
    
    
    //criar um metudo que mostre a média dos modulos 
    
   
    //metudo que calcula a media do aluno
    public float media(){
        float media=0;
        for (int i = 0; i < notas.length ; i++) {
            media+=notas[i];
        }
        //media é igual ah soma das todas as notas / pelo numero de notas 
        media=media/(notas.length-1);
        //System.out.println(getNome()+" têm "+media+" de média");
        return media;
    }
    
    
    
    public static void limpartela(){
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    }
    
    
 
   
    
    //ordenar elementos por orden crescente na lista
    public void ordenarElementos(){
            int tamanho=notas.length;
            //percorer a lista
        for (int i = 0; i < tamanho -1; i++) {
            for (int j = 0; j < tamanho -i -1; j++) { //esse tam - i para não reafazer o que ja estava ferificado
                 if(notas[j]> notas[j+1]){
                     
                     int maior =notas[j];
                     notas[j]=notas[j+1];
                     notas[j+1]=maior;
                 }
            }
        }
    }
    
     //imprimir na tela
    public  String imprimir(){
        String lista="[";
        if( this.notas.length == 0){
           lista="Lista vazia";
         
        }else{
            for (int i = 0; i < this.notas.length; i++) {
                lista+=this.notas[i];
                lista+=", ";
            }
            lista+="]";
        }
        return "Aluno "+getNome()+lista;
    }

       public static void mostrarDados(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.print("Nome: " + aluno.getNome());
            System.out.print("  Notas: ");
            for (int nota : aluno.getNotas()) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        int tam=0;
        String saida="Aluno: "+nome+" Notas{";
        for (int i = 0; i < notas.length; i++) {
            saida+=","+notas[i];
        }
        //"Aluno{" + "nome=" + nome + "} notas={" + notas[tam++] + '}';
        return saida; 
    }
       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }


}
