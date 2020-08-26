package com.team2.movie.dao.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class Ticket {

	private String kakaoId;
	private int seatid;

	private String name; // member name from member table
	private int groupNum; // from ticket table
	private int ticketId; // pk from ticket table
	private String title; // from movie table
	private Date date; // from venue table
	private String start; // from venue table
	private String end; // from venue table
	private String venueNo; // from venue table
	private String seatNo; // from seat table

	private double ticketDiscount;
	private int ticketPrice;

	public Ticket() {

	}

	public Ticket(String name, int groupNum, int ticketId, String title, Date date, String start, String end,
			String venueNo, String seatNo) {
		this.name = name;
		this.groupNum = groupNum;
		this.ticketId = ticketId;
		this.title = title;
		this.date = date;
		this.start = start;
		this.end = end;
	}

}
