import java.util.Observable;

public class Mailbox extends Observable {
    private String user;
    private String tipoEmail;
    private boolean isCorporativo;

    public Mailbox(String user, String tipoEmail, boolean isCorporativo) {
        this.user = user;
        this.tipoEmail = tipoEmail;
        this.isCorporativo = isCorporativo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(String tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public boolean isCorporativo() {
        return isCorporativo;
    }

    public String corporatividade(){
        if(isCorporativo){return "[CORP]";}
        else {
            return null;
        }
    }

    @Override
    public String toString(){
        return this.user+"@"+this.tipoEmail+corporatividade();
    }

    public void setCorporativo(boolean corporativo) {
        isCorporativo = corporativo;
    }

    public void notifyMail(){
        setChanged();
        notifyObservers();
    }

}
