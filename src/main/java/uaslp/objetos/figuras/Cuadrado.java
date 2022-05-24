package uaslp.objetos.figuras;


import uaslp.objetos.figuras.exception.LadoNoProvistoException;

public class Cuadrado extends Figura
    {
        private double lado;
        private double area;

        public Cuadrado()
        {
            this.lado = -1;
        }

        public Cuadrado(double lado)
        {
            this.lado = lado;
        }



        public void setLado(double lado)
        {
            this.lado = lado;
        }

        public double getArea() throws LadoNoProvistoException
        {
            if(lado < 0)
            {
                throw new LadoNoProvistoException();
            }

            area = lado * lado;
            return area;
        }

        public double getLado()
        {
            return lado;
        }

        public String getName()
        {
            return "Cuadrado";
        }


    }