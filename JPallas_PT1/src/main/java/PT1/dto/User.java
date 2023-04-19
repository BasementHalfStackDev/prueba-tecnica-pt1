/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;

	@Column(name="steam_username")
	private String steam_username;

	@OneToMany
	@JoinColumn(name = "FK_parties_created_by")
	private List<Party> party;

	@OneToMany
	@JoinColumn(name = "FK_party_members_user")
	private List<Party_Member> party_member;

	@OneToMany
	@JoinColumn(name = "FK_messages_sender")
	private List<Message> message;

	// Constructors
	public User() {
	}

	public User(Long id, String username, String password, String email, String steam_username) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.steam_username = steam_username;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getSteam_username() {
		return steam_username;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party_Member")
	public List<Party_Member> getParty_member() {
		return party_member;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Message")
	public List<Message> getMessage() {
		return message;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSteam_username(String steam_username) {
		this.steam_username = steam_username;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

	public void setParty_member(List<Party_Member> party_member) {
		this.party_member = party_member;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

}
