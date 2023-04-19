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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "parties")
public class Party {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "game")
	private Game game;

	@ManyToOne
	@JoinColumn(name = "created_by")
	private User created_by;

	@OneToMany
	@JoinColumn(name = "FK_party_members_party")
	private List<Party_Member> party_member;

	@OneToMany
	@JoinColumn(name = "FK_messages_party")
	private List<Message> message;

	// Constructors
	public Party() {
	}

	public Party(Long id, String title, String description, Game game, User created_by) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.game = game;
		this.created_by = created_by;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Game getGame() {
		return game;
	}

	public User getCreated_by() {
		return created_by;
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public void setParty_member(List<Party_Member> party_member) {
		this.party_member = party_member;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

}
