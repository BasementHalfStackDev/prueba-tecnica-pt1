DROP TABLE IF EXISTS messages;
DROP TABLE IF EXISTS party_members;
DROP TABLE IF EXISTS parties;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS games;

CREATE TABLE games(
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(100) DEFAULT NULL,
	description VARCHAR(255) DEFAULT NULL,
	playtime INT DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE users(
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL,
	email VARCHAR(255) NOT NULL,
	steam_username VARCHAR(50) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE parties(
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	description VARCHAR(255) DEFAULT NULL,
	game INT NOT NULL,
	created_by INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT FK_parties_game FOREIGN KEY (game) REFERENCES games(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_parties_created_by FOREIGN KEY (created_by) REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE party_members(
	id INT NOT NULL AUTO_INCREMENT,
	user INT NOT NULL,
	party INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT FK_party_members_user FOREIGN KEY (user) REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_party_members_party FOREIGN KEY (party) REFERENCES parties(id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE messages(
	ID INT NOT NULL AUTO_INCREMENT,
	content VARCHAR(300) NOT NULL,
	time_sent DATETIME DEFAULT CURRENT_TIMESTAMP,
	sender INT NOT NULL,
	party INT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT FK_messages_sender FOREIGN KEY (sender) REFERENCES users(id),
	CONSTRAINT FK_messages_party FOREIGN KEY (party) REFERENCES parties(id)
);

INSERT INTO games(title, description, playtime) VALUES ('Deep Rock Galactic', 'A game where you work and mine with your fellow dwarves', 100);
INSERT INTO games(title, description, playtime) VALUES ('Darkest Dungeon', 'Will you survive the worst odds? We will see...', 50);
INSERT INTO games(title, description, playtime) VALUES ('Binding of Isaac', 'Roguelike randomly generated action RPG', 300);
INSERT INTO games(title, description, playtime) VALUES ('The Witcher 3', 'Follow Geralt of rivia, a witcher from the school of...', 100);
INSERT INTO games(title, description, playtime) VALUES ('The Sims 4', 'A Virtual simulation of life itself', 50);
INSERT INTO games(title, description, playtime) VALUES ('War Thunder', 'Play with your favourite military vehicles from tanks to battleships...', 3000);
INSERT INTO games(title, description, playtime) VALUES ('Planetside 2', 'Massive FPS with epic battles to an unprecedented scale', 1000);
INSERT INTO games(title, description, playtime) VALUES ('Phasmophobia', 'Horror Survival game where youre tasked to identify ghosts in haunted locations', 5);
INSERT INTO games(title, description, playtime) VALUES ('Yakuza Kiwami', 'Action RPG. Become Kiryu Kazuma, an up-and-coming yakuza who...', 30);
INSERT INTO games(title, description, playtime) VALUES ('Dead By Daylight', 'Horror Survival game where your objective is to escape the killers grasp...', 100);

INSERT INTO users(username, password, email, steam_username) VALUES ('codejunkie23', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(username, password, email, steam_username) VALUES ('holaprofe', 'apruebamepls', 'meheesforzado@gmail.com', 'plsjose');
INSERT INTO users(username, password, email, steam_username) VALUES ('easteregg', '34sTer3g6', 'easteregg@hotmail.com', 'Easter Rules');
INSERT INTO users(username, password, email, steam_username) VALUES ('yanose', 'mehequedado', 'sincreatividad@gmail.com', 'shrugsshoulders');
INSERT INTO users(username, password, email, steam_username) VALUES ('TheLonelySoul12', 'WontRevealMyPassword', 'NeitherMyEmail@gmail.com', 'Literal_Trash ඞ');
INSERT INTO users(username, password, email, steam_username) VALUES ('User1', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(username, password, email, steam_username) VALUES ('User2', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(username, password, email, steam_username) VALUES ('User3', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(username, password, email, steam_username) VALUES ('User4', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');
INSERT INTO users(username, password, email, steam_username) VALUES ('EsteProyecto', 'SeraDivertido', 'DeVerdad@yahoo.com', 'LFGAPP');
INSERT INTO users(username, password, email, steam_username) VALUES ('User5', 'i<3coding123', 'codingjunkie@gmail.com', 'codejunkie');

INSERT INTO parties(title, description, game, created_by) VALUES ('We Goin Deep', 'Rock and Stone to the Bone', 1, 5);
INSERT INTO parties(title, description, game, created_by) VALUES ('Sims and chill', 'Lets talk about our virtual lives!', 5, 4);
INSERT INTO parties(title, description, game, created_by) VALUES ('Oh god make it stop', 'Please I keep getting bad items oh god help', 3, 9);

INSERT INTO party_members(user, party) VALUES (1, 1);
INSERT INTO party_members(user, party) VALUES (1, 2);
INSERT INTO party_members(user, party) VALUES (1, 3);
INSERT INTO party_members(user, party) VALUES (2, 2);
INSERT INTO party_members(user, party) VALUES (3, 2);
INSERT INTO party_members(user, party) VALUES (4, 2);
INSERT INTO party_members(user, party) VALUES (5, 2);
INSERT INTO party_members(user, party) VALUES (5, 3);
INSERT INTO party_members(user, party) VALUES (5, 1);
INSERT INTO party_members(user, party) VALUES (6, 3);
INSERT INTO party_members(user, party) VALUES (6, 2);
INSERT INTO party_members(user, party) VALUES (7, 3);
INSERT INTO party_members(user, party) VALUES (8, 3);
INSERT INTO party_members(user, party) VALUES (9, 3);
INSERT INTO party_members(user, party) VALUES (10, 3);
INSERT INTO party_members(user, party) VALUES (10, 2);

INSERT INTO messages(content, sender, party) VALUES ('Holas!', 5, 1);
INSERT INTO messages(content, sender, party) VALUES ('Como va esto?', 5, 1);
INSERT INTO messages(content, sender, party) VALUES ('Todo bien?', 5, 1);