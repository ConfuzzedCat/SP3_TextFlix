CREATE SCHEMA `textflix` ;
USE `textflix`;
CREATE TABLE `accounts` (
  `users` json DEFAULT NULL,
  `firstName` text,
  `lastName` text,
  `userName` text,
  `password` text,
  `email` text,
  `AccountID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`AccountID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `movies` (
  `Name` text,
  `ReleaseYear` int DEFAULT NULL,
  `Category` text,
  `Rating` double DEFAULT NULL,
  `MovieID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`MovieID`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `series` (
  `Name` text,
  `Years` text,
  `Category` text,
  `Rating` double DEFAULT NULL,
  `Seasons` text,
  `SerieID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`SerieID`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;