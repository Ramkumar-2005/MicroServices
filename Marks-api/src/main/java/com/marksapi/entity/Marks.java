package com.marksapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Marks {
	
	 @Id
	    private Integer id;
	    private Integer Sid;
	    private Double  Java;
	    private Double  Sql;
	    private Double Web;

}
