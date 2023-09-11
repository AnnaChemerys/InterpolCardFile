-- Drop user first if they exist
DROP USER if exists 'interpolstudent'@'localhost' ;

-- Now create user with prop privileges
CREATE USER 'interpolstudent'@'localhost' IDENTIFIED BY 'interpolstudent';

GRANT ALL PRIVILEGES ON * . * TO 'interpolstudent'@'localhost';