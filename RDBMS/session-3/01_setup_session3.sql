DROP TABLE IF EXISTS covid_cases;
DROP TABLE IF EXISTS covid_deaths;
DROP TABLE IF EXISTS covid_vaccines;
DROP TABLE IF EXISTS countries;
DROP TABLE IF EXISTS continents;

CREATE TABLE covid_cases (
    Country VARCHAR(50),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population BIGINT
);

CREATE TABLE covid_deaths (
    Country VARCHAR(50),
    Date DATE,
    Deaths INT
);

CREATE TABLE covid_vaccines (
    Country VARCHAR(50),
    Date DATE,
    Vaccinated_People INT,
    Total_Doses INT
);

CREATE TABLE countries (
    Country VARCHAR(50) PRIMARY KEY,
    Population BIGINT
);

CREATE TABLE continents (
    Country VARCHAR(50) PRIMARY KEY,
    Continent VARCHAR(50)
);

INSERT INTO countries (Country, Population) VALUES
('India', 1400000000),
('USA', 331000000),
('UK', 67000000),
('Brazil', 215000000),
('Germany', 83000000),
('Japan', 125000000);

INSERT INTO continents (Country, Continent) VALUES
('India', 'Asia'),
('USA', 'North America'),
('UK', 'Europe'),
('Brazil', 'South America'),
('Germany', 'Europe'),
('Japan', 'Asia');

INSERT INTO covid_cases (Country, Date, Confirmed_Cases, Deaths, Recoveries, Population) VALUES
('India', '2023-01-01', 45000000, 530000, 44400000, 1400000000),
('India', '2023-02-01', 45350000, 531000, 44650000, 1400000000),
('USA', '2023-01-01', 102000000, 1100000, 99000000, 331000000),
('USA', '2023-02-01', 103500000, 1110000, 100500000, 331000000),
('UK', '2023-01-01', 24500000, 220000, 24000000, 67000000),
('UK', '2023-02-01', 24700000, 221000, 24250000, 67000000),
('Brazil', '2023-01-01', 36000000, 690000, 35000000, 215000000),
('Brazil', '2023-02-01', 36300000, 692000, 35300000, 215000000),
('Germany', '2023-01-01', 37000000, 160000, 36500000, 83000000),
('Germany', '2023-02-01', 37200000, 161000, 36700000, 83000000),
('Japan', '2023-01-01', 32000000, 65000, 31500000, 125000000),
('Japan', '2023-02-01', 32500000, 66000, 32000000, 125000000);

INSERT INTO covid_deaths (Country, Date, Deaths) VALUES
('India', '2023-01-01', 530000),
('India', '2023-02-01', 531000),
('USA', '2023-01-01', 1100000),
('USA', '2023-02-01', 1110000),
('UK', '2023-01-01', 220000),
('UK', '2023-02-01', 221000),
('Brazil', '2023-01-01', 690000),
('Brazil', '2023-02-01', 692000),
('Germany', '2023-01-01', 160000),
('Germany', '2023-02-01', 161000),
('Japan', '2023-01-01', 65000),
('Japan', '2023-02-01', 66000);

INSERT INTO covid_vaccines (Country, Date, Vaccinated_People, Total_Doses) VALUES
('India', '2023-01-01', 950000000, 2200000000),
('India', '2023-02-01', 960000000, 2206000000),
('USA', '2023-01-01', 260000000, 660000000),
('USA', '2023-02-01', 262000000, 665000000),
('UK', '2023-01-01', 50000000, 151000000),
('UK', '2023-02-01', 50500000, 152000000),
('Germany', '2023-01-01', 65000000, 192000000),
('Germany', '2023-02-01', 65200000, 192500000),
('Japan', '2023-01-01', 100000000, 380000000),
('Japan', '2023-02-01', 101000000, 382000000);
