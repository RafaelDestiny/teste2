package bytebank;

public class TestaMetodo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDoRafael = new Conta();
        contaDoRafael.saldo = 100;
        contaDoRafael.deposita(50);
        System.out.println(contaDoRafael.saldo);
       
        boolean conseguiuRetirar = contaDoRafael.saca(20);
        System.out.println(contaDoRafael.saldo);
	    System.out.println(conseguiuRetirar);
	    
	    Conta contaDaMarcela = new Conta();
	    contaDaMarcela.deposita(1000);
	
	    //contaDaMarcela.transfere(300, contaDoRafael);
	    
	    if(contaDaMarcela.transfere(3000, contaDoRafael)) {
	    	System.out.println("transferencia com sucesso");
	    }else {
	    	System.out.println("faltou dinheiro");
	    }
	    
	    System.out.println(contaDaMarcela.saldo);
	    
	    contaDoRafael.titular = "Rafael Teotonio";
	    System.out.println(contaDoRafael.titular);
	
	
	
	
	
	
	}
	
}