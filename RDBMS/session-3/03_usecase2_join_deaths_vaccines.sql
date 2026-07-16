SELECT 
    d.Country, 
    d.Date, 
    d.Deaths, 
    COALESCE(v.Vaccinated_People, 0) AS Vaccinated_People, 
    COALESCE(v.Total_Doses, 0) AS Total_Doses
FROM covid_deaths d
LEFT JOIN covid_vaccines v ON d.Country = v.Country AND d.Date = v.Date
ORDER BY d.Country, d.Date;
