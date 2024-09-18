package fragnito.U5W3D3.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Generale extends Ufficiale{
    public Generale() {
        this.stipendio = 5000;
    }

    @Override
    public void checkStipendio(int num) {
        if(this.stipendio < num) this.next(num);
        else System.out.println("Sono un generale e percepisco " + this.stipendio);
    }
}
