package fragnito.U5W3D3.Composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Libro implements Readable{
    private List<Pagina> pagine;
    private List<Sezione> sezioni;
    private List<Autore> autori;
    private String titolo;
    private double prezzo;

    public Libro(String titolo, List<Autore> autori, double prezzo, List<Pagina> pagine ){
        this.titolo = titolo;
        this.pagine = pagine;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public Libro(String titolo, List<Autore> autori, double prezzo, List<Pagina> pagine, List<Sezione> sezioni ){
        this.titolo = titolo;
        this.sezioni = sezioni;
        this.pagine = pagine;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    @Override
    public String getText() {
        StringBuilder text = new StringBuilder();
        this.pagine.forEach(pagina -> text.append(pagina.getText()));
        this.sezioni.forEach(sezione -> sezione.getPagine().forEach(pagina -> text.append(pagina.getText())));
        return text.toString();
    }
}
