package pe.ineapp.ep3_mundial.Mundial.infrastructure.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StadiumRequest {
    private String estadio;
    private String ciudad;
}
