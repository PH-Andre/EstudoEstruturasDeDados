import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class metodos {

    public static int menuInicial;

    public int menuInicial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("           Bem-vindo             ");
        System.out.println("Controle do campus " +
                "Digite o numero do que você deseja Fazer;");

        System.out.println(" 1 - Cadastrar/Editar dados aluno");
        System.out.println(" 2 - Todos Alunos");
        System.out.println(" 3 - Cadastrar/Editar Disciplina");
        System.out.println(" 4 - Todas Disciplinas");
        System.out.println(" 5 - Registro de matéria cursada");
        System.out.println(" 6 - Historico Escolar aluno de aluno");
        System.out.println(" 7 - Relatório de notas da disciplina");
        System.out.println(" 8 - Importar informações");

        System.out.print("Opção:");
        int menu = scan.nextInt();
        return menu;
    }
    // C:\\Users\\paulo\\Desktop\\drive-download-20220717T185531Z-001\\Dadosparaimportar\\matriculas.csv
//C:\\Users\\paulo\\Desktop\\drive-download-20220717T185531Z-001\\Dadosparaimportar\\alunos.csv
// C:\\Users\\paulo\\Desktop\\drive-download-20220717T185531Z-001\\Dadosparaimportar\\disciplinas.csv
    public static String[] LerArquiv(String endreco) throws IOException {
        String[] retorno = new String[0];
        BufferedReader conteudo = null;
        String linha = "";
        String separador = ";";

        conteudo = new BufferedReader(new FileReader(endreco));
        while ((linha = conteudo.readLine()) != null){
            String[] importe = linha.split(separador);
            retorno = importe;
        }

    return retorno;
    }

    public static ArrayList<String> LerArquivo2(String endreco) throws IOException {
        ArrayList<String> retorno = new ArrayList<>();
        String linhasDoArquivo = new String();
        File file = new File(endreco);
        Scanner leitor = new Scanner(file);

        int contador = 0;
        while (leitor.hasNext()){
            linhasDoArquivo = leitor.nextLine();
            retorno.add(linhasDoArquivo);
            contador++;
        }
        for (int i = 0; i < retorno.size(); i++) {
            System.out.println(retorno.get(i));
        }
        return retorno;
    }




    }



