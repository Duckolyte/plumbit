INSERT INTO PERSON (id, first_name, last_name) VALUES
(1, 'Testfirstname0', 'Testlastname0');

INSERT INTO ADDRESS (id, street, house_number, postal_code, city, locale) VALUES
(1, 'Propertystreet' ,'1', '8000', 'Zürich', 'ch'),
(2, 'Owenerstreet' ,'1', '3000', 'Bern', 'ch');

INSERT INTO PROPERTY_OWNER (id, address_id, name) VALUES
(1, 2, 'PropertyOwnerName');

INSERT INTO RENTER (id, person_id) VALUES
(1, 1);

INSERT INTO PROPERTY (id, property_owner_id, address_id, renter_id) VALUES
(1, 1, 1, 1);
