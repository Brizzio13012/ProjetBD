DROP TABLE Caracteristique;
DROP TABLE Enchere;
DROP TABLE Vente;
DROP TABLE Produit;
DROP TABLE SalleDeVente;
DROP TABLE CategorieProduit;
DROP TABLE Utilisateur;
DROP TABLE TypeEnchere;

CREATE TABLE TypeEnchere(
  idTypeEnchere int CHECK (idTypeEnchere >= 0),
  montanteOuPas int default 1 NOT NULL,
  plusieursEncheresOuPas int default 1 NOT NULL,
  revocableOuPas int default 0  NOT NULL,
  prixDeDepart float check (prixDeDepart >= 0),
  dureeLimiteeOuPas int default 0  NOT NULL,
  dureeLimite float,
  PRIMARY KEY(idTypeEnchere)
);

CREATE TABLE Utilisateur(
  email character varying(50) NOT NULL,
  nom character varying(50) NOT NULL,
  prenom character varying(50) NOT NULL,
  adresse character varying(100) NOT NULL,
  primary key(email)
);

CREATE TABLE CategorieProduit(
  nom character varying(50) NOT NULL,
  descriptionCatProduit character varying(200) NOT NULL,
  PRIMARY KEY(nom)
);

CREATE TABLE SalleDeVente(
  idSalle int CHECK (idSalle >= 0),
  typeSalle int NOT null,
  nomCategorie character varying(50) NOT NULL,
  FOREIGN KEY(nomCategorie) REFERENCES CategorieProduit,
  PRIMARY KEY(idSalle)
);

CREATE TABLE Produit(
  idProduit int NOT NULL,
  nomProduit character varying(50) NOT NULL,
  prixRevient float NOT NULL,
  stock int NOT NULL,
  nomCategorie character varying(50) NOT NULL,
  FOREIGN KEY(nomCategorie) REFERENCES CategorieProduit,
  emailVendeur character varying(50) NOT NULL,
  FOREIGN KEY(emailVendeur) REFERENCES Utilisateur,
  PRIMARY KEY(idProduit)
);

CREATE TABLE Vente(
  idVente int CHECK (idVente > 0),
  dateMiseEnActivite TIMESTAMP NOT NULL,
  finieOuPas int default 0,
  salle int NOT NULL,
  FOREIGN KEY(salle) REFERENCES SalleDeVente,
  produitPropose int NOT NULL,
  FOREIGN KEY(produitPropose) REFERENCES Produit,
  PRIMARY KEY(idVente)
);

CREATE TABLE Enchere(
  idVente int CHECK (idVente >= 0),
  Foreign key(idVente) REFERENCES Vente,
  idEnchere int CHECK (idEnchere >= 0),
  prixPospose float CHECK (prixPospose > 0),
  dateEnchere TIMESTAMP NOT NULL,
  quantite int CHECK (quantite > 0),
  emetteur character varying(50) NOT NULL,
  FOREIGN KEY(emetteur) REFERENCES Utilisateur,
  PRIMARY KEY(idEnchere)
);

CREATE TABLE Caracteristique(
  idProduit int CHECK (idProduit >= 0),
  nom character varying(50) NOT NULL,
  valeur int CHECK (valeur >= 0),
  PRIMARY KEY(idProduit, nom)
);
