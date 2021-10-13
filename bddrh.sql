-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 13 oct. 2021 à 16:44
-- Version du serveur :  10.4.17-MariaDB
-- Version de PHP : 7.4.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bddrh`
--

-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

CREATE TABLE `contrat` (
  `id` varchar(100) NOT NULL,
  `dateDebut` date DEFAULT NULL,
  `dateFin` date DEFAULT NULL,
  `idSal` varchar(100) NOT NULL,
  `idPoste` varchar(100) NOT NULL,
  `idService` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `contrat`
--

INSERT INTO `contrat` (`id`, `dateDebut`, `dateFin`, `idSal`, `idPoste`, `idService`) VALUES
('1977102', '1977-03-15', '1985-03-01', '148A12', '1', 'B01'),
('1985076', '1985-03-01', '2002-09-15', '148A12', '3', 'F01'),
('2000098', '2000-09-01', '2010-10-10', '156A12', '4', 'G01'),
('2002181', '2002-09-15', NULL, '148A12', '2', 'F01'),
('2008045', '2008-05-05', '2008-10-17', '196A12', '1', 'E21'),
('2008111', '2008-10-17', NULL, '196A12', '6', 'F01'),
('2010065', '2010-10-10', NULL, '156A12', '5', 'G01');

-- --------------------------------------------------------

--
-- Structure de la table `poste`
--

CREATE TABLE `poste` (
  `id` varchar(100) NOT NULL,
  `libelle` varchar(500) NOT NULL,
  `caracteristique` varchar(500) NOT NULL,
  `indice` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `poste`
--

INSERT INTO `poste` (`id`, `libelle`, `caracteristique`, `indice`) VALUES
('1', 'Magasiniser(e)', 'Magasinier(e) en réserve', '385'),
('2', 'Responsable informatique', 'Gestion équipe de 2 à 3 personnes', '455'),
('3', 'Informaticien(ne)', 'Maintenance technique', '395'),
('4', 'Hôte(sse) de casse', 'Rotation horaire et week-end', '365'),
('5', 'Chargé(e) d\'équipe', 'Manage une équipe de 10 hête(sse)s de casse', '430'),
('6', 'Commercial(e)', 'Poste en rayon', '400');

-- --------------------------------------------------------

--
-- Structure de la table `salarie`
--

CREATE TABLE `salarie` (
  `id` varchar(100) NOT NULL,
  `numSecu` varchar(110) NOT NULL,
  `nom` varchar(500) NOT NULL,
  `prenom` varchar(500) NOT NULL,
  `dateNaiss` date NOT NULL,
  `dateEmbauche` date NOT NULL,
  `tel` varchar(100) NOT NULL,
  `mel` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `salarie`
--

INSERT INTO `salarie` (`id`, `numSecu`, `nom`, `prenom`, `dateNaiss`, `dateEmbauche`, `tel`, `mel`) VALUES
('148A12', '1520814168026', 'MARTIN', 'Pierre', '1952-08-05', '1977-03-15', '038312XXXX', 'pierre.martin@proxim.fr'),
('156A12', '2671154395023', 'ESTEN', 'Solène', '1967-11-18', '2000-09-01', '038347XXXX', 'solene.esten@proxim.fr'),
('196A12', '2820388485089', 'BENARBIA', 'Samia', '2008-05-05', '0000-00-00', '066746XXXX', 'samia.benarbia@proxim.fr');

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

CREATE TABLE `service` (
  `id` varchar(100) NOT NULL,
  `libelle` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `service`
--

INSERT INTO `service` (`id`, `libelle`) VALUES
('A00', 'Direction genérale'),
('B01', 'Approvisionnement'),
('C01', 'Comptabilité'),
('D01', 'Service après vente'),
('D11', 'Boucherie'),
('D21', 'Boulangerie'),
('E01', 'Epicerie'),
('E11', 'Produits frais'),
('E21', 'Electroménager'),
('E31', 'Animalerie et jardin'),
('F01', 'Informatique'),
('F02', 'Ressources humaines'),
('G01', 'Caisse');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `contrat`
--
ALTER TABLE `contrat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPoste` (`idPoste`),
  ADD KEY `idSal` (`idSal`),
  ADD KEY `idService` (`idService`);

--
-- Index pour la table `poste`
--
ALTER TABLE `poste`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `salarie`
--
ALTER TABLE `salarie`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `contrat`
--
ALTER TABLE `contrat`
  ADD CONSTRAINT `contrat_ibfk_1` FOREIGN KEY (`idPoste`) REFERENCES `poste` (`id`),
  ADD CONSTRAINT `contrat_ibfk_2` FOREIGN KEY (`idSal`) REFERENCES `salarie` (`id`),
  ADD CONSTRAINT `contrat_ibfk_3` FOREIGN KEY (`idService`) REFERENCES `service` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
