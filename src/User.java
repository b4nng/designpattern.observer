import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String username;
    private String notificacao;

    public User(String username) {
        this.username = username;
    }

    public void cadastrar(Mailbox mailbox){
        mailbox.addObserver(this);
    }

    public String getNotificacao() {
        return notificacao;
    }

    @Override
    public void update(Observable mailbox, Object arg) {
        this.notificacao = "Usuário "+this.username+" recebeu novo(s) email(s) na caixa "+mailbox.toString();
    }
}
