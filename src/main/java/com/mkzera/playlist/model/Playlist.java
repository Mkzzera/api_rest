package com.mkzera.playlist.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "playlist")

public class Playlist implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private Long idPlaylist;
	private String nome;
    private String musica;


    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Long getIdPlaylist() {
		return idPlaylist;
	}

	public void setIdPlaylist(Long idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getMusica() {

        return musica;
    }

    public void setMusica(String musica) {

        this.musica = musica;
    }
}
