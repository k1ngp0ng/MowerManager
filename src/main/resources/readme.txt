###
Pour lancer le cas de test de l'exo : MowerSessionTest#launch_xebia_test_case

Plusieurs partis pris sur cet exo :
- projet sous maven
- pas de repo github ou equivalent car quelques pbs d'accès internet sur la période en question
- toutes les exceptions sont des runtime, je trouve cela plus propre au niveau des signatures de méthodes
- pas de lib externes hormis pour les tests, pas de log, juste de System.out.println pour rester le plus simple possible.
- le launcher se fait via un test : MowerSessionTest#launch_xebia_test_case, plus fluide à mettre en place qu'un système de lecture et de parsing de fichier
mais moins pratique pour ajouter en masse des tondeuses
- l'approche est orientée DDD, pas de packages car peu de classes crées.
- commentaires en français plus plus de lisibilité mais messages d'erreur et code en anglais
