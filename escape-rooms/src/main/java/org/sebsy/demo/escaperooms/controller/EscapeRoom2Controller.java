package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Bean nommé "room2" car Startup le récupère avec getBean("room2")
@Component("room2")
public class EscapeRoom2Controller {

    private RoomService roomService;

    @Autowired
    public EscapeRoom2Controller(RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }
}
