package uaslp.objetos.figuras;

import uaslp.objetos.figuras.exception.LadoNoProvistoException;
import uaslp.objetos.figuras.exception.NumeroInvalidoDeLados;

import java.lang.Math;


public class PoligonoRegular extends Figura
{
    private double area;
    private double lado;
    private int numeroDeLado;

    public PoligonoRegular(int numeroDeLados)
    {
        if(numeroDeLados < 5)
        {
            throw new NumeroInvalidoDeLados();
        }

        this.numeroDeLado = numeroDeLados;

    }

    public PoligonoRegular(int numeroDeLados, double lado)
    {
        this.numeroDeLado = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getArea()
    {
        double tangente = Math.PI/numeroDeLado;
        double apotema = lado/(2*Math.tan(tangente));

        area =((lado * numeroDeLado) * apotema)/2;
        return area;
    }

    public double getLado()
    {
        return lado;
    }

    public String getName()
    {
        return "Poligono Regular";
    }
}