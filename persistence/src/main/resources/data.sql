INSERT INTO PERSON (id, firstname, lastname) VALUES
(1, 'Testfirstname0', 'Testlastname0');

INSERT INTO ADDRESS (id, street, houseNumber, postalCode, city, locale) VALUES
(1, 'Propertystreet' ,'1', '8000', 'Zürich', 'ch');
(2, 'Owenerstreet' ,'1', '3000', 'Bern', 'ch');

INSERT INTO PROPERTY (id, property_owner, address, renter) VALUES
(1, 1, 1, 1);

INSERT INTO PROPERTY_OWNER (id, address, name) VALUES
(1, 2, 'PropertyOwnerName');

INSERT INTO RENTER (id, person, property) VALUES
(1, 1, 1);
