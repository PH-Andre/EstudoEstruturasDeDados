import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int menu = 1;
        ArrayList<aluno> ListaAlunos =  new ArrayList<>();
        ArrayList<disciplina> Disciplinas =  new ArrayList<>();


       /* ListaAlunos.add(new aluno("A00","Fel")) ;
        ListaAlunos.add(new aluno("A01","ped")) ;
        ListaAlunos.add(new aluno("A02","Jul")) ;

        Disciplinas.add(new disciplina ("D00", "Algoritmos I",4));
        Disciplinas.add(new disciplina ("D01", "Banco de Dados",3));
        Disciplinas.add(new disciplina ("D02", "Algoritmos II",4));
        Disciplinas.add(new disciplina ("D03", "Engenharia de Software",2));
        Disciplinas.add(new disciplina ("D04", "Redes de Computadores",3));

        aluno xx = ListaAlunos.get(0);
        xx.addmateria("A00","D01","Banco de Dados",9.5);
        xx.addmateria("A00","D00","Algoritmos I",7.5);
        xx.addmateria("A00","D02","Algoritmos II", 7.0);

         xx = ListaAlunos.get(1);
        xx.addmateria("A01","D01","Banco de Dados",6.5);
        xx.addmateria("A01","D00","Algoritmos I",3.5);
        xx.addmateria("A01","D02","Algoritmos II",7.2);

         xx = ListaAlunos.get(2);
        xx.addmateria("A02","D01","Banco de Dados",3.5);
        xx.addmateria("A02","D00","Algoritmos I",5.5);
        xx.addmateria("A02","D02","Algoritmos II",9.2);

        disciplina xy;

        xy = Disciplinas.get(0);
        xy.addCompleto("A00","D00", "Algoritmos I",7.5);
        xy.addCompleto("A01","D00","Algoritmos I",3.5);
        xy.addCompleto("A02","D00","Algoritmos I",5.5);

        xy = Disciplinas.get(1);
        xy.addCompleto("A02","D01","Banco de Dados",3.5);
        xy.addCompleto("A01","D01","Banco de Dados",6.5);
        xy.addCompleto("A00","D01","Banco de Dados",9.5);

        xy = Disciplinas.get(2);
        xy.addCompleto("A02","D02","Algoritmos II",9.2);
        xy.addCompleto("A01","D02","Algoritmos II",7.2);
        xy.addCompleto("A00","D02","Algoritmos II",7.0); */

        while (menu != 0){
           metodos faculdade = new metodos();

           menu = faculdade.menuInicial();

            if (menu == 1){
                System.out.println("1 - Cadastrar novo aluno");
                System.out.println("2 - Editar aluno");
                System.out.println("Outro para voltar ao menu inicial");
                int newaluno = scan.nextInt();

                if (newaluno == 1){
                    System.out.print("Digite a matricula: ");
                    String matrc = scan.next();
                    String name;

                    boolean jaExiste = false;

                    for (int i = 0; i < ListaAlunos.size(); i++) {
                        aluno testando = ListaAlunos.get(i);
                        if (testando.matricula.equals(matrc)){
                            jaExiste = true;}
                    }

                    if (jaExiste == true) {
                        System.out.println("matricula ja esta sendo utilizada");
                        System.out.println("---------------------------------");
                    }else{
                        System.out.print("Digite o nome do aluno: ");
                        name = reader.readLine();
                        ListaAlunos.add(new aluno(matrc,name)) ;
                        System.out.println("_____aluno adicionado com Sucesso_______");
                    }


                }else if (newaluno == 2){
                    System.out.println("Digite a matricula do aluno que vc quer editar: ");
                    aluno editando = null;
                    int posicaoaluno = 0;
                    boolean existe;
                    String matric = scan.next();

                    for (int i = 0; i < ListaAlunos.size(); i++) {
                        aluno testando = ListaAlunos.get(i);
                        if (testando.matricula.equals(matric)) {
                            posicaoaluno = i;
                            editando = ListaAlunos.get(i);
                        } else {
                            existe = false;
                        }
                    }

                    if (existe = true) {
                        System.out.println(editando);

                        System.out.println("nova matricula: ");
                        editando.matricula = scan.next();
                        System.out.println("novo nome: ");
                        editando.nome = reader.readLine();

                        System.out.println("quantas disciplina quer remover:");
                        int removernum = scan.nextInt();

                        for (int i = 0; i < removernum; i++) {
                            System.out.println("codigo da disciplina: ");
                            String cod = scan.next();
                            cursadas remover = editando.cursadas_aluno.get(i);
                            if (remover.ID_diciplina.equals(cod)) {
                               editando.cursadas_aluno.remove(i);

                                for (int j = 0; j < Disciplinas.size(); j++) {
                                    disciplina excluir = Disciplinas.get(j);
                                    if (excluir.ID_diciplina.equals(cod)){
                                        excluir.alunosCursaram.remove(j);
                                    }
                                }



                            }
                        }

                        //ListaAlunos.remove(posicaoaluno);
                       // ListaAlunos.add(posicaoaluno ,editando);

                    }else {
                        System.out.println("aluno não existe");
                    }

                } else { }

            }
            else if (menu == 2){
                System.out.println(ListaAlunos);

            }
            else if (menu == 3){
                System.out.println("1 - Cadastrar nova Disciplina");
                System.out.println("2 - Editar Disciplina");
                System.out.println("Outro para voltar ao menu inicial");
                int newDiciplina = scan.nextInt();

                if (newDiciplina == 1){
                    System.out.print("Digite o codigo da disciplina ");
                    String matrc = scan.next();
                    String name;

                    boolean jaExiste = false;

                    for (int i = 0; i < Disciplinas.size(); i++) {
                        disciplina testando = Disciplinas.get(i);
                        if (testando.ID_diciplina.equals(matrc)){
                            jaExiste = true;}
                    }

                    if (jaExiste == true) {
                        System.out.println("Código de Disciplina em uso");
                        System.out.println("---------------------------------");
                    }else{
                        System.out.print("Digite o nome da Disciplina: ");
                        name = reader.readLine();
                        System.out.print("Digite o numero de Créditos: ");
                        int creditos = scan.nextInt();

                        Disciplinas.add(new disciplina(matrc,name,creditos)) ;
                        System.out.println("_____Disciplina adicionada com Sucesso_______");
                    }

                }else if (newDiciplina == 2){

                    System.out.println("Digite o codigo da diciplina que vc quer editar: ");
                    disciplina editando = null;
                    int posicaoDisciplina = 0;
                    boolean existe;
                    String matric = scan.next();

                    for (int i = 0; i < Disciplinas.size(); i++) {
                        disciplina testando = Disciplinas.get(i);
                        if (testando.ID_diciplina.equals(matric)) {
                            posicaoDisciplina = i;
                            editando = Disciplinas.get(i);
                        } else {
                            existe = false;
                        }
                    }

                    if (existe = true) {
                        System.out.println(editando);

                        System.out.println("novo Codigo de Disciplina: ");
                        editando.ID_diciplina = scan.next();
                        System.out.println("novo nome: ");
                        editando.name_diciplina = reader.readLine();
                        System.out.println("Quantidade de Creditos: ");
                        editando.creditos = scan.nextInt();
                        System.out.println("_____DISCIPLINA ATUALIZADA COM SUCESSO_____");
                    }

                }else { }

            }
            else if (menu == 4){
                System.out.println(Disciplinas);
            }

            else if (menu == 5){
                boolean existe = false;
                System.out.println("Matricula do aluno: ");
                String matric = reader.readLine();

                for (int i = 0; i < ListaAlunos.size(); i++) {
                    aluno testando = ListaAlunos.get(i);
                    if (testando.matricula.equals(matric)){
                        existe = true;}
                }

                if (existe == true) {
                    existe = false;

                    System.out.println("Código da Disciplina completada: ");
                    String Codig = reader.readLine();

                    for (int i = 0; i < Disciplinas.size(); i++) {
                        disciplina testando = Disciplinas.get(i);
                        if (testando.ID_diciplina.equals(Codig)){
                            existe = true;}
                    }

                    if (existe == true){
                        String nomeD = null;

                        System.out.println("Média obtida");
                        double nota = scan.nextDouble();

                        for (int i = 0; i < Disciplinas.size(); i++) {
                            disciplina testando = Disciplinas.get(i);
                            if (testando.ID_diciplina.equals(matric)) {
                                nomeD = testando.name_diciplina;

                                disciplina editando = Disciplinas.get(i);

                                editando.addCompleto(matric, Codig,nomeD, nota);
                            }
                        }

                        for (int i = 0; i < ListaAlunos.size(); i++) {
                            aluno testando = ListaAlunos.get(i);
                            if (testando.matricula.equals(matric)) {

                                aluno editando = ListaAlunos.get(i);

                                editando.addmateria(matric, Codig,nomeD, nota);
                            }
                        }






                    } else {
                        System.out.println("_____________________Disciplina não Existe_____________________");
                    }

                }else {
                    System.out.println("_______ aluno não existe _______");
                }




            }

            else if (menu == 6){
                System.out.println("Matricula do Aluno");
                String alunoo = reader.readLine();

                for (int i = 0; i < ListaAlunos.size(); i++) {
                    aluno DonoHistorico = ListaAlunos.get(i);
                    if (DonoHistorico.matricula.equals(alunoo)){
                        System.out.println("aluno: "+ DonoHistorico.nome);
                        System.out.println("Matricula : "+ DonoHistorico.matricula);
                        System.out.println("Código          Disciplina             Crédito      Nota");
                        int somaCred = 0;
                        double media = 0;
                        int vezz = 0;
                         for (int j = 0; j < DonoHistorico.cursadas_aluno.size(); j++) {
                             String credit = null;
                             cursadas xxx = DonoHistorico.cursadas_aluno.get(j);
                             media = media + xxx.nota;
                             vezz ++;

                             for (int k = 0; k < Disciplinas.size(); k++) {
                                 disciplina teste2 = Disciplinas.get(k);

                                 if (teste2.ID_diciplina.equals(xxx.ID_diciplina)){
                                     somaCred = somaCred + teste2.creditos;



                                 System.out.println(xxx.ID_diciplina + "          " + teste2.name_diciplina + "             " + teste2.creditos+"            "
                                 + xxx.nota);
                                    }
                             }
                         }

                        System.out.println("");
                        System.out.println("");
                        System.out.println("Total de créditos : "+ somaCred);
                        System.out.println("Média geral : " + (media/vezz));

                    }

                }


            }
            else if (menu == 7){
                System.out.println("Código da Disciplina");
                String Codigo = reader.readLine();

                for (int i = 0; i < Disciplinas.size(); i++) {
                    disciplina Historico = Disciplinas.get(i);
                    if (Historico.ID_diciplina.equals(Codigo)){
                        System.out.println("Disciplina: "+ Historico.name_diciplina);
                        System.out.println("Código : "+ Historico.ID_diciplina);
                        System.out.println("Número de Créditos: "+ Historico.creditos);
                        System.out.println("Matricula           Nome do Aluno          Nota");

                        for (int j = 0; j < Historico.alunosCursaram.size(); j++) {
                            String credit = null;
                            cursadas xxx = Historico.alunosCursaram.get(j);

                            for (int k = 0; k < ListaAlunos.size(); k++) {
                                aluno teste2 = ListaAlunos.get(k);

                                if (teste2.matricula.equals(xxx.matricula)){
                                    System.out.println(xxx.matricula+"                     "+teste2.nome+"                "+xxx.nota);
                                }
                            }
                        }

                    }

                }


            }


//C:\\Users\\paulo\\Downloads\\arquivos-ativ7\\alunos.csv
            else if (menu == 8){
                System.out.println("digite o endereço do arquivo com 2 barras como o exemplo abaixo");

                System.out.println("C:\\\\Users\\\\paulo\\\\Downloads\\\\arquivos-ativ7\\\\alunos.csv");
                String endereco = reader.readLine();
                ArrayList<String> arquivoImportado = metodos.LerArquivo2(endereco);

                System.out.println(arquivoImportado);


                int numeroDados = arquivoImportado.size();

                System.out.println("Digite o numero correspondente a importação:");
                System.out.println("1- Alunos");
                System.out.println("2- Disciplina");
                System.out.println("3- materia concluida");
                int escolha = scan.nextInt();

                if (escolha == 1){

                    String[] retorno = new String[0];
                    BufferedReader conteudo = null;
                    String linha = "";
                    String separador = ";";
                    int contador = 0;

                    while (contador < arquivoImportado.size()) {
                        String[] importe = arquivoImportado.get(contador).split(separador);
                        contador++;
                        aluno add = new aluno(importe[0], importe[1] );
                        ListaAlunos.add(add);
                    }

                }else if (escolha == 2){
                    String[] retorno = new String[0];
                    BufferedReader conteudo = null;
                    String linha = "";
                    String separador = ";";
                    int contador = 0;

                    while (contador < arquivoImportado.size()) {
                        String[] importe = arquivoImportado.get(contador).split(separador);
                        contador++;
                        int terceiroElement = Integer.parseInt(importe[2]);
                        disciplina add = new disciplina(importe[0], importe[1], terceiroElement);
                        Disciplinas.add(add);

                }}
                else if (escolha == 3){
                        String[] retorno = new String[0];
                        BufferedReader conteudo = null;
                        String linha = "";
                        String separador = ";";
                        int contador = 0;

                        while (contador < arquivoImportado.size()) {
                            String[] importe = arquivoImportado.get(contador).split(separador);
                            contador++;

                            String aluno = importe[0];
                            String disciplina = importe[1];
                            double nota = Double.parseDouble(importe[2]);
                            String nomed = null;



                            for (int i = 0; i < Disciplinas.size(); i++) {
                                disciplina testando = Disciplinas.get(i);
                                if (testando.ID_diciplina.equals(disciplina)) {
                                    nomed = testando.name_diciplina;
                                    disciplina editando = Disciplinas.get(i);

                                    editando.addCompleto(aluno, disciplina,nomed, nota);
                                }
                            }

                            for (int i = 0; i < ListaAlunos.size(); i++) {
                                aluno testando = ListaAlunos.get(i);
                                if (testando.matricula.equals(aluno)) {

                                    aluno editando = ListaAlunos.get(i);

                                    editando.addmateria(aluno, disciplina,nomed, nota);
                                }
                            }
                        }
                }




        }

    }
}
}
