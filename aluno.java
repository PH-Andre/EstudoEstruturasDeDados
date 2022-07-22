import java.util.ArrayList;

public class aluno {
    public String matricula;
    public String nome;
    public ArrayList<cursadas> cursadas_aluno;

    public aluno(String matric, String name) {
        this.matricula = matric;
        this.nome = name;
        cursadas_aluno = new ArrayList<>();
    }

    public void addmateria(String aluno, String materia,String nome, double not){
        this.cursadas_aluno.add(new cursadas(aluno, materia,nome, not));
    }






    public String toString() {
        System.out.println("------------------------------------------");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Aluno: " + this.nome);
        System.out.println(this.cursadas_aluno);
        return "";
    }


}
