/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;


public class No {
    private No proximo;
  private No anterior;
  private  Aluno elemento;

   
 
 //construtor

  
    public No(Aluno elemento) {
        this.elemento = elemento;
    }

  

 
//metudos de acessos 
    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public Aluno getElemento() {
        return elemento;
    }

    public void setElemento(Aluno elemento) {
        this.elemento = elemento;
    }

  

    
 
    
 
}
  

 
