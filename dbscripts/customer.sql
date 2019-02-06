CREATE TABLE monitoring_demo_db.customer
(
  id                 INT(11) NOT NULL AUTO_INCREMENT,
  address            VARCHAR(255),
  created_date       DATETIME,
  email              VARCHAR(255),
  last_modified_date DATETIME,
  name               VARCHAR(255),
  PRIMARY KEY (id)
) ENGINE = INNODB;