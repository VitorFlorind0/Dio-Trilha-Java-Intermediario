package ComputadorVitor;

import apps.FaceBookMessenger;
import apps.MSNMessenger;
import apps.Telegram;
import apps.servicoMensagemInstantanea;
public class computadorVitor {

	public static void main(String[] args) {
		servicoMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		
		else if (appEscolhido.equals("fbm"))
			smi = new FaceBookMessenger();
		else if (appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}


}
