import java.util.ArrayList;

public class disciplina {
    public String ID_diciplina;
    public String name_diciplina;
    public int creditos;
    public ArrayList<cursadas> alunosCursaram;

    public disciplina(String matric, String name, int credit) {
        this.ID_diciplina = matric;
        this.name_diciplina = name;
        this.creditos = credit;
        alunosCursaram = new ArrayList<>();
    }

    public void addCompleto(String aluno, String materia, String nomee, double not){
        this.alunosCursaram.add(new cursadas(aluno, materia,nomee, not));
    }

    public String toString() {
        System.out.println("------------------------------------------");
        System.out.println("Código: " + this.ID_diciplina);
        System.out.println("Disciplina: " + this.name_diciplina);
        System.out.println("Créditos: " + this.creditos);
        System.out.println(this.alunosCursaram);
        return "";
    }

}
