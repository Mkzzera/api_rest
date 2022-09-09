package com.mkzera.playlist.controller;


import com.mkzera.playlist.model.Playlist;
import com.mkzera.playlist.repository.PlaylistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class PlaylistController {


    @Autowired
    PlaylistRepository playlistRepository;

    @GetMapping("/playlist")
    public List<Playlist> listaPlaylist() { 
    	return playlistRepository.findAll();
    }


}
