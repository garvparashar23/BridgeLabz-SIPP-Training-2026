SELECT 
    con.Continent, 
    SUM(c.Deaths) AS Total_Deaths
FROM covid_cases c
INNER JOIN continents con ON c.Country = con.Country
GROUP BY con.Continent
ORDER BY Total_Deaths DESC;
