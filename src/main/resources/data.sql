CREATE TABLE education_model (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 education VARCHAR(255),
                                 technology VARCHAR(255),
                                 description VARCHAR(255),
                                 ranking DOUBLE PRECISION,
                                 UNIQUE KEY id_UNIQUE (id)
) ENGINE=InnoDB;
