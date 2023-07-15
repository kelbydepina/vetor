/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;


public class Desciplina {
    //declarações de variaveis
    private String titulo;
    private String docente;
    private Lista  alunos;
    
    
    //construtor sem paramitro

    public Desciplina() {
    }
    //construtor com paramitro
    public Desciplina(String titulo, String docente, Lista alunos) {
        this.titulo = titulo;
        this.docente = docente;
        this.alunos = alunos;
    }
    //metudos de acessores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Lista getAlunos() {
        return alunos;
    }

    public void setAlunos(Lista alunos) {
        this.alunos = alunos;
    }
    
    
    //metudo que mostrar o aluno com melhor notas(media)
    public Aluno melhorMedia(){
        //inicializar o No  
        No novo=alunos.getInicio();
        Aluno MediaMaior = null;
        Aluno[] aluno = null;
        //percorrer a lista e calcular a media e ver o maior media
        for (int i = 0; i < alunos.tamanho -1 ; i++) {
            aluno[i]=novo.getElemento();
            if (aluno[i].media() > aluno[i+1].media() ) {
              MediaMaior=aluno[i];  
            }else{
               MediaMaior=aluno[i+1];  
            }
            
            novo=novo.getProximo();
        }
        return MediaMaior;
    }
    
    
    
    
}
