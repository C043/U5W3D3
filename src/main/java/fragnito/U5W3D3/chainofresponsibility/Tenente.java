package fragnito.U5W3D3.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Tenente extends Ufficiale{
    public Tenente() {
        this.stipendio = 1000;
    }

    @Override
    public void checkStipendio(int num) {
        if(this.stipendio < num) this.next(num);
        else System.out.println("Sono un tenente e percepisco " + this.stipendio);
    }
}
