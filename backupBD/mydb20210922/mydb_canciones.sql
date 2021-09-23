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
-- Table structure for table `canciones`
--

DROP TABLE IF EXISTS `canciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `canciones` (
  `idCanciones` int(11) NOT NULL,
  `tituloCanciones` varchar(45) NOT NULL,
  `agnoCanciones` varchar(45) NOT NULL,
  `idArtistas` int(11) NOT NULL,
  `idAlbum` int(11) NOT NULL,
  `idGenero` int(11) NOT NULL,
  PRIMARY KEY (`idCanciones`),
  UNIQUE KEY `idCancion_UNIQUE` (`idCanciones`),
  KEY `idArtistaCancion_idx` (`idArtistas`),
  KEY `idAlbumIdCancion_idx` (`idAlbum`),
  KEY `idGenero_idx` (`idGenero`),
  CONSTRAINT `idAlbumIdCancion` FOREIGN KEY (`idAlbum`) REFERENCES `album` (`idAlbum`),
  CONSTRAINT `idArtistaCancion` FOREIGN KEY (`idArtistas`) REFERENCES `artistas` (`idArtistas`),
  CONSTRAINT `idGenero` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`idGenero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canciones`
--

LOCK TABLES `canciones` WRITE;
/*!40000 ALTER TABLE `canciones` DISABLE KEYS */;
INSERT INTO `canciones` VALUES (1,'This is a Call','1995',1,1,1),(2,'Big Me','1995',1,1,1),(3,'For All The Cows','1995',1,1,1),(4,'Monkey Wrench','1997',1,2,1),(5,'My Hero','1997',1,2,1),(6,'Everlong','1997',1,2,1),(7,'Stacked Actors','1999',1,3,1),(8,'Aurora','1999',1,3,1),(9,'Learn to Fly','1999',1,3,1),(10,'Seek and Destroy','1983',2,1,2),(11,'Jump in the Fire','1983',2,1,2),(12,'The Four Horsemen','1983',2,1,2),(13,'The Call of Ktulu','1984',2,2,2),(14,'Fade to Black','1984',2,2,2),(15,'Creeping Death','1984',2,2,2),(16,'Master of Puppets','1986',2,3,2),(17,'Orion','1986',2,3,2),(18,'Battery','1986',2,3,2);
/*!40000 ALTER TABLE `canciones` ENABLE KEYS */;
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
