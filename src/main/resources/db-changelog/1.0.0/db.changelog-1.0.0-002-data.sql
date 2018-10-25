--liquibase formatted sql
--changeset jch:002

-- A sample data as presented on https://www.jooq.org/doc/3.9/manual-single-page/#sample-database

INSERT INTO language (id, cd, description) VALUES
  (1, 'en', 'English'),
  (2, 'de', 'Deutsch'),
  (3, 'fr', 'Français'),
  (4, 'pt', 'Português');

INSERT INTO author (id, first_name, last_name, date_of_birth, year_of_birth) VALUES
  (1, 'George', 'Orwell', DATE '1903-06-26', 1903),
  (2, 'Paulo', 'Coelho', DATE '1947-08-24', 1947);

INSERT INTO book (id, author_id, title, published_in, language_id) VALUES
  (1, 1, '1984', 1948, 1),
  (2, 1, 'Animal Farm', 1945, 1),
  (3, 2, 'O Alquimista', 1988, 4),
  (4, 2, 'Brida', 1990, 2);

INSERT INTO book_store VALUES
  ('Orell Füssli'),
  ('Ex Libris'),
  ('Buchhandlung im Volkshaus');

INSERT INTO book_to_book_store VALUES
  ('Orell Füssli', 1, 10),
  ('Orell Füssli', 2, 10),
  ('Orell Füssli', 3, 10),
  ('Ex Libris', 1, 1),
  ('Ex Libris', 3, 2),
  ('Buchhandlung im Volkshaus', 3, 1);

COMMIT;
