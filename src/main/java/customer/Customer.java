package customer;

public class Customer{
	
	private String _id;
	private String _rev;
	private String _username;
	private String _password;
	private String _firstName;
	private String _lastName;
	private String _email;
	private String _imageUrl;
	
	public void setCustomerId(id){
		this._id = id;
	}
	
	public String getCustomerId(){
		return this._id;
		
	}
	
	public void setRev(rev){
		this._rev = rev;
	}
	
	public String getRev(){
		return this._rev;
	}
	
	public void setUsername(username){
		this._username = username;
	}
	
	public String getUsername(){
		return this._username;
	}
	
	public void setPassword(password){
		this._password = password;
	}
	
	public String getPassword(){
		return this._password;
	}
	public void setFirstName(firstName){
		this._firstName = firsName;
	}
    
    public String getFirstname(){
        return this._firstName;
    }

    public void setLastName(lastName){
        this._lastName = lastName;
    }

    public String getLastName(){
        return this._lastName;
    }

    public void setEmail(email){
        this._email = email;
    }

    public String getEmail(){
        return this._email;
    }

    public void setImageUrl(imageUrl){
        this._imageUrl = imageUrl;
    }

    public String getImageUrl(){
        return this._imageUrl;
    }

}