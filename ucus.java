package havayolu;

public class ucus {
	
	private String pilot;
	private String hostes;
	private String hareket;
	
	private int odaNum;
	private int id;
	private String adi;
	private double maas;
	private int dogTar;
	private String hareketOfis;
	private int dahili;
	
	public ucus(String pilot,String hostes){
		pilot=this.pilot;
		hostes=this.hostes;
	}

	public int getDahili() {
		return dahili;
	}


	public void setDahili(int dahili) {
		this.dahili = dahili;
	}


	public int getOdaNum() {
		return odaNum;
	}


	public void setOdaNum(int odaNum) {
		this.odaNum = odaNum;
	}
	public String getHareketOfis(){
		return hareketOfis;
	}
	
	public void setHareketOfis(String hareketOfis){
		this.hareketOfis=hareketOfis;
	}
	
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	public String getHostes() {
		return hostes;
	}
	public void setHostes(String hostes) {
		this.hostes = hostes;
	}
	public String getHareket() {
		return hareket;
	}
	public void setHareket(String hareket) {
		this.hareket = hareket;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	public int getDogTar() {
		return dogTar;
	}
	public void setDogTar(int dogTar) {
		this.dogTar = dogTar;
	}
	
	

}
