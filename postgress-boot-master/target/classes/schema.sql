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