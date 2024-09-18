package fragnito.U5W3D3.Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.sql.DataSource;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;
    private void getData(Adapter ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}
