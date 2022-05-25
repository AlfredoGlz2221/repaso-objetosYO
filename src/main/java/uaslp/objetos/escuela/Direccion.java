package uaslp.objetos.escuela;

public class Direccion
{
    private static Direccion direccion_insance = null;
    public String s;

    private Direccion()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static Direccion getInstance()
    {
        if (direccion_insance == null)
            direccion_insance = new Direccion();

        return direccion_insance;
    }
}
