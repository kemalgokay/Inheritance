package havayolu;

public class idari {
	
	private String müdür;
	private String sekreter;
	private String muhasebe;
	private String satis;
	private int id;
	private String adi;
	private double maas;
	private int dogTar;
	private int odaNum;
	private String idariOfis;
	private int dahili;
	
	
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


	public String getIdariOfis() {
		return idariOfis;
	}


	public void setIdariOfis(String idariOfis) {
		this.idariOfis = idariOfis;
	}


	public String getMüdür() {
		return müdür;
	}


	public void setMüdür(String müdür) {
		this.müdür = müdür;
	}


	public String getSekreter() {
		return sekreter;
	}


	public void setSekreter(String sekreter) {
		this.sekreter = sekreter;
	}


	public String getMuhasebe() {
		return muhasebe;
	}


	public void setMuhasebe(String muhasebe) {
		this.muhasebe = muhasebe;
	}


	public String getSatis() {
		return satis;
	}


	public void setSatis(String satis) {
		this.satis = satis;
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



	
	public static void main(String args[]){
		
		idari i=new idari();
		ucuslar u=new ucuslar("kemal", "paris");
		ucus uc=new ucus("malatya", "adana");
		
		/*
		 * 
		 * Metodların burada çalıştırılması gerekmektedir.
		 */
		
	}

}
