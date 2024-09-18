package fragnito.U5W3D3.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Maggiore extends Ufficiale{
    public Maggiore() {
        this.stipendio = 3000;
    }

    @Override
    public void checkStipendio(int num) {
        if(this.stipendio < num) this.next(num);
        else System.out.println("Sono un Maggiore e percepisco " + this.stipendio);
    }
}