package havayolu;

public class ucuslar extends ucus{

	public ucuslar(String pilot, String hostes) {
		super(pilot, hostes);
		// TODO Auto-generated constructor stub
	}

	private int ucusNum;
	private String ucusNereye;
	
	public void ucusHangi(){
		if(super.getAdi()=="kemal" && super.getHareket()=="Paris"){
			System.out.println("Paris uçusunda");
		}else{
			System.out.println("ucusda degil");
		}
	}
	
}
