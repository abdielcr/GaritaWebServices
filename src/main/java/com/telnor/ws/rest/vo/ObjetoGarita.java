package com.telnor.ws.rest.vo;

public class ObjetoGarita {
	private Integer numGarita;
	private String  nameGarita;
	private Integer carrilNormal;
	private Integer readyLine;
	private Integer sentryLine;
	private Integer peatonal;
	private Integer diaNum;
	private String  diaSemana;
	private Integer horaActualiza;
	private Integer minActualiza;
	private String  fechaActualiza;
	private String  usrActualiza;
	private boolean  validaGarita;
	private String 	dispositivoAndroid;
	private Integer puertas;
	
	public Integer getNumGarita() {
		return numGarita;
	}
	public void setNumGarita(Integer numGarita) {
		this.numGarita = numGarita;
	}
	public String getNameGarita() {
		return nameGarita;
	}
	public void setNameGarita(String nameGarita) {
		this.nameGarita = nameGarita;
	}
	public Integer getCarrilNormal() {
		return carrilNormal;
	}
	public void setCarrilNormal(Integer carrilNormal) {
		this.carrilNormal = carrilNormal;
	}
	public Integer getReadyLine() {
		return readyLine;
	}
	public void setReadyLine(Integer readyLine) {
		this.readyLine = readyLine;
	}
	public Integer getSentryLine() {
		return sentryLine;
	}
	public void setSentryLine(Integer sentryLine) {
		this.sentryLine = sentryLine;
	}
	public Integer getPeatonal() {
		return peatonal;
	}
	public void setPeatonal(Integer peatonal) {
		this.peatonal = peatonal;
	}
	public Integer getDiaNum() {
		return diaNum;
	}
	public void setDiaNum(Integer diaNum) {
		this.diaNum = diaNum;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Integer getHoraActualiza() {
		return horaActualiza;
	}
	public void setHoraActualiza(Integer horaActualiza) {
		this.horaActualiza = horaActualiza;
	}
	public Integer getMinActualiza() {
		return minActualiza;
	}
	public void setMinActualiza(Integer minActualiza) {
		this.minActualiza = minActualiza;
	}
	public String getFechaActualiza() {
		return fechaActualiza;
	}
	public void setFechaActualiza(String fechaActualiza) {
		this.fechaActualiza = fechaActualiza;
	}
	public String getUsrActualiza() {
		return usrActualiza;
	}
	public void setUsrActualiza(String usrActualiza) {
		this.usrActualiza = usrActualiza;
	}
	public boolean getValidaGarita() {
		return validaGarita;
	}
	public void setValidaGarita(boolean validaGarita) {
		this.validaGarita = validaGarita;
	}
	public String getDispositivoAndroid() {
		return dispositivoAndroid;
	}
	public void setDispositivoAndroid(String dispositivoAndroid) {
		this.dispositivoAndroid = dispositivoAndroid;
	}
	public Integer getPuertas() {
		return puertas;
	}
	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	@Override
	public String toString() {
		return "ObjetoGarita [numGarita=" + numGarita + ", nameGarita=" + nameGarita + ", carrilNormal=" + carrilNormal
				+ ", readyLine=" + readyLine + ", sentryLine=" + sentryLine + ", peatonal=" + peatonal + ", diaNum="
				+ diaNum + ", diaSemana=" + diaSemana + ", horaActualiza=" + horaActualiza + ", minActualiza="
				+ minActualiza + ", fechaActualiza=" + fechaActualiza + ", usrActualiza=" + usrActualiza
				+ ", validaGarita=" + validaGarita + ", dispositivoAndroid=" + dispositivoAndroid + ", puertas="
				+ puertas + "]";
	}
	
	
}
