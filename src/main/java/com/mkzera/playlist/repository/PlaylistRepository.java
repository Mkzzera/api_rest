package com.mkzera.playlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkzera.playlist.model.Playlist;


public interface PlaylistRepository extends JpaRepository<Playlist, Long> {



}
