package net.neoremind.sshxcute.core;

/**
 * This is a Javabean class that used to construct a connection. It stores host, usernamd and password for a connection.
 * <br>
 * The three parameters has getter and setter method.
 * 
 * @author zxucdl
 *
 */
public class ConnBean {
    private String host;
    private String user;
	private String password;
    private String passphrase;
    private String knowHosts;
    private String privateKey;
    
    public ConnBean(
            String host, String user, String password) {
        this.host = host;
        this.password = password;
        this.user = user;
    }

    public ConnBean(
            String host, String user, String password, String passphrase,
            String knowHosts, String privateKey) {
		this.host = host;
		this.password = password;
		this.user = user;
        this.passphrase = passphrase;
        this.knowHosts = knowHosts;
        this.privateKey = privateKey;
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getKnowHosts() {
        return knowHosts;
    }

    public void setKnowHosts(String knowHosts) {
        this.knowHosts = knowHosts;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}

