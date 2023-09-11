use `interpol_directory`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `criminal_structure`;

CREATE TABLE `criminal_structure` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `type_of_criminal_structure` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `criminal`;

CREATE TABLE `criminal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `family_name` varchar(128) NOT NULL,
  `forename` varchar(45) NOT NULL,
  `photo_url` varchar(128) NOT NULL,
  `active` boolean NOT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `alias` varchar(45) DEFAULT NULL,
  `height` int DEFAULT NULL,
  `color_of_hair` varchar(45) DEFAULT NULL,
  `eye_colour` varchar(45) DEFAULT NULL,
  `special_signs` varchar(255) DEFAULT NULL,
  `place_of_birth_id` int DEFAULT NULL,
  `last_place_of_residence_id` int DEFAULT NULL,
  `criminal_profession` varchar(45) NOT NULL,
  `the_latest_criminal_case` varchar(255) DEFAULT NULL,
  `criminal_structure_id` int DEFAULT NULL,
  `if_alive` boolean DEFAULT NULL,
  PRIMARY KEY (`id`),
  
  KEY `FK_PLACE_OF_BIRTH_idx` (`place_of_birth_id`),
  CONSTRAINT `FK_PLACE_OF_BIRTH` FOREIGN KEY (`place_of_birth_id`) 
  REFERENCES `cities` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  KEY `FK_LAST_PLACE_OF_RESIDENCE_idx` (`last_place_of_residence_id`),
  CONSTRAINT `FK_LAST_PLACE_OF_RESIDENCE` FOREIGN KEY (`last_place_of_residence_id`) 
  REFERENCES `cities` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  KEY `FK_CRIMINAL_STRUCTURE_idx` (`criminal_structure_id`),
  CONSTRAINT `FK_CRIMINAL_STRUCTURE` FOREIGN KEY (`criminal_structure_id`) 
  REFERENCES `criminal_structure` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `wanted_by_country_criminal`;

CREATE TABLE `wanted_by_country_criminal` (
   `country_id` int NOT NULL,
   `criminal_wanted_by_country_id` int NOT NULL,
  
  PRIMARY KEY ( `country_id`,`criminal_wanted_by_country_id`),
  
  KEY `FK_CRIMINAL_WANTED_BY_COUNTRY_idx` (`criminal_wanted_by_country_id`),
  
  CONSTRAINT `FK_COUNTRY` FOREIGN KEY (`country_id`) 
  REFERENCES `countries` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_CRIMINAL_WANTED_BY_COUNTRY` FOREIGN KEY (`criminal_wanted_by_country_id`) 
  REFERENCES `criminal` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `nationality_criminal`;

CREATE TABLE `nationality_criminal` (
  `nationality_id` int NOT NULL,
  `criminal_nationality_id` int NOT NULL,
  
  PRIMARY KEY (`nationality_id`,`criminal_nationality_id`),
  
  KEY `FK_CRIMINAL_NATIONALITY_idx` (`criminal_nationality_id`),
  
  CONSTRAINT `FK_NATIONALITY` FOREIGN KEY (`nationality_id`) 
  REFERENCES `nationalities` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_CRIMINAL_NATIONALITY` FOREIGN KEY (`criminal_nationality_id`) 
  REFERENCES `criminal` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `language_criminal`;

CREATE TABLE `language_criminal` (
  `language_id` int NOT NULL,
  `criminal_language_id` int NOT NULL,
  
  PRIMARY KEY (`language_id`,`criminal_language_id`),
  
  KEY `FK_CRIMINAL_LANGUAGE_idx` (`criminal_language_id`),
  
  CONSTRAINT `FK_LANGUAGE` FOREIGN KEY (`language_id`) 
  REFERENCES `languages` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION,
  
  CONSTRAINT `FK_CRIMINAL_LANGUAGE` FOREIGN KEY (`criminal_language_id`) 
  REFERENCES `criminal` (`id`) 
  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;