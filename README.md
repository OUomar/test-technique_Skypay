# Bank Kata - Technical Test

## Description  
Ce projet implémente une simple application bancaire en utilisant une approche TDD (Test-Driven Development). L'application permet d'effectuer des dépôts, des retraits et d'afficher un relevé bancaire au format spécifié.

## Fonctionnalités  
- Dépôt d'argent sur un compte bancaire  
- Retrait d'argent du compte  
- Affichage du relevé bancaire trié par date  

## Interface Publique  
L'application suit l'interface suivante :  
```java
public interface AccountService {
    void deposit(int amount);
    void withdraw(int amount);
    void printStatement();
}
## Exigences du test d'acceptation

Scénario :
- Dépôt de 1000 le 10-01-2012
- Dépôt de 2000 le 13-01-2012
- Retrait de 500 le 14-01-2012
- Affichage du relevé bancaire

## Technologies utilisées

- Java
- JUnit (pour les tests)

## Exécution du projet
Pour exécuter le projet, compilez et lancez la classe AccountTest.

