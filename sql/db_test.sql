DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user table
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
  id       INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(191) UNIQUE,
  password VARCHAR(255)
);

TRUNCATE TABLE db_test.user;

SELECT *
FROM db_test.user;
