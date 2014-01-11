CREATE DATABASE  IF NOT EXISTS `maven_project` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `maven_project`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: maven_project
-- ------------------------------------------------------
-- Server version	5.6.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `subjectId` int(11) NOT NULL AUTO_INCREMENT,
  `subjectName` varchar(50) NOT NULL,
  `semesterId` int(10) NOT NULL,
  `courseId` int(10) NOT NULL,
  PRIMARY KEY (`subjectId`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'Computational Mathematics-I',1,1),(2,'Basic Electronics',1,1),(3,'Data Structure',1,1),(4,'Communication Skills',1,1),(5,'System Programming',2,1),(6,'Digital Logic',2,1),(7,'Computational Mathematics-I',2,1),(8,'Computer Organisation',2,1),(9,'Data Communications',3,1),(10,'Operating Systems',3,1),(11,'Microprocessor',3,1),(12,'Automata Theory',3,1),(13,'Software Engineer-I',4,1),(14,'Computer Architecture',4,1),(15,'Compiler Design',4,1),(16,'Design & Analysis Of Algorithms',5,1),(17,'Database Management System',5,1),(18,'Objected Oriented System',5,1),(19,'Software Engineering II',5,1),(20,'Computer Networks',6,1),(21,'Artificial intelligence',6,1),(22,'Optimization Technique',6,1),(23,'Computer Graphics',6,1),(24,'Economics',7,1),(25,'Business Process Logic ',7,1),(26,'Multimedia Technology',7,1),(27,'Internet Technology',7,1),(28,'Soft Computing',8,1),(29,'Industrial Management',8,1),(30,'Distributed Systems',8,1),(31,'Cyrptography',8,1),(32,'Applied Mathematics',1,2),(33,'Electronic Devices & Circuit',1,2),(34,'Electronic Instrument',2,2),(35,'Programming using Oops',2,2),(36,'Analog Electronics',3,2),(37,'Digital Electronics',3,2),(38,'Signals & Systems',4,2),(39,'Analog Communication System',4,2),(40,'Linear Integrated Circuit',5,2),(41,'Digital & Switching Circuit',5,2),(42,'Multiprocess & its applications',6,2),(43,'Total Quality Management',6,2),(44,'Digital Communication',7,2),(45,'Environment Science',7,2),(46,'Optical Fiber Communications',8,2),(47,'VLSI Design & Technology',8,2),(48,'Network Analysis & Synthesis',1,3),(49,'Magnetic Circuits & Transformers',1,3),(50,'Linear Control Systems',2,3),(51,'Applied Electronics',2,3),(52,'Digital Electronics',3,3),(53,'Electrical Engg. Materials',3,3),(54,'Asynchronous Machines',4,3),(55,'Microprocessors',4,3),(56,'Numerical Analysis',5,3),(57,'Power Electronics',5,3),(58,'Electric Drives & Utilization',6,3),(59,'Power Plant Engg.',6,3),(60,'Computer Aided Power System Analysis',7,3),(61,'Applied Mathematics - III',7,3),(62,'Object Oriented Programming',8,3),(63,'Power system-I',8,3),(64,'Computer Architecture',1,4),(65,'Mathematics – III',1,4),(66,'Digital Circuits & Logic',2,4),(67,'Programming Languages',2,4),(68,'Operating System',3,4),(69,'Data',3,4),(70,'Systems Programming',4,4),(71,'System Analysis and Design',4,4),(72,'Windows Programming',5,4),(73,'Electronics Commerce',5,4),(74,'Advanced Internet Technology',6,4),(75,'Management Information',6,4),(76,'Network operating System',7,4),(77,'Introduction to Java',7,4),(78,'Environmental Sciences',8,4),(79,'Data Warehousing & Mining',8,4),(80,'Strength of Materials-I',1,5),(81,'Theory of Machines',1,5),(82,'Machine Drawing',2,5),(83,'Manufacturing Process – I',2,5),(84,'Strength of Materials – II',3,5),(85,'Fluid Mechanics –I',3,5),(86,'Applied Thermodynamics',4,5),(87,'Manufacturing Process-II',4,5),(88,'Heat Transfer',5,5),(89,'Automobile Engineering',5,5),(90,'Refrigeration & Air Conditioning',6,5),(91,'Fluid Machinery',6,5),(92,'Industrial Safety & Environment',7,5),(93,'CAD/CAM',7,5),(94,'Mechanical Vibrations',8,5),(95,'Operations Research',8,5),(96,'Fluid Mechanics-I',1,6),(97,'Building Material',1,6),(98,'Solid Mechanism',2,6),(99,'Building Construction',2,6),(100,'Structural Analysis-I',3,6),(101,'Rock Mech. & Engg Geology',3,6),(102,'Envoinmental Science',4,6),(103,'Transportation Engg-II',4,6),(104,'Design of Concrete',5,6),(105,'Hydrology & Dams',5,6),(106,'Environmental Engg-I',6,6),(107,'Irrigation Engg-II',6,6),(108,'Foundation Engg.',7,6),(109,'Geotechnical Engg.',7,6),(110,'Construction Machinery & Works',8,6),(111,'Design of Steel Structures-I',8,6);
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-01-11  0:10:16
