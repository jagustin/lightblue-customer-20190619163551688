package customer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring.cloudant")
public class CloudantPropertiesBean {
	
	private String _username;
	private String _password;
	private String _host;
	private String _protocol;
	private String _port;
	private String _database;
	
	public setUsername(username){
		this._username = username;
	}
	public getUsername(){
		return this._username
	}
	
	public setPassword(password){
		this._password = password;
	}
	public getPassword(){
		return this._password;
	}
	
	public setHost(host){
		this._host = host;
	}
	
	public getHost(){
		return this._host;
	}
	
	public setProtocal(protocol){
		this._protocol = protocol;
	}
	
	public getProtocol(){
		return this._protocol;
	}
	
	public setPort(port){
		this._port = port;
	}
	
	public getPort(){
		return this._port;
	}
	
	public setDatabase(database){
		this._database = database;
	}
	
	public getDatase(){
		return this._database;
	}
	
}