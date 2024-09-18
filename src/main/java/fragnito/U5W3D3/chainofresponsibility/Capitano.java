package fragnito.U5W3D3.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Capitano extends Ufficiale{
    public Capitano() {
        this.stipendio = 2000;
    }

    @Override
    public void checkStipendio(int num) {
        if(this.stipendio < num) this.next(num);
        else System.out.println("Sono un capitano e percepisco " + this.stipendio);
    }
}
