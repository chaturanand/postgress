# postgress-boot
Postgress With Spring boot 


#Run the Server 
server.port=8082


#Expose the API
1. Get the list of Car
localhost:8082/postgressApp/carList(in Postman)

2.Create the Car (insert)
localhost:8082/postgressApp/createcar  (in Postman)

3.Update the Car
localhost:8080/postgressApp/executeUpdatecar  (in Postman)


# Script of Databse in postgress
#Create Table in postgress
CREATE TABLE car
(
  carId character varying(11) NOT NULL,
  licensePlate character varying(100) NOT NULL,
  seatCount character varying(100) DEFAULT NULL::character varying,
  covertiable character varying(100) DEFAULT NULL::character varying,
  rating character varying(100) DEFAULT NULL::character varying,
  engineType character varying(100) DEFAULT NULL::character varying,
  CONSTRAINT car_pkey PRIMARY KEY (carId)
)

# Insert Script
INSERT INTO car(
            carid, licenseplate, seatcount, covertiable, rating, enginetype)
    VALUES ('c101', 'ktm101baudha', '100', '50', '5.2', '100cc');




