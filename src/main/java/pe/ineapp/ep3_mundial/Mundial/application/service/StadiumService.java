package pe.ineapp.ep3_mundial.Mundial.application.service;


import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.StadiumRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.StadiumResponse;

public interface StadiumService {

    public BasicResponse addStadium(StadiumRequest request);

    public StadiumResponse getAll();
}
