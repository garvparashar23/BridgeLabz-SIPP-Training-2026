SELECT 
    Country, 
    MAX(Confirmed_Cases) AS Max_Confirmed_Cases, 
    Population, 
    (MAX(Confirmed_Cases) * 100.0) / Population AS Infection_Rate
FROM covid_cases
GROUP BY Country, Population
ORDER BY Infection_Rate DESC;
