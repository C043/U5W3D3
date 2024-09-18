package fragnito.U5W3D3.Adapter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds){
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}
