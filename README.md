# TP 20 – Architecture Micro-services avec RestTemplate

## Présentation du projet

Ce TP a pour objectif de comprendre et de mettre en œuvre une architecture basée sur les microservices avec Spring Boot. Il consiste à développer plusieurs services indépendants et à assurer leur communication à travers des API REST en utilisant `RestTemplate`.

## Objectifs

- Comprendre les principes fondamentaux d'une architecture microservices.
- Développer des microservices indépendants avec Spring Boot.
- Exposer des fonctionnalités à travers des API REST.
- Utiliser RestTemplate pour effectuer des appels HTTP entre microservices.
- Comprendre les échanges de données entre les services.
- Tester et valider la communication interservices.

## Technologies utilisées

- Java
- Spring Boot
- Spring Web
- RestTemplate
- REST API
- Maven
- JSON

## Architecture du projet

L'application repose sur plusieurs microservices qui communiquent entre eux à travers des requêtes HTTP.

- **Microservice principal :** expose les fonctionnalités métier et reçoit les requêtes des clients.
- **Microservice distant :** fournit des données ou des fonctionnalités à d'autres services.
- **RestTemplate :** permet d'effectuer des appels REST vers les différents endpoints des microservices.

## Fonctionnement

La communication entre les microservices suit les étapes suivantes :

1. Le client envoie une requête au microservice principal.
2. Le service principal traite la demande.
3. RestTemplate permet d'envoyer une requête HTTP vers un autre microservice.
4. Le microservice distant traite la requête et retourne une réponse.
5. Le service principal récupère les données et retourne le résultat au client.

## Mise en œuvre

Les principales étapes de réalisation sont :

1. Création des projets Spring Boot.
2. Développement des endpoints REST.
3. Configuration de RestTemplate comme composant Spring.
4. Utilisation des méthodes HTTP (`GET`, `POST`, `PUT`, `DELETE`) pour communiquer entre les services, selon les besoins.
5. Gestion des réponses et des échanges de données JSON.
6. Test des communications entre les microservices.

## Conclusion

Ce TP permet de découvrir la communication synchrone entre microservices à l'aide de RestTemplate et de comprendre comment des applications indépendantes peuvent échanger des données via des API REST dans un environnement Spring Boot.
