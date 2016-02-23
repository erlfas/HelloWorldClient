package no.fasmer.helloworldbean;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {
    public String helloWorld();
}