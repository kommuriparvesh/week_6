package builder;


import java.util.ArrayList;
import java.util.List;

public abstract class Builder {
	String name;
	List<String> processes = new ArrayList<String>();
	
	public abstract Builder collectRawMaterials();
	public abstract Builder unpackRawMaterials();
	public abstract Builder make();
	public abstract Builder check();
	public abstract Builder pack();

	public ChalkFactory build() {
		ChalkFactory chalkfactory = new ChalkFactory();
		chalkfactory.setName(this.name);
		chalkfactory.addProcess(processes);
		return chalkfactory;
	}
}