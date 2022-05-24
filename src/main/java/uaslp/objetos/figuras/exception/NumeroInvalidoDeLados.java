package uaslp.objetos.figuras.exception;

public class NumeroInvalidoDeLados extends RuntimeException
{
    public NumeroInvalidoDeLados()
    {

    }


    public String  getMessage()
    {
        return "Número de lados válido a partir de 5";
    }
}
