import java.util.ArrayList;

public class cursadas {
    public String matricula;
    public String ID_diciplina;
    public String Nome_disciplina;
    public double nota;

    public cursadas(String matric, String materia,String nome_disciplina, Double nota) {
        this.matricula = matric;
        this.ID_diciplina = materia;
        this.nota = nota;
    }

    public void cursada(String matric, String materia, Double nota) {
        this.matricula = matric;
        this.ID_diciplina = materia;
        this.nota = nota;
    }


    public String toString() {
        return matricula+";"+ID_diciplina+";"+nota;
    }

}
