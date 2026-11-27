| uthyrningsnummer | datum      | kunduppgifter                            | filmtitel   | speltid |
|------------------|------------|------------------------------------------|-------------|---------|
| 101              | 2026-11-01 | Anna Berg, anna@example.com, 070-1111111 | Stjärnresan | 119 min |
| 102              | 2026-11-02 | Erik Lind, erik@example.com, 070-2222222 | Månjakten   | 99 min  |
| 103              | 2026-11-05 | Anna Berg, anna@example.com, 070-1111111 | Månjakten   | 99 min  |

# Steg 1

Jag börjar med att dela upp kunduppgifterna så att dem får var sin kolumn. Det är mer optimalt att ha varje information
i sin egna kolumn.

| uthyrningsnummer | datum      | förnamn | efternamn | email            | telefonnummer | filmtitel   | speltid |
|------------------|------------|---------|-----------|------------------|---------------|-------------|---------|
| 101              | 2026-11-01 | Anna    | Berg      | anna@example.com | 070-1111111   | Stjärnresan | 119 min |
| 102              | 2026-11-02 | Erik    | Lind      | erik@example.com | 070-2222222   | Månjakten   | 99 min  |
| 103              | 2026-11-05 | Anna    | Berg      | anna@example.com | 070-1111111   | Månjakten   | 99 min  |

# Steg 2

Jag började med att dela upp kunden i en egen tabell, eftersom personen har flera attribut så var det lämpligt att skapa
en egen tabell och dessutom är det bättre för att undvika att återanvända samma persondata flera gånger. Person id:t får
också vara en primär nyckel så att vi kan koppla id:t till uthyrnings-tabellen. (Person id:t är automatiskt genererat)

| personid (PK) | förnamn | efternamn | email            | telefonnummer |
|---------------|---------|-----------|------------------|---------------|
| 1             | Anna    | Berg      | anna@example.com | 070-1111111   |
| 2             | Erik    | Lind      | erik@example.com | 070-2222222   |

## Resultat

| uthyrningsnummer | datum      | personid | filmtitel   | speltid |
|------------------|------------|----------|-------------|---------|
| 101              | 2026-11-01 | 1        | Stjärnresan | 119 min |
| 102              | 2026-11-02 | 2        | Månjakten   | 99 min  |
| 103              | 2026-11-05 | 1        | Månjakten   | 99 min  |

Sedan skapade jag även en tabell för filmen, eftersom den innehöll flera attribut och då slipper vi återanvända
filmdatan flera gånger. I framtiden kanske man vill lägga till mer information, kanske en trailer, poster, pris, osv.
Därför blir det också lättare att lägga till det i en egen tabell. Film id:t får vara en primär nyckel så att vi kan
koppla id:t till uthyrnings-tabellen. (Film id:t är automatiskt genererat)

| filmid (PK) | filmtitel   | speltid |
|-------------|-------------|---------|
| 1           | Stjärnresan | 119 min |
| 2           | Månjakten   | 99 min  |

Till sist uppdaterade jag start tabellen, så att den innehöll kund id och film id för att koppla till respektive
tabeller. Där kund id:t och film id:t båda är främmande nycklar, så att vi kan koppla dem till respektive tabell.

- personid (FK) refererar till personid (PK) i persontabellen.
- filmid (FK) refererar till filmid (PK) i filmtabellen.

### Resultat

| uthyrningsnummer (PK) | datum      | personid (FK) | filmid (FK) |
|-----------------------|------------|---------------|-------------|
| 101                   | 2026-11-01 | 1             | 1           | 
| 102                   | 2026-11-02 | 2             | 2           | 
| 103                   | 2026-11-05 | 1             | 2           | 

# Relationer

### Person och uthyrning

Relationen mellan person och uthyrning är en-till-många, eftersom en person kan ha flera uthyrningar, medan en uthyrning
bara kan ha en person.

### Film till uthyrning

Relationen mellan film och uthyrning är en-till-många, eftersom en film kan finnas i flera uthyrningar, medan en
uthyrning
bara kan innehålla en film.