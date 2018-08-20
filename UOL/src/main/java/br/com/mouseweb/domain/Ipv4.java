package br.com.mouseweb.domain;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ipv4 {
	
	@JsonSerialize(using = DateSerializer.class)
	@Column(name = "status")
	private String status;
	
	@JsonSerialize(using = DateSerializer.class)
	@Column(name = "data")
	private LocalizacaoIpv4 data;
	
	public Ipv4() {
		
	}
	
	public Ipv4(String status, LocalizacaoIpv4 data) {
		super();
		this.status = status;
		this.data = data;
	}

	public LocalizacaoIpv4 getData() {
		return data;
	}
	public void setData(LocalizacaoIpv4 data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ipv4 [status=" + status + ", data=" + data + "]";
	}
	

}
