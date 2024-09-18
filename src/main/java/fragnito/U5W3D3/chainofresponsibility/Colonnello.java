package fragnito.U5W3D3.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Colonnello extends Ufficiale{
    public Colonnello() {
        this.stipendio = 4000;
    }

    @Override
    public void checkStipendio(int num) {
        if(this.stipendio < num) this.next(num);
        else System.out.println("Sono un Colonnello e percepisco " + this.stipendio);
    }
}
