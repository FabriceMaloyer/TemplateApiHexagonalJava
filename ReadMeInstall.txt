Si tu veux faire un projet spring passe par ce site et config ce dont tu as besoin

https://start.spring.io/
Pour ce projet typiquement tu vas avoir besoin de :
Spring Web
Spring Data JPA

Il va falloir que tu telecharge Maven et que tu le mette dans ton PATH (maven/bin)
Il va aussi falloir que tu telecharge ta version de java et que tu la mette dans ton path (la version/bin)
Il va aussi falloir que tu setup ton java_home dans les variable (cette fois ci pas dans le PATH mais dans ta new variable JAVA_HOME) ce sera juste le dossier java sur cce coup

Lors de la creation du projet via spring init du vas pouvoir créer 3 dossier dans le dossier ou se trouve la class javaAPi application (c'est comme le program.cs)
Si ils ne sont pas dedans spring ne gerera pas la DI

Hibernate va te generer par lui meme tes tables si elles n'existent pas

pour les requetes passe par POSTman : http://localhost:9000/api/getuser/"jeanjean"
                                    - http://localhost:9000/api/createuser avec en body
                                    {
                                        "userName": "jeancu",
                                        "email": "john.doe@example.com"
                                    }

