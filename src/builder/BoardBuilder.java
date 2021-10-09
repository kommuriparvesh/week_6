package builder;

public class BoardBuilder extends Builder {
	public BoardBuilder() {
		this.name = "Board";
	}
	public Builder collectRawMaterials() {
		this.processes.add("Raw Materials for "+name);
		return this;
	}
	public Builder unpackRawMaterials() {
		this.processes.add("Unpacking Raw Materials");
		return this;
	}
	public Builder make() {
		this.processes.add("Making "+name);
		return this;
	}
	public Builder check() {
		this.processes.add("Checking "+name);
		return this;
	}
	public Builder pack() {
				this.processes.add("Packing "+name);
		
		return this;
	}
	
}