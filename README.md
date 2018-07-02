# Lombok intro

Et java bibliotek for å redusere "boilerplate" kode


### Hvordan bruke Lombok

Lombok må ligge på classpath under kompilering. Bruker man verktøy
som Maven kan man sette scope provided så det ikke ender opp i ditt artifakt.

Lombok bruker annotasjoner for generere kode

Eksempler: Data, Getter, Setter, Builder, ToString



### Hvordan fungerer lombok

- Bruker annotation processor for å genere kode
- Bruker interne JDK klasser 
- Manipulerer Abstract Syntax Tree under kompilering
 


