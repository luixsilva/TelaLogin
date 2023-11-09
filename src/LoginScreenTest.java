import org.junit.Test;
import static org.junit.Assert.*;
import autenticacao.LoginScreen; // Substitua 'autenticacao' pelo seu pacote real


public class LoginScreenTest {


    @Test
    public void testLoginSuccess() {
        // Cria uma instância da classe LoginScreen
        LoginScreen loginScreen = new LoginScreen();

        // Define um usuário e senha válidos
        String validUsername = "usuario1";
        String validPassword = "senha123";

        // Verifica se a autenticação é bem-sucedida
        assertTrue(loginScreen.authenticate(validUsername, validPassword));
    }

    @Test
    public void testLoginFailure() {
        // Cria uma instância da classe LoginScreen
        LoginScreen loginScreen = new LoginScreen();

        // Define um usuário existente, mas senha incorreta
        String existingUsername = "usuario2";
        String incorrectPassword = "senha_errada";

        // Verifica se a autenticação falha
        assertFalse(loginScreen.authenticate(existingUsername, incorrectPassword));

        // Define um usuário inexistente
        String nonExistingUsername = "usuario_inexistente";
        String anyPassword = "qualquer_senha";

        // Verifica se a autenticação falha para usuário inexistente
        assertFalse(loginScreen.authenticate(nonExistingUsername, anyPassword));
    }
}


