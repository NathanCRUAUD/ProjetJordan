# Code
1. **Creer un nouveau projet libGDX avec l'outil**  
![image](https://user-images.githubusercontent.com/43410740/110183211-ac486680-7e0e-11eb-9734-674cfa1a2fce.png)
2. **Vérifier que le projet s'ouvre correctement dans Eclipse: file/import/Gradle/Existing Gradle Project, Next, Selection, Finish**  
*Pour le premier lancement, ouvrir: Projet\desktop\src\com\mygdx\game\desktop\DesktopLauncher.java puis "Run as" -> "Java Application"*
3. **Ouvrir ce projet et supprimer les dossiers core et desktop**
*Ces dossiers semblent être les seuls suceptibles d'être modifiés, ils sont donc les seuls synchonisés via GitHub*
4. **Cloner le projet Git Hub en local**  
*Le projet ne contient que du code Java.*  
![image](https://user-images.githubusercontent.com/43410740/110183387-09441c80-7e0f-11eb-995d-2fa60e4c3c59.png)
*Cela va creer un second dossier "ProjetJordan" avec tout le projet GitHub dedans: .git, core, desktop, REAMDME et un fichier gitignore.*  
5. **Ouvrir ce dossier git (ProjetJordan), couper tous les éléments à l'intérieur puis les coller dans le projet libGDX**
*Le projet libGDX devrait aussi s'appeler "ProjetJordan" et devrait être situé un dossier plus haut dans la hiérarchie*  
*Penser à supprimer le dossier git "ProjetJordan" qui devrait maintenant être vide*
6. **Récurer sur le Drive le dossier "assets" (dans "To import") et le placer dans le dossier ProjetJordan/core en local**   
7. **Changer l'acces au jdbc: "clique droit sur core"/Build path/Configure build path, cliquer sur "Project and external dependencies" puis sur "add external jars" enfin selectionner le jdbc**  
# Base de données
1. **Lancer phpMyAdmin**  
2. **Creer une base de données "game_db" en "utf8_general_ci"**  
3. **Selectionner "game_db"**  
4. **Selectionner l'onglet "SQL"**  
5. **Executer le contenu du fichier "game_db.sql" sur le Drive**  
*"Base de données/game_db.sql"*

