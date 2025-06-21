public class Idade {

    protected static void verificarIdade(int idade) throws IllegalArgumentException {

        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida! Deve estar entre 0 e 150.");
        }
        
    }

}