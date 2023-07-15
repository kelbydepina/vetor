/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;


public class Vetor {
    private String [] notas;
    int tamanho=0;

   
    
    //criar construtor onde vai instanciar o vetor
    

    public Vetor() {
    }

    public Vetor(int capacidade) {
        notas=new String [capacidade];
    }
    
    //adicionar elementos no fim do vetor
    public boolean adicionar(String nota){
        if(this.tamanho == notas.length ){
            System.out.println("lista cheia");
            return false;
        }
         notas[this.tamanho]=nota;
            this.tamanho++;
            return true;
        
    }
    
    //imprimir na tela
    public  String imprimir(){
        String lista="[";
        if(this.tamanho == 0){
           lista="Lista vazia";
         
        }else{
            for (int i = 0; i < tamanho; i++) {
                lista+=notas[i];
                lista+=", ";
            }
            lista+="]";
        }
        return lista;
    }
    
    
    
    
     //ordenar elementos por orden crescente na lista
    public static void ordenarElementos(int[] notas){
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
    
}
