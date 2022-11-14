package pe.ineapp.ep3_mundial.Mundial.infrastructure.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ContriesRequest {
    private String pais;
    private String continente;
    private String grupo;
}
