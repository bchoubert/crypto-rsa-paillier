/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.math.BigInteger;
import java.util.HashMap;

/**
 *
 * @author p1201629
 */
public class Key {
    private BigInteger n;
    private BigInteger e;
    private BigInteger d;
    
    public Key(){
    }
    
    public Key(BigInteger n, BigInteger e, BigInteger d){
        this.n = n;
        this.e = e;
        this.d = d;
    }
    
    public void setN(BigInteger n){
        this.n = n;
    }
    
    public void setE(BigInteger e){
        this.e = e;
    }
    
    public void setD(BigInteger d){
        this.d = d;
    }
    
    public HashMap<String, BigInteger> getPublicKey(){
        HashMap hm = new HashMap();
        hm.put("n", n);
        hm.put("e", e);
        return hm;
    }
    
    public HashMap<String, BigInteger> getPrivateKey(){
        HashMap hm = new HashMap();
        hm.put("d", d);
        hm.put("n", n);
        return hm;
    }
}
