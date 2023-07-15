/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import static exercicio2.Aluno.Menu;
import static exercicio2.Aluno.limpartela;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    //apresenta a tela de saudacao
public static void capa() throws IOException, InterruptedException{
// data/hora atual
LocalDateTime agora = LocalDateTime.now();

// formatar a data
DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
String dataFormatada = formatterData.format(agora);

// formatar a hora
DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
String horaFormatada = formatterHora.format(agora);

System.out.println("|Horario Atcual:"+horaFormatada+" ||  Data Actual:"+dataFormatada+" \t|\n");
		System.out.println( "----------------------------------------------------------------------------");
		System.out.println("BENVINDO A UNIVERSIDADE DE SANTIAGO \n");
                System.out.println("CURSO: ENGENHARIA INFORMATICA       \n");
		
                System.out.println("Aluno: Kelby De Pina;");

		System.out.println("----------------------------------------------------------------------------");

}
    public static List<Aluno> ler(File fich){
        //instanciar meu proprio lista segunda parte do exercicios
        Lista listaAlunos =new Lista();
        List<Aluno> alunos = new ArrayList<>();
       int[] notas=new int[4];
        //Vetor list=new Vetor();
        String linha;
        
        try 
        {
            FileReader fr= new FileReader(fich);
            BufferedReader br = new BufferedReader(fr);
           
            
            while (br.ready()) {//enquanto ah linhas para ler faza   
                linha=br.readLine();//pegar valor
                String[] pegar=linha.split(";");
                String nome=pegar[0];//pegar o nome do aluno
                 notas=new int[pegar.length];
                for (int i = 1; i < pegar.length; i++) {
                   int not=Integer.parseInt(pegar[i]);
                   notas[i-1]=not;
                   //aluno.setNotas(notas);
                }
                
                
                    
                //aluno.setNotas(notas);
                 //instanciar aluno i passar os atributos
                  Aluno aluno = new Aluno(nome, notas);
                 // lista.adicionar(aluno);
                  //txupetar elementos na lista aqui e exer 1 ate 3
                  alunos.add(aluno);
                  
                  //System.out.println("Imprime:\t:"+aluno.imprimir(notas));
                //System.out.println("Imprime:\t"+aluno.imprimir(notas));
                
                //instanciar a classe aluno
               
               
            }
            /* while((linha = br.readLine()) != null){
                list.add(linha.split(";"));
            } */
            fr.close();//fechar a conexeção
            br.close();;
            
            //System.out.println(lista.listar());
        } catch (Exception e) {
            System.err.println("Erro: "+e);
        }
        
        return alunos;
    }
    //metudo que vai ler elementos do ficheiro e passar alementos para o meu proprio lista lista  
    //corespondente da segunda parti do exercicios
    public static Lista lerNaLista(File fich){
        //instanciar meu proprio lista segunda parte do exercicios
        Lista listaAlunos =new Lista();
       
       int[] notas=new int[4];
        //Vetor list=new Vetor();
        String linha;
        
        try 
        {
            FileReader fr= new FileReader(fich);
            BufferedReader br = new BufferedReader(fr);
           
            
            while (br.ready()) {//enquanto ah linhas para ler faza   
                linha=br.readLine();//pegar valor
                String[] pegar=linha.split(";");
                String nome=pegar[0];//pegar o nome do aluno
                 notas=new int[pegar.length];
                for (int i = 1; i < pegar.length; i++) {
                   int not=Integer.parseInt(pegar[i]);
                   notas[i-1]=not;
                   //aluno.setNotas(notas);
                }
                
                
                    
                //aluno.setNotas(notas);
                 //instanciar aluno i passar os atributos
                  Aluno aluno = new Aluno(nome, notas);
                 // lista.adicionar(aluno);
                  //txupetar elementos no meu proprio lista Segunda parte do exercicio 
                  listaAlunos.adicionar(aluno);
                  
                  //System.out.println("Imprime:\t:"+aluno.imprimir(notas));
                //System.out.println("Imprime:\t"+aluno.imprimir(notas));
                
                //instanciar a classe aluno
               
               
            }
            /* while((linha = br.readLine()) != null){
                list.add(linha.split(";"));
            } */
            fr.close();//fechar a conexeção
            br.close();;
            
            //System.out.println(lista.listar());
        } catch (Exception e) {
            System.err.println("Erro: "+e);
        }
        
        return listaAlunos;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        Scanner ler=new Scanner(System.in);
       String input;
       capa();
         System.out.print("Pressione ENTER:");
       input=ler.nextLine();
      
       String caminho="notas.txt";
       File ficheiro=new File(caminho); 
        
      //Lista lista=new Lista();
     List<Aluno> ListaAlunos = new ArrayList<>();
     //instanciar meu proprio lista correspondente a segunda parte do exercicios
     Lista listaAlunoMeu=new Lista();
        Aluno aluno1=new Aluno();
        //System.out.println("Listar: "+alunos.lista  
        
        //chamar o metudo capa 
        
        
        
        
        
        
        //criar um menu
        int opcao=1;
        while(opcao != 0){
           opcao=Menu(ler);
           
           //swigth case
        switch(opcao){
            case 1:
                limpartela();
                //ssslistaAlunos=ler(ficheiro);
                //adicionar aluno num vetor
                 System.out.println("1--|Adicionar Alunos num vetor|--");
                 
                //System.out.println(alunos.listar());
                
                ListaAlunos=ler(ficheiro);
                //System.out.println("Lista: "+ler(ficheiro));
                Aluno.mostrarDados(ListaAlunos);//
                System.out.print("Pressione ENTER:");
       input=ler.nextLine();
                //System.out.println("Lista de Alunos: "+Aluno.mostrarDados(ListaAlunos));//listar os alunos na lista
            break;
            case 2:
                //metudo que vai limpar tela
                limpartela();
                //Aluno aluno2=ListaAlunos.get(0);
                //aluno2.media(notas);
               // System.out.println("");
                //mostrar a media do aluno
                for (int i = 0; i < ListaAlunos.size(); i++) {
                //instanciar alunos pegos na lista e calcular media 
                    Aluno segundoAluno = ListaAlunos.get(i);
                    System.out.println("Média de "+segundoAluno.getNome()+" é igual a "+segundoAluno.media());
                //segundoAluno.media();
                
                }
               
                
             
                
                
                
                System.out.print("Pressione ENTER:");
       input=ler.nextLine();
                
                //aluno1.media(notas);
                
                break;
            case 3:
                  System.out.println("3--|Ordenar a notas do aluno  |--");
                  //aluno.ordenarElementos(notas);
                  //mostrar a media do aluno
                  Aluno aluno3,aluno4,aluno5;
                //for (int i = 0; i < ListaAlunos.size(); i++) {
                 aluno3 = ListaAlunos.get(1);
                 aluno4=ListaAlunos.get(2);
                aluno5=ListaAlunos.get(0);
                //chamar o metudo ordenar valores
                aluno3.ordenarElementos();
                aluno4.ordenarElementos();
                aluno5.ordenarElementos();
                //listar notas
                
               
                //}
                Aluno.mostrarDados(ListaAlunos);
               
                System.out.print("Pressione ENTER:");
                  input=ler.nextLine();
                  //System.out.println(aluno.imprimir(notas));
                //Ordenar vetor de forma crescente
                break;
            case 4:
                System.out.println("4--|Mostrar aluno com melhor notas|--");
                //aqui corresponde a segunda parti da lista
                listaAlunoMeu=lerNaLista(ficheiro);
                //listar apartir do meu proprio lista  
                
                System.out.println("----tListar Alunos apartir do meu proprio Lista -----");
                System.out.println(listaAlunoMeu.listar());
                System.out.print("Pressione ENTER:");
                input=ler.nextLine();
                //instanciar a classe desciplina
                Desciplina descilplina=new Desciplina("Consepção e Analise de algoritimo ","Valerio", listaAlunoMeu);
                System.out.println("Maior media "+descilplina.melhorMedia());
                
                break;
            default:
                System.out.println("Obrigado!!! Saindo.....");
                break;
        } 
           
        }
       
        
        
     
        
        
    }
        
    }
    

