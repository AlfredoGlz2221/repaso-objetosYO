package uaslp.objetos.figuras;


import uaslp.objetos.figuras.exception.AlturaNoProvistaException;
import uaslp.objetos.figuras.exception.BaseNoProvistaException;
import uaslp.objetos.figuras.exception.LadoNoProvistoException;

import java.util.prefs.BackingStoreException;

public class Triangulo extends Figura
{
    private double area;
    private double base;
    private double altura;

    public Triangulo()
    {
        this.altura = -1;
        this.base = -1;

    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getArea()
    {

        if(base < 0 )
        {
            throw new BaseNoProvistaException();

        }
        if(altura < 0)
        {
            throw new AlturaNoProvistaException();
        }




        area = (base * altura)/2;
        return area;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltura()
    {
        if(altura < 0)
        {
            throw new AlturaNoProvistaException();
        }

        return altura;
    }

    public String getDescription()
    {

        return "Cualquier triangulo";
    }

    public String getName()
    {
        return "Triangulo";
    }

}