# TP n°10 – Gestion des fichiers en Java

Ce TP contient **3 problèmes** à résoudre en Java, chacun utilisant la lecture/écriture de fichiers. Chaque programme lit depuis un fichier `.in` et écrit la sortie dans un fichier `.out`.

---

## ✅ Problème A – Nombres opposés

### 🧠 Énoncé  
Étant donné un tableau d'entiers non nuls, trouvez combien il y a d'entiers distincts **positifs** dont **l'opposé négatif** est aussi présent dans le tableau.

### 📥 Entrée
- La première ligne contient un entier **N** (taille du tableau), où `1 ≤ N ≤ 20000`.
- La deuxième ligne contient **N** entiers `X` séparés par des espaces (`-10^8 < X < 10^8` et `X ≠ 0`).

### 📤 Sortie
- Un entier représentant le nombre d'entiers distincts **positifs X** tels que **-X** est aussi dans le tableau.

### 💡 Exemple

**Entrée (`in`)** :15 -3 4 2 8 9 1 -3 -8 -4 2 8 2 -8 1 3

**Sortie (`out`)** :3 

---

## ✅ Problème B – Binary Addition

### 🧠 Énoncé  
Effectuer des additions binaires comme on le fait avec les nombres décimaux, en tenant compte des reports de bits (carry bits).

### 📥 Entrée
- La première ligne contient un entier **N** (`1 ≤ N ≤ 1000`) : le nombre de calculs à effectuer.
- Suivent N lignes, chacune contenant **deux nombres binaires** de longueur ≤ 80 bits.

### 📤 Sortie
- Pour chaque opération, afficher le **numéro du calcul** suivi du résultat de l'addition binaire (sans zéros inutiles).

### 💡 Exemple

**Entrée (`bin.in`)** :3 1001101 10010 1001001 11001 1000111 1010110

**Sortie (`bin.out`)** :1 1011111 2 1100010 3 10011101


---

## ✅ Problème C – Good Triangle

### 🧠 Énoncé  
Le k-ème nombre triangulaire est défini par `T(k) = 1 + 2 + ... + k`.  
On cherche ici à calculer la somme pondérée suivante :W(n) = ∑ [k=1..n] k × T(k+1)

où `T(k+1)` est le nombre triangulaire de rang `k+1`.

### 📥 Entrée
- La première ligne contient un entier **N** (nombre de jeux de test), où `1 ≤ N ≤ 1000`.
- Suivent N lignes, chacune contenant un entier **n** (`1 ≤ n ≤ 300`).

### 📤 Sortie
- Pour chaque dataset, afficher sur une ligne :i n W(n)
 où `i` est le numéro du jeu de test (commençant à 1), `n` est l'entrée, et `W(n)` est la somme pondérée calculée.

### 💡 Exemple

**Entrée (`good.in`)** :4 3 4 5 10

**Sortie (`good.out`)** :1 3 45 2 4 105 3 5 210 4 10 2145

---

## 🧰 Fichiers attendus

| Problème       | Fichier source         | Fichier d'entrée | Fichier de sortie |
|----------------|------------------------|------------------|-------------------|
| Nombres opposés| `OpposedNumbers.java`  | `oppose.in`      | `oppose.out`      |
| Addition binaire| `BinaryAddition.java` | `bin.in`         | `bin.out`         |
| Good triangle  | `GoodTriangle.java`    | `good.in`        | `good.out`        |

---








