package org.generation.lesson.controller;

import org.generation.lesson.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/songs")
public class SongController {

    private ArrayList<Song> list= new ArrayList<Song>();
    private ArrayList<Song> getSongs() {
        list= new ArrayList<Song>();
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

    @GetMapping("/details")
    public String detail (@RequestParam (name="id") int idSong, Model model) {
        Song canzone=null;
        if(idSong==1) {
            canzone=getSongs().get(0);
        }
        else if(idSong==2) {
            canzone=getSongs().get(1);
        }

        model.addAttribute("canzone",canzone);
       return "DetailSong";
    }





}
