package multilevelinheritanceexamp;

public class Grandchild extends Parent {

	public static void main(String[] args) {
	Grandchild  gc=new Grandchild();
	gc.doBuisness();
	gc.engineering();
	gc.doAgriculture();
	gc.allocatedLandForHospital();
	
	}
		void engineering()
		{
			System.out.println("Engineer");
			
		}
		public void allocatedLandForHospital(){
			 System.out.println("charity");

	}

}
