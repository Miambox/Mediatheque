INSERT INTO UTILISATEUR (id, email, mdp, nom, prenom) VALUES (1, 'talil@gmail.com', 'root', 'talil', 'doe');
INSERT INTO UTILISATEUR (id, email, mdp, nom, prenom) VALUES (2, 'asap@gmail.com', 'asap', 'asap', 'sno');
INSERT INTO UTILISATEUR (id, email, mdp, nom, prenom) VALUES (3, 'mia@gmail.com', 'mia', 'mia', 'miam');
/* ITEMS */
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (1, '1999-06-23', 8, 'The Matrix');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (2, '1972-10-18', 5, 'The Godfather');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (3, '1984-03-07', 4, 'Scarface');

INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (4, '2003-03-04', 0, 'Fallen');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (5, '2012-10-22', 2, 'good kid, m.a.a.d city');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (6, '2017-04-28', 20, 'Ipseite');

INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (7, '2017-04-23'/*'1949-06-08'*/, 18, '1984');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (8, '2017-04-27'/*'2015-05-20'*/, 23, 'La quete d Ewilan');
INSERT INTO ITEMS (id, date_parution, exemplaires, titres) VALUES (9, '2017-04-25'/*'1997-06-30'*/, 14, 'Harry Potter tome 1');

/* CD, DVD, LIVRES */
INSERT INTO DVD (id, duree, dvdtype, realisateur) VALUES (1, 136, 'BLUE_RAY','Lana Wachowski');
INSERT INTO DVD (id, duree, dvdtype, realisateur) VALUES (2, 175, 'NORMAL', 'Francis Coppola');
INSERT INTO DVD (id, duree, dvdtype, realisateur) VALUES (3, 185, 'NORMAL', 'De Palma');

INSERT INTO CD (id, artiste,duree, nbtitres) VALUES (4, 'Evanescence', 48, 12);
INSERT INTO CD (id, artiste,duree, nbtitres) VALUES (5, 'Kendrick Lamar', 92, 17);
INSERT INTO CD (id, artiste,duree, nbtitres) VALUES (6, 'Damso', 49, 14);

INSERT INTO LIVRES (id, ecrivain, isbn) VALUES (7, 'George Orwell', 6257287405);
INSERT INTO LIVRES (id, ecrivain, isbn) VALUES (8, 'Pierre Bottero',1684053250 );
INSERT INTO LIVRES (id, ecrivain, isbn) VALUES (9, 'JK ROLLING', 1338716530);

/* EMPRUNTS */
INSERT INTO EMPRUNT (id, date_emprunt, date_retour, utilisateur_id) VALUES (1, '2022-09-15', '2022-09-22',2);
INSERT INTO EMPRUNT_ITEMS (emprunt_id, items_id) VALUES (1, 5);
INSERT INTO EMPRUNT_ITEMS (emprunt_id, items_id) VALUES (1, 9);