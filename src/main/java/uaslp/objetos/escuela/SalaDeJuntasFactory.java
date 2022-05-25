package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    private static SalaDeJuntas salaDeJuntas_insanceA = null;
    private static SalaDeJuntas salaDeJuntas_insanceB = null;
    private static SalaDeJuntas salaDeJuntas_insanceC = null;


    public static SalaDeJuntas get(String sala) {
        if (sala == null) {
            return null;
        }

        if (sala == "Sala A") {
            if (salaDeJuntas_insanceA == null) {
                salaDeJuntas_insanceA = new SalaDeJuntas(sala);

                return salaDeJuntas_insanceA;
            }

            return salaDeJuntas_insanceA;
        }

        if (sala == "Sala B") {
            if (salaDeJuntas_insanceB == null) {
                salaDeJuntas_insanceB = new SalaDeJuntas(sala);

                return salaDeJuntas_insanceB;
            }

            return salaDeJuntas_insanceB;

        }

        if (sala == "Sala C") {
            if (salaDeJuntas_insanceC == null) {
                salaDeJuntas_insanceC = new SalaDeJuntas(sala);

                return salaDeJuntas_insanceC;
            }

            return salaDeJuntas_insanceC;


        }

        return null;
    }
}
