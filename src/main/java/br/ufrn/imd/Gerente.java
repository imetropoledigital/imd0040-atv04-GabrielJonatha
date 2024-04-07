package br.ufrn.imd;

// Classe Gerente que herda de Funcionario
public class Gerente extends Funcionario {
    private NivelGerenteEnum nivel;
    private String cargo;

    public Gerente(int chMensal, double hh, String cargo) {
        super(chMensal, hh);
        this.cargo = cargo.toLowerCase();
        switch (this.cargo) {
            case "junior":
                nivel = NivelGerenteEnum.JUNIOR;
                break;
            case "pleno":
                nivel = NivelGerenteEnum.PLENO;
                break;
            case "senior":
                nivel = NivelGerenteEnum.SENIOR;
                break;
            default:
                throw new IllegalArgumentException("Cargo de gerente inválido.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public double calcularSalario() {
        double salarioFuncionario = super.calcularSalario();
        return salarioFuncionario + nivel.getBonus();
    }
}
