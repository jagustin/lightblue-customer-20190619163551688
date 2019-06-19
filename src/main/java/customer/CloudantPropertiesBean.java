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
	
	public void setUsername(username){
		this._username = username;
	}
	public String getUsername(){
		return this._username
	}
	
	public void setPassword(password){
		this._password = password;
	}
	public  String getPassword(){
		return this._password;
	}
	
	public void setHost(host){
		this._host = host;
	}
	
	public String getHost(){
		return this._host;
	}
	
	public void setProtocal(protocol){
		this._protocol = protocol;
	}
	
	public String getProtocol(){
		return this._protocol;
	}
	
	public void setPort(port){
		this._port = port;
	}
	
	public String getPort(){
		return this._port;
	}
	
	public void setDatabase(database){
		this._database = database;
	}
	
	public String getDatase(){
		return this._database;
	}
	
}