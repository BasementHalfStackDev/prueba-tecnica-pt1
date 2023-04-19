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
@Table(name = "games")
public class Game {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="title")
	private String title;

	@Column(name="description")
	private String description;

	@Column(name="playtime")
	private int playtime;

	@OneToMany
	@JoinColumn(name = "FK_parties_game")
	private List<Party> party;

	// Constructors
	public Game() {
	}

	public Game(Long id, String title, String description, int playtime) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.playtime = playtime;
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

	public int getPlaytime() {
		return playtime;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Party")
	public List<Party> getParty() {
		return party;
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

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public void setParty(List<Party> party) {
		this.party = party;
	}

}
