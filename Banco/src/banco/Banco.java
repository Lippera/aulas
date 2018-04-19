/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Rafael.Soares
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaCorrentista fabrica = new FabricaCorrentista();
        
        Correntista corre1 = fabrica.novo("Maria", 1, 1000, 2000);
        Correntista corre2 = fabrica.novo("Pereira", 1, 500, 1300);
        
        System.out.println("Saldo 1 da Maria: "+ corre1.conta1.saldo);
        System.out.println("Saldo 2 da Maria: "+ corre1.conta2.saldo);
        System.out.println("Saldo total da Maria: "+ corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo 1 da Pereira: "+ corre2.conta1.saldo);
        System.out.println("Saldo 2 da Pereira: "+ corre2.conta2.saldo);
        System.out.println("Saldo total da Pereira: "+ corre2.saldoTotal());
        
        System.out.println("");
        System.out.println("");
        
        Transacao tx1 = new Transacao();
        tx1.tipo = 1; //debito
        tx1.valor = 2000;        
        corre1.conta2.aplicarTransacao(tx1);
        System.out.println("Saldo 2 da Maria: " + corre1.conta2.saldo);
        
        Transacao tx2 = new Transacao();
        tx2.tipo = 0; //credito
        tx2.valor = 3000;        
        corre1.conta1.aplicarTransacao(tx2);               
        System.out.println("Saldo 1 da Maria: " + corre1.conta1.saldo);
        
        System.out.println("");
        System.out.println("");        
          
        Transacao tx3 = new Transacao();
        tx3.tipo = 1; //debito
        tx3.valor = 500;        
        corre2.conta1.aplicarTransacao(tx3);               
        System.out.println("Saldo 1 do Pereira: " + corre2.conta1.saldo);
        
         Transacao tx4 = new Transacao();
        tx4.tipo = 0; //credito
        tx4.valor = 2000;        
        corre2.conta2.aplicarTransacao(tx4);               
        System.out.println("Saldo 1 do pereira: " + corre2.conta2.saldo);
      
    
         
        
       
        
       
        
    }
    
}
