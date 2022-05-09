package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String name;
    private NivelDoTrabalhador nivel;
    private double salario;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String name, NivelDoTrabalhador nivel, double salario, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelDoTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhador nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public void addContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes) {
        double soma = salario;
        Calendar cal = Calendar.getInstance();
        for (HoraContrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
