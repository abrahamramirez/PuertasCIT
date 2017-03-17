package com.citnova.sca.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class PersonaClienteWrapper {

	private int idPer;
	private String nombrePer;
	private String apPatPer;
	private String apMatPer;
	private String emailPer;
	private String curpPer;
	private Timestamp fhCreaPer;
	
	private int idCli;
	private String emailAltCli;
	private String passCli;
	private String sexoCli;
	private String telFijoCli;
	private String telMovilCli;
	private Date fNacCli;
	private Timestamp fhCreaCli;
	private String ocupacionCli;
	private String objetivoCli;
	private String avatarCli;
	private String statusCli;
	private String passAreaCli;
	
	public int getIdPer() {
		return idPer;
	}
	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}
	public String getNombrePer() {
		return nombrePer;
	}
	public void setNombrePer(String nombrePer) {
		this.nombrePer = nombrePer;
	}
	public String getApPatPer() {
		return apPatPer;
	}
	public void setApPatPer(String apPatPer) {
		this.apPatPer = apPatPer;
	}
	public String getApMatPer() {
		return apMatPer;
	}
	public void setApMatPer(String apMatPer) {
		this.apMatPer = apMatPer;
	}
	public String getEmailPer() {
		return emailPer;
	}
	public void setEmailPer(String emailPer) {
		this.emailPer = emailPer;
	}
	public String getCurpPer() {
		return curpPer;
	}
	public void setCurpPer(String curpPer) {
		this.curpPer = curpPer;
	}
	public Timestamp getFhCreaPer() {
		return fhCreaPer;
	}
	public void setFhCreaPer(Timestamp fhCreaPer) {
		this.fhCreaPer = fhCreaPer;
	}
	public int getIdCli() {
		return idCli;
	}
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	public String getEmailAltCli() {
		return emailAltCli;
	}
	public void setEmailAltCli(String emailAltCli) {
		this.emailAltCli = emailAltCli;
	}
	public String getPassCli() {
		return passCli;
	}
	public void setPassCli(String passCli) {
		this.passCli = passCli;
	}
	public String getSexoCli() {
		return sexoCli;
	}
	public void setSexoCli(String sexoCli) {
		this.sexoCli = sexoCli;
	}
	public String getTelFijoCli() {
		return telFijoCli;
	}
	public void setTelFijoCli(String telFijoCli) {
		this.telFijoCli = telFijoCli;
	}
	public String getTelMovilCli() {
		return telMovilCli;
	}
	public void setTelMovilCli(String telMovilCli) {
		this.telMovilCli = telMovilCli;
	}
	public Date getfNacCli() {
		return fNacCli;
	}
	public void setfNacCli(Date fNacCli) {
		this.fNacCli = fNacCli;
	}
	public Timestamp getFhCreaCli() {
		return fhCreaCli;
	}
	public void setFhCreaCli(Timestamp fhCreaCli) {
		this.fhCreaCli = fhCreaCli;
	}
	public String getOcupacionCli() {
		return ocupacionCli;
	}
	public void setOcupacionCli(String ocupacionCli) {
		this.ocupacionCli = ocupacionCli;
	}
	public String getObjetivoCli() {
		return objetivoCli;
	}
	public void setObjetivoCli(String objetivoCli) {
		this.objetivoCli = objetivoCli;
	}
	public String getAvatarCli() {
		return avatarCli;
	}
	public void setAvatarCli(String avatarCli) {
		this.avatarCli = avatarCli;
	}
	public String getStatusCli() {
		return statusCli;
	}
	public void setStatusCli(String statusCli) {
		this.statusCli = statusCli;
	}
	public String getPassAreaCli() {
		return passAreaCli;
	}
	public void setPassAreaCli(String passAreaCli) {
		this.passAreaCli = passAreaCli;
	}
	
	@Override
	public String toString() {
		return "PersonaClienteWrapper [idPer=" + idPer + ", nombrePer=" + nombrePer + ", apPatPer=" + apPatPer
				+ ", apMatPer=" + apMatPer + ", emailPer=" + emailPer + ", curpPer=" + curpPer + ", fhCreaPer="
				+ fhCreaPer + ", idCli=" + idCli + ", emailAltCli=" + emailAltCli + ", passCli=" + passCli
				+ ", sexoCli=" + sexoCli + ", telFijoCli=" + telFijoCli + ", telMovilCli=" + telMovilCli + ", fNacCli="
				+ fNacCli + ", fhCreaCli=" + fhCreaCli + ", ocupacionCli=" + ocupacionCli + ", objetivoCli="
				+ objetivoCli + ", avatarCli=" + avatarCli + ", statusCli=" + statusCli + ", passAreaCli=" + passAreaCli
				+ "]";
	}
}
