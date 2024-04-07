package br.ufrn.imd;
public enum NivelGerenteEnum{
    JUNIOR(1000.00),
    PLENO(2000.00),
    SENIOR(3000.00);

    private double valor;

    private double bonus;

    NivelGerenteEnum(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

}
