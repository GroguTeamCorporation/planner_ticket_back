
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Camela', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert1.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('La Oreja de Van Gogh', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Gijon', '/images/concert2.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Pimpinela', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert3.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Nebulossa', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert4.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Mago de Oz', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert5.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Calamaro', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert6.jpg');
INSERT INTO events (title, date_event, time_event, capacity, description, location, image) VALUES ('Joaquin Savina', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert6.jpg');

INSERT INTO events (title, date_event, time_event, capacity, description, image) VALUES
  ('Evento 1', '2024-02-10', '18:00:00', 100, 'Descripción del evento 1', '/images/evento1.jpg');


INSERT INTO events (title, date_event, time_event, capacity, description, image)
VALUES ('Nebulossa', '2024-05-30', '20:00:00', 2000, 'lololooooooooooo piiiii tamagochi a dormir', '/images/evento1.jpg');


INSERT INTO users (id_user, password, username) VALUES (default, "$2a$12$uTgei7i9TrlSNPZS1DSlqu3BdWYXjZZsqVuP50iUKzPJSgByWAxRS
", "admin");
INSERT INTO users (id_user, password, username) VALUES (default, "paco", "paco");
INSERT INTO roles (id_role, name) VALUES (default, "ADMIN");
INSERT INTO roles (id_role, name) VALUES (default, "USER");
INSERT INTO roles_users (role_id, user_id) VALUES (1,1);
INSERT INTO roles_users (role_id, user_id) VALUES (2,2);