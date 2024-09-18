package fragnito.U5W3D3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Pagina implements Readable{
    private String parole;

    @Override
    public String getText() {
        return this.parole;
    }
}
