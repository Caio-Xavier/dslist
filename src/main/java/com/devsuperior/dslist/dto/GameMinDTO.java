package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

// classe criada para mostrar games com menos dados
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	
// construtor	
	public GameMinDTO() {
	}
	
// construtor que já recebe os argumentos
	
	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
