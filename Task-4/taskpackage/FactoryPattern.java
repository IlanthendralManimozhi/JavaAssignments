package taskpackage;
/**
 * manufacturing objects
 * @author ilanthendralmanimozhi
 *
 */


public class FactoryPattern {
	public static void main(String[] args) {
		Computer computer=new Computer.BuildComputer().setHardDisk(new HardDisk()).build();
		System.out.println(computer);
	}

}
class Computer{
	MotherBoard mb;Ram ram;HardDisk hd;VGACard vg;
	public Computer(MotherBoard mb,Ram ram,HardDisk hd,VGACard vg) {
		this.mb=mb;
		this.ram=ram;
		this.hd=hd;
		this.vg=vg;
	}
	/**
	 * 
	 * Building the objects
	 *
	 */
	
	static class BuildComputer{
		MotherBoard mb;Ram ram;HardDisk hd;VGACard vg;
		public BuildComputer setMotherBoard(MotherBoard mb) {
			this.mb=mb;
			return this;
		}
		public BuildComputer setRam(Ram ram) {
			this.ram=ram;
			return this;
		}
		public BuildComputer setHardDisk(HardDisk hd) {
			this.hd=hd;
			return this;
		}
		public BuildComputer setVGACard(VGACard vga) {
			this.vg=vga;
			return this;
		}
		public Computer build() {
			return new Computer(mb,ram,hd,vg);
		}
	}
	
	@Override
	public String toString() {
		return "Computer [mb=" + mb + ", ram=" + ram + ", hd=" + hd + ", vg=" + vg + "]";
	}
	
}
class MotherBoard {
	
}
class Ram{
	
}
class HardDisk{
	
}
class VGACard{
	
}