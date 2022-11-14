package pe.ineapp.ep3_mundial.Mundial.application.service;

import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.PlayerRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.PlayerResponse;

public interface PlayerService {

    public BasicResponse addPlayer(PlayerRequest request);

    public PlayerResponse getAll();
}
