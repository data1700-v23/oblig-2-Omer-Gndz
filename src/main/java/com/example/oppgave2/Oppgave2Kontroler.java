package com.example.oppgave2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Oppgave2Kontroler {

    private final List<Oppgave2 > tickets  = new ArrayList<>();

    @PostMapping("/save")
    public void save(Oppgave2  ticket){
        tickets.add(ticket);
    }

    @GetMapping("/show")
    public List<Oppgave2 > show(){
        return tickets;
    }

    @GetMapping("/slett")
    public void setTickets(){
        tickets.clear();
    }

}