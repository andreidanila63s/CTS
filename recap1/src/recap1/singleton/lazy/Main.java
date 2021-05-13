package recap1.singleton.lazy;

public class Main {

	public static void main(String[] args) {
      
		Agentie a1 = Agentie.getInstanta("nume1", 1,2);
		Agentie a2 = Agentie.getInstanta("nume2", 0, 0);
		System.out.println(a1.getNumeAgentie());
		System.out.println(a2.getNumeAgentie());
	}

}
