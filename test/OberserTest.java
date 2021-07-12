import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OberserTest {
    @Test
    public void deveNotificarUsuario(){
        Mailbox mailbox = new Mailbox("johndoe", "Gmail", true);
        User user = new User("johnjohndoe");
        user.cadastrar(mailbox);
        mailbox.notifyMail();
        Assertions.assertEquals("Usuário johnjohndoe recebeu novo(s) email(s) na caixa johndoe@Gmail[CORP]",
                user.getNotificacao());
    }
    @Test
    public void deveNotificarUsuarios(){
        Mailbox mailbox = new Mailbox("Corp", "Gmail", true);
        User user = new User("johnjohndoe");
        User user2 = new User("maiconDoug");
        user.cadastrar(mailbox);
        user2.cadastrar(mailbox);
        mailbox.notifyMail();
        Assertions.assertEquals("Usuário johnjohndoe recebeu novo(s) email(s) na caixa Corp@Gmail[CORP]",
                user.getNotificacao());
        Assertions.assertEquals("Usuário maiconDoug recebeu novo(s) email(s) na caixa Corp@Gmail[CORP]",
                user2.getNotificacao());

    }
}
