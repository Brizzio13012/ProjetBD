SET AUTOCOMMIT ON;
INSERT INTO Utilisateur VALUES ('jean.b@projetbd.fr', 'Jean', 'Boune', '2 rue de la soif 35000 Rennes');
INSERT INTO Utilisateur VALUES ('fabien.q@projetbd.fr', 'Fabien', 'Quant', '35 promenade des anglais 06000 Nice');

INSERT INTO CategorieProduit VALUES ('brosse', 'Contient tous les types de brosses');

INSERT INTO Produit VALUES (255, 'Brosse à cheveux', 2.50, 20, 'brosse', 'jean.b@projetbd.fr');
INSERT INTO Produit VALUES (960, 'Brosse à dent', 24, 300, 'brosse', 'fabien.q@projetbd.fr');

INSERT INTO Caracteristique VALUES (255, 'couleur', 'verte');
INSERT INTO Caracteristique VALUES (284, 'nombre de piques', '48cm');
INSERT INTO Caracteristique VALUES (960, 'taille', '20 batonnêts');

INSERT INTO TypeEnchere VALUES (4, 1, 0, 0, 50, 0, NULL);

INSERT INTO SalleDeVente VALUES (38, 4, 'brosse');

INSERT INTO Vente VALUES (12, TO_TIMESTAMP('2018/12/12 07:00:03', 'YYYY/MM/DD HH:MI:SS'), 0,  38, 960);
