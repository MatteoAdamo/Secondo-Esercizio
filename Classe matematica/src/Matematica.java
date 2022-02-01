public class Matematica {
	
	int[] vetInt= new int[100];
	float[] vetFlo= new float[100];
	public Matematica() {
		super();
		
	}

	public float CalcolaMedia1(int[]v,int n) {
		   float somma=0;
		   float media=0;
		   int i=0;
		   for(i=0;i<n;i++) {
			   somma+=v[i];
		   }
		  media=somma/n;
		  return media;
		}
		
	public float CalcolaMedia2(float[]v,int n) {
		float somma=0;
		float media=0;
		int i=0;
		for(i=0;i<n;i++) {
			somma+=v[i];
		}
		media=somma/n;
		return media;
	}
}