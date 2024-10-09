package com.evento;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Evento evento = new Evento("Festa di Compleanno", new Date(), "Festa per il 30° compleanno.", TipoEvento.PRIVATO, 20);
        EventoDAO eventoDAO = new EventoDAO();
        eventoDAO.save(evento);

        Persona persona = new Persona("Mario", "Rossi", "mario.rossi@example.com", new Date(), "M");
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.save(persona);

        Location location = new Location("Sala Grande", "Roma");
        LocationDAO locationDAO = new LocationDAO();
        locationDAO.save(location);

        Partecipazione partecipazione = new Partecipazione(persona, evento, Stato.CONFERMATA);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
        partecipazioneDAO.save(partecipazione);
    }
}
