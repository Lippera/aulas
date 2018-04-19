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
public class Transacao {
    public float valor;
    public int tipo;
    
    public boolean validar(Correntista c){
        if(c.tipo == 1 && valor > 10000){ // PF
           return false;
        }
        return true;
        
        //mesma coisa
        //return !(c.tipo == 1 && valor > 10000);
        //return (c.tipo != 1 || valor <= 10000);
        
    }
}
