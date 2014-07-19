-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 19, 2014 at 10:14 Þ.Ù
-- Server version: 5.0.45
-- PHP Version: 5.3.1

--
-- data
--
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `list`
--

-- --------------------------------------------------------

--
-- Table structure for table `phonecontacts`
--

CREATE TABLE IF NOT EXISTS `phonecontacts` (
  `Line` int(10) unsigned NOT NULL auto_increment,
  `Name` varchar(45) NOT NULL,
  `Last_Name` varchar(45) NOT NULL,
  `Home_Number` varchar(45) default NULL,
  `Mobile_Number` varchar(45) default NULL,
  `Email` varchar(45) default NULL,
  `Address` varchar(45) default NULL,
  PRIMARY KEY  (`Line`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='Contacts' AUTO_INCREMENT=4 ;

--
-- Dumping data for table `phonecontacts`
--

INSERT INTO `phonecontacts` (`Line`, `Name`, `Last_Name`, `Home_Number`, `Mobile_Number`, `Email`, `Address`) VALUES
(1, 'Mahdi', 'SoleymaniFar', '33795560', '09195512405', 'Mahdisolif@gmail.com', 'Kh.p.Kh.d.K.R.P.27T.1'),
(2, 'Hossein', 'SoleymaniFar', '33564345', '09363152316', 'eng.hossein@gmail.com', 'Kh.p.Kh.j.Kh.d.K.k.B.T.P54T.4'),
(3, 'Mohammad', 'SoleymaniFar', '33795560', '09356595877', 'InpMohammad@gmail.com', 'Kh.P.Kh.d.K.R.P.27T.1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
