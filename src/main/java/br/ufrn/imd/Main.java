package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionarioComum = new Funcionario(160, 25.0); // Carga horária mensal: 160 horas, Valor da hora: R$ 25,00
        System.out.println("Salario do funcionario comum: R$ " + funcionarioComum.calcularSalario());

        Gerente gerentejr = new Gerente(160, 25.0, "junior"); // Carga horária mensal: 160 horas, Valor da hora: R$ 25,00, Cargo: Pleno
        System.out.println("Salario do gerente JUNIOR: R$ " + gerentejr.calcularSalario());
        //System.out.println(gerentejr.getCargo());

        Gerente gerentepl = new Gerente(160, 25.0, "pleno"); // Carga horária mensal: 160 horas, Valor da hora: R$ 25,00, Cargo: Pleno
        System.out.println("Salario do gerente PLENO: R$ " + gerentepl.calcularSalario());

        Gerente gerentesn = new Gerente(160, 25.0, "senior"); // Carga horária mensal: 160 horas, Valor da hora: R$ 25,00, Cargo: Pleno
        System.out.println("Salario do gerente SENIOR: R$ " + gerentesn.calcularSalario());
    }
}
