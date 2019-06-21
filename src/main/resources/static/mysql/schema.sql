CREATE SCHEMA IF NOT EXISTS `travel_db` DEFAULT CHARACTER SET utf8 ;
USE `travel_db` ;


CREATE TABLE IF NOT EXISTS `travel_db`.`travel_cities` (
  `city_id` INT(11) NOT NULL AUTO_INCREMENT,
  `city_name` VARCHAR(45) NOT NULL,
  `city_description` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`city_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;