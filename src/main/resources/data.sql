DROP TABLE IF EXISTS branch;

CREATE TABLE branch (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  address VARCHAR(250) NOT NULL,
  date_attention DATE NOT NULL,
  latitude VARCHAR(250) DEFAULT NULL,
  longitude VARCHAR(250) DEFAULT NULL
);