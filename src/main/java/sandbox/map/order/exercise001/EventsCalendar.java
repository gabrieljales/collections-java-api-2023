package main.java.sandbox.map.order.exercise001;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventsCalendar {
    private Map<LocalDate, Event> eventMap;

    public EventsCalendar() {
        this.eventMap = new HashMap<>();
    }

    public void addEvento(LocalDate date, String name, String attraction) {
        eventMap.put(date, new Event(name, attraction));
    }

    public void showAllEventsOrderedByDate() {
        // LocalDate > implementa a interface ChronoLocalDate > ChronoLocalDate extende a interface Comparable
        // Portanto, LocalDate "já sabe" como organizar as datas em ordem crescente. Por isso usamos TreeMap
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        System.out.println(eventTreeMap); // Ordenado em ordem crescente
    }

    public void getNextEvent() {
        LocalDate now = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);

        // .entrySet(): Retorna um Set<> de objetos Map.Entry
        // Map.Entry: Permite acessar chave e o valor associado a ela em cada iteração
        // Dica: Caso não queira declarar "Map.Entry<LocalDate, Event> entry", podemos usar o var "var entry" e omitir o tipo
        for (Map.Entry<LocalDate, Event> entry : eventMap.entrySet()) {
            if (entry.getKey().isEqual(now) || entry.getKey().isAfter(now)) {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("Próximo evento: " + nextEvent + " acontecerá na data " + nextDate);
                break;
            }
        }

    }
}
