package pe.ineapp.ep3_mundial.Mundial.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.ineapp.ep3_mundial.Mundial.application.service.CountriesService;
import pe.ineapp.ep3_mundial.Mundial.application.service.PlayerService;
import pe.ineapp.ep3_mundial.Mundial.application.service.StadiumService;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.ContriesRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.PlayerRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.request.StadiumRequest;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.BasicResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.CountriesResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.PlayerResponse;
import pe.ineapp.ep3_mundial.Mundial.infrastructure.response.StadiumResponse;

@RestController
@RequestMapping("/api/v1/worldcup")
public class WorldCupController {

    @Autowired
    private CountriesService countriesService;
    private PlayerService playerService;
    private StadiumService stadiumService;

    @GetMapping
    @RequestMapping("/countries")
    public CountriesResponse getAllCountries(){return countriesService.getAll();}

    @PostMapping
    @RequestMapping("/addcountries")
    public ResponseEntity<BasicResponse> addCountry(@RequestBody ContriesRequest request){
        BasicResponse response = countriesService.addCountry(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @GetMapping
    @RequestMapping("/player")
    public PlayerResponse getAllPlayer(){return playerService.getAll();}

    @PostMapping
    @RequestMapping("/addplayer")
    public ResponseEntity<BasicResponse> addPlayer(@RequestBody PlayerRequest request){
        BasicResponse response = playerService.addPlayer(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @GetMapping
    @RequestMapping("/stadium")
    public StadiumResponse getAllStadium(){return stadiumService.getAll();}

    @PostMapping
    @RequestMapping("/addstadium")
    public ResponseEntity<BasicResponse> addstadium(@RequestBody StadiumRequest request){
        BasicResponse response = stadiumService.addStadium(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }
}
