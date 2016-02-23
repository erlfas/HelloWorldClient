package no.fasmer.main;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import no.fasmer.helloworldbean.HelloWorldRemote;

public class Main {

    public static void main(String[] args) {
        // Portable JNDI names for EJB HelloWorldBean: 
        // - java:global/HelloWorldBean/HelloWorldBean, 
        // - java:global/HelloWorldBean/HelloWorldBean!no.fasmer.helloworldbean.HelloWorldRemote
        
        try {
            InitialContext ic = new InitialContext();
            
            HelloWorldRemote remote = (HelloWorldRemote) ic.lookup("java:global/HelloWorldBean/HelloWorldBean");
            
            System.out.println(remote.helloWorld());
            
        } catch (NamingException e) {
            System.out.println("En feil oppstod: " + e);
        }
    }
    
}
