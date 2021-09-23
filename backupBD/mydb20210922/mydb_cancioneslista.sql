-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cancioneslista`
--

DROP TABLE IF EXISTS `cancioneslista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cancioneslista` (
  `idCancionesLista` int(11) NOT NULL AUTO_INCREMENT,
  `idListaReproduccion` int(11) NOT NULL,
  `idCanciones` int(11) NOT NULL,
  `favoritaCancion` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idCancionesLista`),
  UNIQUE KEY `idCancionesLista_UNIQUE` (`idCancionesLista`),
  KEY `CancionCancionLista_idx` (`idCanciones`),
  KEY `idListaReprodCancionLista_idx` (`idListaReproduccion`),
  CONSTRAINT `idCancionCancionLista` FOREIGN KEY (`idCanciones`) REFERENCES `canciones` (`idCanciones`),
  CONSTRAINT `idListaGuardadaCancionLista` FOREIGN KEY (`idListaReproduccion`) REFERENCES `listaguardada` (`idListaGuardada`),
  CONSTRAINT `idListaReprodCancionLista` FOREIGN KEY (`idListaReproduccion`) REFERENCES `listareproduccion` (`idListaReproduccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cancioneslista`
--

LOCK TABLES `cancioneslista` WRITE;
/*!40000 ALTER TABLE `cancioneslista` DISABLE KEYS */;
/*!40000 ALTER TABLE `cancioneslista` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-22 21:57:07
