INSERT INTO users (username, password, role) VALUES ('jdoe', '$2a$10$hVU0SolXjCF8aouJIHU7eeXvMEPjoVuvnDQZ4HJUrHIKF18dBbbIa', 'ROLE_MANAGER');
INSERT INTO users (username, password, role) VALUES ('tom', '$2a$10$BgzEVyT/a6B6cWuwoFpOCuwAyavGT8vkhXSK0yNwtZ4W6.rMCVxey', 'ROLE_STAFF');
INSERT INTO users (username, password, role) VALUES ('mary', '$2a$10$PAAIaqHlKlGDq02ynW2.X.NXgFQ/D/fT6dvg7u4TUrO/sBBTcNK5W', 'ROLE_STAFF');
INSERT INTO users (username, password, role) VALUES ('mike', '$2a$10$rrPQz/Ts67ut7RbSyH9qqeHCleH0.xOFUOJ3x52YWfj95qi3D8Oxy', 'ROLE_STAFF');

INSERT INTO beverages (name) VALUES ('Espresso');
INSERT INTO beverages (name) VALUES ('Latte');
INSERT INTO beverages (name) VALUES ('Cappuccino');
INSERT INTO beverages (name) VALUES ('Americano');

INSERT INTO orders (completed, beverage_id, date_set, guest) VALUES (false, 4, NOW(), 'Tom');
INSERT INTO orders (completed, beverage_id, date_set, guest) VALUES (false, 2, NOW(), 'Mary');
INSERT INTO orders (completed, beverage_id, date_set, guest) VALUES (false, 1, NOW(), 'Jimmy');
INSERT INTO orders (completed, beverage_id, date_set, guest) VALUES (false, 3, NOW(), 'Alice');
INSERT INTO orders (completed, beverage_id, date_set, guest) VALUES (false, 4, NOW(), 'Bob');

