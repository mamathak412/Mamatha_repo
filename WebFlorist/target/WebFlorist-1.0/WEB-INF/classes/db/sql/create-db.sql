DROP TABLE Flowers IF EXISTS;

CREATE table Flowers(
	flowerId INTEGER,
	flowerName VARCHAR(30),
	noOfFlowers INTEGER,
	costOfFlowers INTEGER,
	discount INTEGER,
	image MEDIUMBLOB 
);

Select * from FLOWERS;