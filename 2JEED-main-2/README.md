# 2JEED

Ce projet est réalisé dans le cadre du cours de Supinfo 2JEED.

## Objectif

L'objectif de ce projet est de créer une application de gestion de matchs. Il y a différentes importance dans les rôles : ADMIN, MEMBER et GUEST. 

## Consigne


#### Partie 1:
- Programmer des matchs dans une journée.
- Un match concerne deux équipes, l'une à domicile et l'autre à l'extérieur.
- Lors de la programmation d'un match, la date du match est obligatoirement dans le futur. • Seules les équipes inscrites dans une saison peuvent faire partie des matchs programmés. Récupérer la liste des matchs d'une journée.
- Modifier les horaires d'un match qui n'a pas encore débuté.

#### Partie 2:
Rajoutez Spring Security dans votre projet
- Configurez 3 utilisateurs avec des rôles ADMIN, MEMBER et GUEST Sécurisez toutes les URL sauf celle du listing de maisons
- Autorisez uniquement les ADMIN à créer les maisons
- Autorisez uniquement les MEMBER à effectuer des réservations
- Seuls les utilisateurs ADMIN devront être capables de créer des saisons
- Seuls les MEMBER-LEAGUE devront être capable de créer des journées.
- Seuls les JOURNALISTES devront être capables de programmer des matchs.

#### Partie 3:
- Un JOURNALISTE doit pouvoir spécifier le démarrage et la fin d'un match
- Un JOURNALISTE doit pouvoir commenter en direct les matchs et voir la liste de tous les commentaires d'un match.
- Un Journaliste doit pouvoir enregistrer les évènements d'un match (but et buteur, carton jaune ou rouge et le joueur concerné)
- UN MEMBER-LEAGUE doit pouvoir reporter des matchs et spécifier les raisons du report.
- Seuls les matchs qui n'ont pas démarrer peuvent être reportés.
- UN MEMBER-LEAGUE doit pouvoir suspendre un match pour des raison météorologique également.
- Seuls les matchs qui ont démarrés peuvent être suspendus.

## Installation & Lancenment

## Auteurs :

- [Paul Mareschi](https://github.com/Paul-Mrsch)
- [Elvira Kuissu](https://github.com/Elvi-2202)
- [Yani Tahrat](https://github.com/IMPACT750)
