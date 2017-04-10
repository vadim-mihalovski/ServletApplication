-- MySQL dump 10.13  Distrib 5.7.13, for Win64 (x86_64)
--
-- Host: localhost    Database: nc_lab_2017
-- ------------------------------------------------------
-- Server version	5.7.13

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
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `name` varchar(100) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `office` varchar(100) DEFAULT NULL,
  `age` varchar(100) DEFAULT NULL,
  `startdate` varchar(100) DEFAULT NULL,
  `salary` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('Name #1','Position #1','Office #1','Age #1','Start Date #1','Salary #1'),('Name #2','Position #2','Office #2','Age #2','Start Date #2','Salary #2'),('Name #3','Position #3','Office #3','Age #3','Start Date #3','Salary #3'),('Name #4','Position #4','Office #4','Age #4','Start Date #4','Salary #4'),('Name #5','Position #5','Office #5','Age #5','Start Date #5','Salary #5'),('Name #6','Position #6','Office #6','Age #6','Start Date #6','Salary #6'),('Name #7','Position #7','Office #7','Age #7','Start Date #7','Salary #7'),('Name #8','Position #8','Office #8','Age #8','Start Date #8','Salary #8'),('Name #9','Position #9','Office #9','Age #9','Start Date #9','Salary #9'),('Name #10','Position #10','Office #10','Age #10','Start Date #10','Salary #10'),('Name #11','Position #11','Office #11','Age #11','Start Date #11','Salary #11'),('Name #12','Position #12','Office #12','Age #12','Start Date #12','Salary #12'),('Name #13','Position #13','Office #13','Age #13','Start Date #13','Salary #13'),('Name #14','Position #14','Office #14','Age #14','Start Date #14','Salary #14'),('Name #15','Position #15','Office #15','Age #15','Start Date #15','Salary #15'),('Name #16','Position #16','Office #16','Age #16','Start Date #16','Salary #16'),('Name #17','Position #17','Office #17','Age #17','Start Date #17','Salary #17'),('Name #18','Position #18','Office #18','Age #18','Start Date #18','Salary #18'),('Name #19','Position #19','Office #19','Age #19','Start Date #19','Salary #19'),('Name #20','Position #20','Office #20','Age #20','Start Date #20','Salary #20'),('Name #21','Position #21','Office #21','Age #21','Start Date #21','Salary #21'),('Name #22','Position #22','Office #22','Age #22','Start Date #22','Salary #22'),('Name #23','Position #23','Office #23','Age #23','Start Date #23','Salary #23'),('Name #24','Position #24','Office #24','Age #24','Start Date #24','Salary #24'),('Name #25','Position #25','Office #25','Age #25','Start Date #25','Salary #25'),('Name #26','Position #26','Office #26','Age #26','Start Date #26','Salary #26'),('Name #27','Position #27','Office #27','Age #27','Start Date #27','Salary #27'),('Name #28','Position #28','Office #28','Age #28','Start Date #28','Salary #28'),('Name #29','Position #29','Office #29','Age #29','Start Date #29','Salary #29'),('Name #30','Position #30','Office #30','Age #30','Start Date #30','Salary #30'),('Name #31','Position #31','Office #31','Age #31','Start Date #31','Salary #31'),('Name #32','Position #32','Office #32','Age #32','Start Date #32','Salary #32'),('Name #33','Position #33','Office #33','Age #33','Start Date #33','Salary #33'),('Name #34','Position #34','Office #34','Age #34','Start Date #34','Salary #34'),('Name #35','Position #35','Office #35','Age #35','Start Date #35','Salary #35'),('Name #36','Position #36','Office #36','Age #36','Start Date #36','Salary #36'),('Name #37','Position #37','Office #37','Age #37','Start Date #37','Salary #37'),('Name #38','Position #38','Office #38','Age #38','Start Date #38','Salary #38'),('Name #39','Position #39','Office #39','Age #39','Start Date #39','Salary #39');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-24 20:33:32
