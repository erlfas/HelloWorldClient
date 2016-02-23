package no.fasmer.helloworldbean;

import javax.ejb.Remote;

/**
 *
 * @author erlend321
 */
@Remote
public interface HelloWorldRemote {
    public String helloWorld();
}