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
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `album` (
  `idAlbum` int(11) NOT NULL AUTO_INCREMENT,
  `nombreAlbum` varchar(45) NOT NULL,
  `selloDisco` varchar(45) NOT NULL,
  `agnoAlbum` varchar(45) NOT NULL,
  PRIMARY KEY (`idAlbum`),
  UNIQUE KEY `idAlbum_UNIQUE` (`idAlbum`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album`
--

LOCK TABLES `album` WRITE;
/*!40000 ALTER TABLE `album` DISABLE KEYS */;
INSERT INTO `album` VALUES (1,'FooFighters','Roswell Records','1996'),(2,'The Colour and the Shape','Roswell Records','1997'),(3,'There is Nothing Left to Lose','BMG','1999'),(4,'Kill em all','Megaforce','1983'),(5,'Ride the Lightning','Megaforce','1984'),(6,'Master of Puppets','Elektra','1986');
/*!40000 ALTER TABLE `album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artistas`
--

DROP TABLE IF EXISTS `artistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artistas` (
  `idArtistas` int(11) NOT NULL,
  `nombreArtistas` varchar(45) NOT NULL,
  `nacionalidadArtistas` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idArtistas`),
  UNIQUE KEY `idArtista_UNIQUE` (`idArtistas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artistas`
--

LOCK TABLES `artistas` WRITE;
/*!40000 ALTER TABLE `artistas` DISABLE KEYS */;
INSERT INTO `artistas` VALUES (1,'Foo Fighters','pais1'),(2,'Metallica','USA');
/*!40000 ALTER TABLE `artistas` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL AUTO_INCREMENT,
  `nombreGenero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idGenero`),
  UNIQUE KEY `idGenero_UNIQUE` (`idGenero`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Post Grunge e'),(2,'Trash Metal');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listaguardada`
--

DROP TABLE IF EXISTS `listaguardada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listaguardada` (
  `idListaGuardada` int(11) NOT NULL AUTO_INCREMENT,
  `nombreLista` varchar(45) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idListaGuardada`),
  UNIQUE KEY `idListaGuardada_UNIQUE` (`idListaGuardada`),
  KEY `idListaGuardadaidUsuario_idx` (`idUsuario`),
  CONSTRAINT `idListaGuardadaidUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listaguardada`
--

LOCK TABLES `listaguardada` WRITE;
/*!40000 ALTER TABLE `listaguardada` DISABLE KEYS */;
INSERT INTO `listaguardada` VALUES (1,'Favoritos_CBURGOS',1);
/*!40000 ALTER TABLE `listaguardada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listareproduccion`
--

DROP TABLE IF EXISTS `listareproduccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listareproduccion` (
  `idListaReproduccion` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idCancionesLista` int(11) DEFAULT NULL,
  `fechaUltimReprod` date NOT NULL,
  PRIMARY KEY (`idListaReproduccion`),
  UNIQUE KEY `idCancionesLista_UNIQUE` (`idCancionesLista`),
  KEY `UsuarioListaReproduccion_idx` (`idUsuario`),
  CONSTRAINT `UsuarioListaReproduccion` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listareproduccion`
--

LOCK TABLES `listareproduccion` WRITE;
/*!40000 ALTER TABLE `listareproduccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `listareproduccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL,
  `rolUsuario` varchar(45) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `idusuario_UNIQUE` (`idUsuario`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  UNIQUE KEY `Email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'cburgos','12345','Administrador','Carlos Burgos','caburgoss@gmail.com');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vistacanciones`
--

DROP TABLE IF EXISTS `vistacanciones`;
/*!50001 DROP VIEW IF EXISTS `vistacanciones`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vistacanciones` AS SELECT 
 1 AS `idCanciones`,
 1 AS `tituloCanciones`,
 1 AS `agnoCanciones`,
 1 AS `idArtistas`,
 1 AS `nombreArtistas`,
 1 AS `nacionalidadArtistas`,
 1 AS `idAlbum`,
 1 AS `nombreAlbum`,
 1 AS `selloDisco`,
 1 AS `agnoAlbum`,
 1 AS `idGenero`,
 1 AS `nombreGenero`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vistacancioneslista`
--

DROP TABLE IF EXISTS `vistacancioneslista`;
/*!50001 DROP VIEW IF EXISTS `vistacancioneslista`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vistacancioneslista` AS SELECT 
 1 AS `idCancionesLista`,
 1 AS `idListaReproduccion`,
 1 AS `idUsuario`,
 1 AS `idCanciones`,
 1 AS `tituloCanciones`,
 1 AS `agnoCanciones`,
 1 AS `favoritaCancion`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vistalistareproduccion`
--

DROP TABLE IF EXISTS `vistalistareproduccion`;
/*!50001 DROP VIEW IF EXISTS `vistalistareproduccion`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vistalistareproduccion` AS SELECT 
 1 AS `idListaReproduccion`,
 1 AS `idUsuario`,
 1 AS `usuario`,
 1 AS `nombres`,
 1 AS `idCancionesLista`,
 1 AS `idCanciones`,
 1 AS `tituloCanciones`,
 1 AS `agnoCanciones`,
 1 AS `idArtistas`,
 1 AS `nombreArtistas`,
 1 AS `nacionalidadArtistas`,
 1 AS `favoritaCancion`,
 1 AS `idAlbum`,
 1 AS `nombreAlbum`,
 1 AS `selloDisco`,
 1 AS `agnoAlbum`,
 1 AS `idGenero`,
 1 AS `nombreGenero`,
 1 AS `fechaUltimReprod`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vistacanciones`
--

/*!50001 DROP VIEW IF EXISTS `vistacanciones`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistacanciones` AS select `canciones`.`idCanciones` AS `idCanciones`,`canciones`.`tituloCanciones` AS `tituloCanciones`,`canciones`.`agnoCanciones` AS `agnoCanciones`,`artistas`.`idArtistas` AS `idArtistas`,`artistas`.`nombreArtistas` AS `nombreArtistas`,`artistas`.`nacionalidadArtistas` AS `nacionalidadArtistas`,`album`.`idAlbum` AS `idAlbum`,`album`.`nombreAlbum` AS `nombreAlbum`,`album`.`selloDisco` AS `selloDisco`,`album`.`agnoAlbum` AS `agnoAlbum`,`genero`.`idGenero` AS `idGenero`,`genero`.`nombreGenero` AS `nombreGenero` from (((`canciones` join `artistas` on((`canciones`.`idArtistas` = `artistas`.`idArtistas`))) join `album` on((`canciones`.`idAlbum` = `album`.`idAlbum`))) join `genero` on((`canciones`.`idGenero` = `genero`.`idGenero`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistacancioneslista`
--

/*!50001 DROP VIEW IF EXISTS `vistacancioneslista`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistacancioneslista` AS select `cancioneslista`.`idCancionesLista` AS `idCancionesLista`,`listareproduccion`.`idListaReproduccion` AS `idListaReproduccion`,`usuario`.`idUsuario` AS `idUsuario`,`canciones`.`idCanciones` AS `idCanciones`,`canciones`.`tituloCanciones` AS `tituloCanciones`,`canciones`.`agnoCanciones` AS `agnoCanciones`,`cancioneslista`.`favoritaCancion` AS `favoritaCancion` from (((`cancioneslista` join `listareproduccion` on((`cancioneslista`.`idListaReproduccion` = `listareproduccion`.`idListaReproduccion`))) join `canciones` on((`cancioneslista`.`idCanciones` = `canciones`.`idCanciones`))) join `usuario` on((`listareproduccion`.`idUsuario` = `usuario`.`idUsuario`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistalistareproduccion`
--

/*!50001 DROP VIEW IF EXISTS `vistalistareproduccion`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistalistareproduccion` AS select `listareproduccion`.`idListaReproduccion` AS `idListaReproduccion`,`usuario`.`idUsuario` AS `idUsuario`,`usuario`.`usuario` AS `usuario`,`usuario`.`nombres` AS `nombres`,`cancioneslista`.`idCancionesLista` AS `idCancionesLista`,`canciones`.`idCanciones` AS `idCanciones`,`canciones`.`tituloCanciones` AS `tituloCanciones`,`canciones`.`agnoCanciones` AS `agnoCanciones`,`artistas`.`idArtistas` AS `idArtistas`,`artistas`.`nombreArtistas` AS `nombreArtistas`,`artistas`.`nacionalidadArtistas` AS `nacionalidadArtistas`,`cancioneslista`.`favoritaCancion` AS `favoritaCancion`,`album`.`idAlbum` AS `idAlbum`,`album`.`nombreAlbum` AS `nombreAlbum`,`album`.`selloDisco` AS `selloDisco`,`album`.`agnoAlbum` AS `agnoAlbum`,`genero`.`idGenero` AS `idGenero`,`genero`.`nombreGenero` AS `nombreGenero`,`listareproduccion`.`fechaUltimReprod` AS `fechaUltimReprod` from ((((((`listareproduccion` join `usuario` on((`listareproduccion`.`idUsuario` = `usuario`.`idUsuario`))) join `cancioneslista` on((`listareproduccion`.`idCancionesLista` = `cancioneslista`.`idCancionesLista`))) join `canciones` on((`cancioneslista`.`idCanciones` = `canciones`.`idCanciones`))) join `artistas` on((`canciones`.`idArtistas` = `artistas`.`idArtistas`))) join `album` on((`canciones`.`idAlbum` = `album`.`idAlbum`))) join `genero` on((`canciones`.`idGenero` = `genero`.`idGenero`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-06 23:01:24
