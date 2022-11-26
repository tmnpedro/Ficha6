package org.example;

import java.util.ArrayList;

public class Uc {
    String nomeUc; // nome da unidade curricular
    ArrayList<Nota> notas = new ArrayList<>(); // array com as notas de cada aluno
    int totalAlunos; // nºmaximo de alunos na Uc

    public Uc(String nomeUc, ArrayList<Nota> notas, int totalAlunos){
        this.nomeUc = nomeUc;
        this.notas= notas;
        this.totalAlunos=totalAlunos;
    }
    public String getNomeUc(){
        return nomeUc;
    }
    public void setNomeUc(String nomeUc){
        this.nomeUc=nomeUc;
    }
    public ArrayList<Nota> getNotas(){
        return notas;
    }
    public void setNotas(ArrayList<Nota>notas){
        this.notas=notas;
    }
    public int getTotalAlunos(){
        return totalAlunos;
    }
    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;

    }
    //-----------------------------------------------------------------------
    public boolean insereNotaUC(int numAluno, double nota){
        if (nota>=0 && nota<=20) {
            notas.add(new Nota(numAluno, nota));
            return true;
        }else{
            return false;
        }
    }
    public boolean pesquisaAluno(int numAluno) {
        for(int i=0; i< notas.size();i++){
            if(numAluno== notas.get(i).getNumAluno()){
                return true;
            }
        }
        return false;
    }

    public double media(){
        double sum=0 ;
        for(int i=0;i< notas.size();i++){
            sum+=notas.get(i).getNota();
        }
        return sum/notas.size();
    }

    public boolean aprovado(int numAluno){
        for (int i=0;i<notas.size();i++){
            if(numAluno==notas.get(i).getNumAluno()){
                if(notas.get(i).getNota()>=9.5){
                    return true;
                }
            }
        }
        return false;
    }
}
