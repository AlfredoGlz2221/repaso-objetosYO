package uaslp.objetos.figuras;


public class Triangulo extends Figura
{
    private double area;
    private double base;
    private double altura;

    public Triangulo()
    {

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
        area = (base * altura)/2;
        return area;
    }

    public double getBase()
    {
        return base;
    }

    public double getAltura()
    {

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