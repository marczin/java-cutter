package pl.marcinrosol.cutter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/link")
public class LinkController {

    @GetMapping
    public ResponseEntity<?> getLink() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createLink() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
