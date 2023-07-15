/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;


public class Lista {
    private No inicio;
    private No ultimo;
    int tamanho=0;
    
    
    
    
 
       //metudos para adicionar alemento no começo da lista duplamente ligada
    
    public void adicionar(Aluno elemento){
        No nova = new No(elemento);
        if(tamanho == 0){
            this.inicio=nova;
            this.ultimo=this.inicio;
           
        }else{
            nova.setProximo(this.inicio);
            inicio.setAnterior(nova);
            this.inicio=nova;
        }
        this.tamanho ++;
        
    }
     //listar lista 
       public String listar(){
        if(tamanho==0){
            return "[]";
        }
         String lista="[";
         No atual=this.inicio;
        //percorres a lista toda
        for(int i=0 ; i<tamanho;i++){
            lista+=""+atual.getElemento()+",";
            
            atual=atual.getProximo();
        }
        lista+="]";
        return lista;
       }       
    
    
    
    //metudos acessores 

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
