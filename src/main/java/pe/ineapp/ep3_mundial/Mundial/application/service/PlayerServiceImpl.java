package pe.ineapp.ep3_mundial.Mundial.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ineapp.ep3_mundial.Mundial.domain.entity.Player;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.repository.PlayerRepository;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.PlayerRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.PlayerResponse;

import java.util.List;

@Log4j2
@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public BasicResponse addPlayer(PlayerRequest request) {
        try {
            playerRepository.save(this.buildPlayerFromRequest(request));
            return BasicResponse.whenSuccess();
        }catch(Exception e){
            log.error(e.getMessage());
            return BasicResponse.whenError(e.getMessage());
        }
    }

    public Player buildPlayerFromRequest(PlayerRequest request) {

        return Player.builder()
                .jugador(request.getJugador())
                .pais(request.getPais())
                .edad(request.getEdad())
                .build();
    }

    @Override
    public PlayerResponse getAll() {
        List<Player> playerList= playerRepository.findAll();
        return PlayerResponse.builder().playerList(playerList).build();
    }
}
