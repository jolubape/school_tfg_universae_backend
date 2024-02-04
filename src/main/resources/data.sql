INSERT INTO roles (id, name) values (1, 'PROFESOR');
INSERT INTO roles (id, name) values (2, 'ALUMNO');

INSERT INTO users (id, name, password, email, phone, dni, role_id) values (1, 'pepe', 'pepepass', 'pepe@email.com', '123456789A', '123456789', 1);
INSERT INTO users (id, name, password, email, phone, dni, role_id) values (2, 'antonio', 'antoniopass', 'antonio@email.com', '123456789B', '123456789', 2);
INSERT INTO users (id, name, password, email, phone, dni, role_id) values (3, 'jose', 'josepass', 'jose@email.com', '123456789C', '123456789', 2);

INSERT INTO exam (id, name) values (1, 'Biologia Tema 2');
INSERT INTO exam (id, name) values (2, 'Biologia Tema 3');
INSERT INTO exam (id, name) values (3, 'Biologia Tema 4');

INSERT INTO user_exam (id, user_id, exam_id, grade) values (1, 2, 1, null);
INSERT INTO user_exam (id, user_id, exam_id, grade) values (2, 2, 2, null);
INSERT INTO user_exam (id, user_id, exam_id, grade) values (3, 3, 2, null);
INSERT INTO user_exam (id, user_id, exam_id, grade) values (4, 3, 3, null);