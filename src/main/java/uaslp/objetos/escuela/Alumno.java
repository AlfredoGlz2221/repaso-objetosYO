package uaslp.objetos.escuela;

import java.time.LocalDate;

public class Alumno
{
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    private Alumno(builder builder)
    {
        this.nombre = builder.nombre;
        this.clave = builder.clave;
        this.claveDeCarrera = builder.claveDeCarrera;
        this.anioDeIngreso = builder.anioDeIngreso;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public void nombre(String nombre) {
        this.nombre = nombre;
    }

    public void clave(String clave) {
        this.clave = clave;

    }

    public void claveDeCarrera(String claveDeCarrera) {
        this.claveDeCarrera = claveDeCarrera;
    }

    public void anioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public void fechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
/*
    public static Alumno builder()
    {

    }
*/
    public static class builder
    {
        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;

        public builder()
        {
           
        }



        public builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public builder clave(String clave) {
            this.clave = clave;
            return this;
        }

        public builder claveDeCarrera(String claveDeCarrera) {
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public builder anioDeIngreso(int anioDeIngreso) {
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public builder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return new Alumno(this);
        }

    }
}