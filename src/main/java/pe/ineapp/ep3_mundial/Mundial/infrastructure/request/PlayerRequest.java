package pe.ineapp.ep3_mundial.Mundial.infrastructure.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayerRequest {
    private String jugador;
    private String pais;
    private String edad;
}
