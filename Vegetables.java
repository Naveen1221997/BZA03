package excelsReadsParent;

public class Vegetables
{
	int id;
	String name;
	double importRate;
	double exportRate;
	public Vegetables(int id, String name, double importRate, double exportRate) {
		
		this.id = id;
		this.name = name;
		this.importRate = importRate;
		this.exportRate = exportRate;
	}
	@Override
	public String toString() {
		return "Vegetables [id=" + id + ", name=" + name + ", importRate=" + importRate + ", exportRate=" + exportRate
				+ "]";
	}
	
	public void updateImportRate(double amt)
	{
		this.importRate-=amt;
	}
	
	public void updateExportRate(double percentage)
	{
		this.exportRate=this.exportRate+(this.exportRate*percentage);
	}
	

}
