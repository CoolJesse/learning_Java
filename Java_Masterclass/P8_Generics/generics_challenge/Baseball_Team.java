public class Baseball_Team extends Team{
/** Constructors *****************************************************************************/
	public Baseball_Team(String name){
		super(name, "Baseball");
	}
	public Baseball_Team(String name, int rank){
		super(name, "Baseball", rank);
	}
	public Baseball_Team(){
		super("", "Baseball");
	}
/*********************************************************************************************/
}