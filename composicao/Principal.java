package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws ParseException {

        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy");

        Departamento departamento = new Departamento();
        Trabalhador trabalhador = new Trabalhador();
        HoraContrato hora = new HoraContrato();

        System.out.print("Nome do departamento: ");
        departamento.setName(leitor.nextLine());

        System.out.println("Informações do trabalhador:");
        System.out.print("Nome: ");
        trabalhador.setName(leitor.nextLine());

        System.out.print("Level: ");
        trabalhador.setNivel(NivelDoTrabalhador.valueOf(leitor.nextLine()));

        System.out.print("Salario: ");
        trabalhador.setSalario(leitor.nextDouble());

        System.out.print("Quantos contratos o trabalhador tem: ");
        int num = leitor.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Entre o contrato " + i + " data: ");
            System.out.print("Data (DD/MM/YYYY): ");
            hora.setData(dat.parse(leitor.next()));
            System.out.print("Valor por hora: ");
            hora.setValorPorHora(leitor.nextDouble());
            System.out.print("Duração (Horas): ");
            hora.setHora(leitor.nextInt());
            trabalhador.addContrato(hora);
        }

        System.out.println(" ");
        System.out.print("Digite o mes e o ano para calcular a renda: ");
        String mes_E_Ano = leitor.nextLine();
        int mes = Integer.parseInt(mes_E_Ano.substring(0, 2));
        int ano = Integer.parseInt(mes_E_Ano.substring(3));
        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + departamento.getName());
        System.out.println("Renda do dia " + mes_E_Ano + " : " + trabalhador.renda(mes, ano));

        leitor.close();
    }
}
