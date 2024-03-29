package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String content;
	
	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return this.date + ":" + this.content;
	}
	
}
