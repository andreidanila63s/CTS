package ro.ase.csie.cts.g1093.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		GenericMessageHandler filterModule = new FilterModule("english");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.setNext(privateModule);
		privateModule.setNext(groupModule);
		
		GenericMessageHandler chatServer = filterModule;
		
		chatServer.processMessage(new Message("hello john", "@john",1));
		chatServer.processMessage(new Message(" i hate you", "@john", 2));
		chatServer.processMessage(new Message("let s join the party", "@everyone", 1));
		
	}

}
