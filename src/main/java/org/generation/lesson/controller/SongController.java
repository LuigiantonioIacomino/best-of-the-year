package org.generation.lesson.controller;

import org.generation.lesson.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/songs")
public class SongController {

    private ArrayList<Song> list= new ArrayList<Song>();
    private ArrayList<Song> getSongs() {
        list.add(new Song(1,"Roar","Katy Perry"));
        list.add(new Song(2,"Chandelier","Sia"));
        return list;
    }

    @GetMapping
    public String song (Model model) {
    ArrayList<Song> songs=getSongs();
    model.addAttribute("lista",songs);
    return "listSongs";

    }



}
