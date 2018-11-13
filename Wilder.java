public class Wilder{
	private String firstName;
	private boolean aware;

	public Wilder(String firstName, boolean aware){
		this.firstName = firstName;
		this.aware = aware;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setFirstName(String firstName){
		this.firstName =firstName;
	}

	public boolean isAware(){
		return this.aware;
	}

	public void setAware(boolean aware){
		this.aware = aware;
	}

	public String whoAmI(){
		//if aware {
		//return "Je m'appelle " + this.getName() + " et je suis aware"
		//}
		//else{
		//return "Je m'appelle " + this.getName() + " et je ne suis pas aware"
		//}
		return String.format("Je m'appelle %s et je %s aware", 
			this.getFirstName(), 	
			isAware() ? "suis" : "ne suis pas"
		);

	}

}
