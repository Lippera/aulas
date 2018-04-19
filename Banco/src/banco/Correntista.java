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
public class Correntista {
    public String nome;
    public int tipo;
    public Conta conta1;
    public Conta conta2;
    
    
    public float saldoTotal(){
        return conta1.saldo + conta2.saldo;
    }
}
