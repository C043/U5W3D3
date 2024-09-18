package fragnito.U5W3D3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Sezione implements Readable{
    private List<Pagina> pagine;
    private List<Sezione> sottoSezioni;
    private String titolo;

    public Sezione(String titolo, List<Pagina> pagine ){
        this.titolo = titolo;
        this.pagine = pagine;
    }

    public Sezione(String titolo, List<Pagina> pagine, List<Sezione> sottoSezioni ){
        this.titolo = titolo;
        this.sottoSezioni = sottoSezioni;
        this.pagine = pagine;
    }

    @Override
    public String getText() {
        StringBuilder text = new StringBuilder();
        this.pagine.forEach(pagina -> text.append(pagina.getText()));
        if(sottoSezioni != null)this.sottoSezioni.forEach(sezione -> sezione.getPagine().forEach(pagina -> text.append(pagina.getText())));
        return text.toString();
    }
}
