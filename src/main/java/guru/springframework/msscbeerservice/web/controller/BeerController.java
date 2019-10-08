package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto>getBeerById(@PathVariable("beerId") UUID beerId){
        //todo
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //todo
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID id, @RequestBody BeerDto beerDto){
        //todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
