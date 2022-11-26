import org.example.Nota;
import org.example.Uc;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UcTeste {
    static Uc uc;

    @BeforeAll
    public static void Uc() {
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota(42604, 20));
        notas.add(new Nota(42400, 18));
        notas.add(new Nota(20, 7));
        uc = new Uc("Lam",notas, notas.size());
    }
    @DisplayName("Inserir notas teste")
    @ParameterizedTest
    @CsvSource(value={"10,16","11,20","40,40"})
    public void inserirNotaUcTest(int arg,int arg2){
        assertTrue(uc.insereNotaUC(arg,arg2),"NOTA INVALIDA");
    }

    @DisplayName("Pesquisar aluno")
    @ParameterizedTest
    @ValueSource(ints = {20,40,60,42400,42604})
    public void pesquisarAlunoTest(int arg){
        assertTrue(uc.pesquisaAluno(arg),"Aluno nao encontrado");
    }

    @DisplayName("Media")
    @Test
    public void media(){
        assertEquals(18,uc.media(),"Media errada");
    }

    @DisplayName("Aprovado")
    @ParameterizedTest
    @ValueSource(ints={20,30,40,42400,42604})
    public void aprovado(int arg){
        assertTrue(uc.aprovado(arg),"Aluno nao aprovado");
    }
}
