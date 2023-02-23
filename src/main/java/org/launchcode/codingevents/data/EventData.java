package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to store events, a data structure
    // static so there is only one
    // Map is an interface that stores key value pairs
    // In this case the keys will be ID's and the values will be an event Object
    private static Map<Integer, Event> events = new HashMap<>();

    // get all events
    public static Collection<Event> getAllEvents(){
        return events.values();
    }

    // get single event
    public static Event getById(int id){
        return events.get(id);
    }

    // add an event
    public static void add(Event event){
        events.put(event.getId(),event);
    }

    // remove an event
    public static void remove(int id){
        events.remove(id);
    }


}
