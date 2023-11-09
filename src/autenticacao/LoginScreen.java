package autenticacao;
import java.util.HashMap;
import java.util.Map;
/**
 * A classe {@code LoginScreen} representa a tela de login e contém a lógica de autenticação de usuários.
 */
public class LoginScreen {
    // Simula um banco de dados de usuários com pares usuário-senha
    private static final Map<String, String> userDatabase = new HashMap<>();

    static {
        // Adiciona alguns usuários de exemplo (substitua com dados reais)
        userDatabase.put("usuario1", "senha123");
        userDatabase.put("usuario2", "senha456");
    }
    /**
     * Autentica um usuário com um nome de usuário e senha fornecidos.
     *
     * @param username O nome de usuário a ser autenticado.
     * @param password A senha correspondente ao nome de usuário.
     * @return {@code true} se a autenticação for bem-sucedida, {@code false} caso contrário.
     */
    public boolean authenticate(String username, String password) {
        // Verifica se o usuário existe no banco de dados
        if (userDatabase.containsKey(username)) {
            // Obtém a senha armazenada no banco de dados
            String storedPassword = userDatabase.get(username);

            // Compara a senha fornecida com a senha armazenada
            return password.equals(storedPassword);
        }

        // Retorna falso se o usuário não existe no banco de dados
        return false;
    }
}
