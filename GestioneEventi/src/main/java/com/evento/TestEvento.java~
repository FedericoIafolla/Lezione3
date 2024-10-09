package com.evento;

import java.util.Date;

public class TestEvento {
    public static void main(String[] args) {
        EventoDAO eventoDAO = new EventoDAO();

        // Creazione di un nuovo evento
        Evento evento = new Evento("Concerto", new Date(), "Concerto di musica dal vivo", TipoEvento.PUBBLICO, 100);
        eventoDAO.save(evento);

        // Recupero dell'evento
        Evento recuperato = eventoDAO.getById(evento.getId());
        System.out.println("Evento recuperato: " + recuperato.getTitolo());

        // Cancellazione dell'evento
        eventoDAO.delete(evento.getId());
        System.out.println("Evento cancellato.");
    }
}
