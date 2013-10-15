package edu.emory.cci.bindaas.trusted_app_client.core;

import java.util.List;


public interface ITrustedAppClient {

public APIKey getShortLivedAPIKey( String username , Integer lifetime ) throws Exception;

public APIKey authorizeNewUser( String username ,  Long epochTimeExpires  , String comments) throws Exception;
	
public String revokeAccess( String username ,   String comments) throws Exception;

public List<APIKey> listAPIKeys()  throws Exception ;
}
