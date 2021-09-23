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

-- Dump completed on 2021-09-22 21:57:09
