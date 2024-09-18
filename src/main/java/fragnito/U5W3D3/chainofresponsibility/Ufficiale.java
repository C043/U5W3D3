package fragnito.U5W3D3.chainofresponsibility;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Ufficiale {
    protected Ufficiale responsabile;
    protected int stipendio;
    public Ufficiale(){
    }
    public abstract void checkStipendio(int num);
    public void next(int num){
        if(this.responsabile != null) this.responsabile.checkStipendio(num);
        else System.out.println("Io sono il capo di tutti, dopo di me non c'è nessuno.");
    }
}
