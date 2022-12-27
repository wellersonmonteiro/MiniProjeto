public class Metodo {
    public static void main (String[] ags){
        String primeiroNome = "Wellerson";
        String segundoNome = "Monteiro";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
