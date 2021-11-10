-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 10 nov. 2021 à 17:25
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
-- Base de données : `dbfret`
--

-- --------------------------------------------------------

--
-- Structure de la table `affretement`
--

CREATE TABLE `affretement` (
  `id` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `heure` time NOT NULL,
  `idBatFret` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `affretement`
--

INSERT INTO `affretement` (`id`, `date`, `heure`, `idBatFret`) VALUES
('1', '2021-11-09', '15:00:00', '1'),
('2', '2021-10-05', '06:15:15', '2'),
('3', '2021-11-05', '20:56:46', '2');

-- --------------------------------------------------------

--
-- Structure de la table `bateaufret`
--

CREATE TABLE `bateaufret` (
  `id` varchar(50) NOT NULL,
  `poidsMax` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bateaufret`
--

INSERT INTO `bateaufret` (`id`, `poidsMax`) VALUES
('1', 15.5),
('2', 21.2);

-- --------------------------------------------------------

--
-- Structure de la table `lot`
--

CREATE TABLE `lot` (
  `idAff` varchar(50) NOT NULL,
  `idLot` varchar(50) NOT NULL,
  `poids` float NOT NULL,
  `idTran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `lot`
--

INSERT INTO `lot` (`idAff`, `idLot`, `poids`, `idTran`) VALUES
('1', '2', 60.3, '1'),
('1', '459629', 20.56, '1'),
('2', '3', 78.5, '2');

-- --------------------------------------------------------

--
-- Structure de la table `tranche`
--

CREATE TABLE `tranche` (
  `id` varchar(50) NOT NULL,
  `tarifunit` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `tranche`
--

INSERT INTO `tranche` (`id`, `tarifunit`) VALUES
('1', 500),
('2', 300.52);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `affretement`
--
ALTER TABLE `affretement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idBatFret` (`idBatFret`);

--
-- Index pour la table `bateaufret`
--
ALTER TABLE `bateaufret`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `lot`
--
ALTER TABLE `lot`
  ADD PRIMARY KEY (`idAff`,`idLot`),
  ADD KEY `idTran` (`idTran`);

--
-- Index pour la table `tranche`
--
ALTER TABLE `tranche`
  ADD PRIMARY KEY (`id`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `affretement`
--
ALTER TABLE `affretement`
  ADD CONSTRAINT `affretement_ibfk_1` FOREIGN KEY (`idBatFret`) REFERENCES `bateaufret` (`id`);

--
-- Contraintes pour la table `lot`
--
ALTER TABLE `lot`
  ADD CONSTRAINT `lot_ibfk_1` FOREIGN KEY (`idAff`) REFERENCES `affretement` (`id`),
  ADD CONSTRAINT `lot_ibfk_2` FOREIGN KEY (`idTran`) REFERENCES `tranche` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
