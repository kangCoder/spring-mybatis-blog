DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS user_session;

CREATE TABLE post
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    user_id INTEGER NOT NULL,
    title VARCHAR(100) NOT NULL,
    content VARCHAR(255) NOT NULL,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE comment
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    post_id INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    content VARCHAR(255) NOT NULL,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

CREATE TABLE users
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL,
    name VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    UNIQUE(email)
);

CREATE TABLE user_session
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    user_id INTEGER NOT NULL,
    name VARCHAR(30) NOT NULL,
    createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);

INSERT INTO users(email, name, password)
VALUES ('dhlee@codepresso.kr', 'dhlee', 'asdf1234');
INSERT INTO users(email, name, password)
VALUES ('jhkim@codepresso.kr', 'jhkim', 'asdf1234');

INSERT INTO user_session(user_id, name)
VALUES (1, 'dhlee');

INSERT INTO post(user_id, title, content)
VALUES (1, 'Spring Web', 'Build web, including RESTful, applications using Spring MVC.');
INSERT INTO post(user_id, title, content)
VALUES (2, 'Lombok', 'Java annotation library which helps to reduce boilerplate code.');
INSERT INTO post(user_id, title, content)
VALUES (1, 'MyBatis Framework', 'Persistence framework with support for custom SQL, stored procedures and advanced mappings.');
INSERT INTO post(user_id, title, content)
VALUES (1, 'H2 Database', 'Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint.');
INSERT INTO post(user_id, title, content)
VALUES (2, 'Mustache', 'Logic-less Templates. There are no if statements, else clauses, or for loops. Instead there are only tags.');
INSERT INTO post(user_id, title, content)
VALUES (1, 'Spring Boot DevTools', 'Provides fast application restarts, LiveReload, and configurations for enhanced development experience.');
INSERT INTO post(user_id, title, content)
VALUES (1, 'Validation', 'Bean Validation with Hibernate validator.');
INSERT INTO post(user_id, title, content)
VALUES (2, 'Spring Native', 'Incubating support for compiling Spring applications to native executables using the GraalVM native-image compiler.');
INSERT INTO post(user_id, title, content)
VALUES (1, 'Spring Session', 'Provides an API and implementations for managing user session information.');

INSERT INTO comment(post_id, user_id, content)
VALUES (9, 1, 'comment content 1');
INSERT INTO comment(post_id, user_id, content)
VALUES (9, 2, 'comment content 2');
INSERT INTO comment(post_id, user_id, content)
VALUES (9, 1, 'comment content 3');
INSERT INTO comment(post_id, user_id, content)
VALUES (9, 1, 'comment content 4');
INSERT INTO comment(post_id, user_id, content)
VALUES (9, 2, 'comment content 5');

