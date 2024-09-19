# Java Gruppenaufgaben - Anfänger bis Fortgeschrittene

## Leicht (Anfänger)

### 1. Aufgabe: Errate die Zahl

**Beschreibung:**
Erstelle ein Programm, bei dem der Computer eine zufällige Zahl zwischen 1 und 100 wählt und der Benutzer versuchen muss, diese Zahl zu erraten. Das Programm soll dem Benutzer nach jedem Versuch sagen, ob die Zahl zu hoch oder zu niedrig ist. Das Spiel endet, wenn der Benutzer die richtige Zahl errät.

**Tipps:**
- Verwende die Klasse `Random`, um eine Zufallszahl zu erzeugen.

```java
Random random = new Random();
int zahl = random.nextInt(100) + 1;  // Zufallszahl zwischen 1 und 100
```

- Um eine Benutzereingabe zu erhalten, nutze die Klasse `Scanner`.
```java
Scanner scanner = new Scanner(System.in);
int benutzereingabe = scanner.nextInt();  // Benutzer gibt eine Zahl ein
```
- Verwende eine `while`-Schleife, um den Benutzer immer wieder raten zu lassen, bis die Zahl erraten wird.
- Gib dem Benutzer nach jedem Versuch Feedback, ob seine Zahl zu hoch oder zu niedrig ist.

**Erweiterungen:**
- Zähle, wie viele Versuche der Benutzer benötigt hat.
- Füge eine Option hinzu, das Spiel neu zu starten.

---

### 2. Aufgabe: Taschenrechner

**Beschreibung:**
Schreibe ein Programm, das als einfacher Taschenrechner fungiert. Der Benutzer gibt zwei Zahlen ein und wählt eine Operation (Addition, Subtraktion, Multiplikation, Division). Das Programm führt die Berechnung aus und zeigt das Ergebnis an. Der Benutzer kann wiederholt Berechnungen durchführen, bis er sich entscheidet, das Programm zu beenden.

**Tipps:**
- Nutze die `Scanner`-Klasse, um die Eingaben des Benutzers zu lesen.
```java
double zahl1 = scanner.nextDouble();
double zahl2 = scanner.nextDouble();
char operation = scanner.next().charAt(0);  // Liest das erste Zeichen für die Operation
```
- Verwende eine `switch`-Anweisung, um zwischen den vier Operationen zu unterscheiden.
```java
switch (operation) {
    case '+':
        // Addition
        break;
    case '-':
        // Subtraktion
        break;
    // Weitere Fälle für Multiplikation und Division
}
```
- Achte darauf, eine Division durch Null zu verhindern.

**Erweiterungen:**
- Erlaube dem Benutzer, Wurzeln und Potenzen zu berechnen.
- Füge eine Möglichkeit hinzu, die letzte Berechnung zu speichern und erneut zu verwenden.

---

## Mittel (Fortgeschrittene Anfänger)

### 1. Aufgabe: Palindrom-Prüfer

**Beschreibung:**
Schreibe ein Programm, das überprüft, ob ein vom Benutzer eingegebenes Wort oder ein Satz ein Palindrom ist (also vorwärts und rückwärts gelesen gleich ist). Beachte dabei, dass Groß- und Kleinschreibung sowie Leerzeichen ignoriert werden.

**Tipps:**
- Verwende die Methode `.replaceAll()`, um Leerzeichen und Sonderzeichen zu entfernen.
```java
String gereinigt = eingabe.replaceAll("[^a-zA-Z]", "").toLowerCase();
```

- Nutze die Klasse `StringBuilder`, um den String umzukehren.
```java
String umgekehrt = new StringBuilder(gereinigt).reverse().toString();
```
- Vergleiche den gereinigten Eingabestring mit der umgekehrten Version.

**Erweiterungen:**
- Lass das Programm auch längere Sätze überprüfen, wie zum Beispiel „Eine Horde bedrohe nie!“.
- Zeige bei Nicht-Palindromen den Grund an (z.B. „Die Zeichenfolge passt nicht“).

---

### 2. Aufgabe: Wortzähler

**Beschreibung:**
Erstelle ein Programm, das die Häufigkeit jedes Wortes in einem vom Benutzer eingegebenen Text zählt. Das Programm soll eine Liste aller Wörter und deren Häufigkeiten ausgeben.

**Tipps:**
- Teile den eingegebenen Text in Wörter auf, indem du die Methode `.split()` verwendest.
```java
String[] woerter = text.split("\\s+");  // Teilt den Text in Wörter anhand von Leerzeichen
```
- Verwende eine `HashMap`, um die Wörter als Schlüssel und ihre Häufigkeiten als Werte zu speichern.
```java
HashMap<String, Integer> wortHaeufigkeit = new HashMap<>();
if (wortHaeufigkeit.containsKey(wort)) {
    wortHaeufigkeit.put(wort, wortHaeufigkeit.get(wort) + 1);
} else {
    wortHaeufigkeit.put(wort, 1);
}
```
- Denke daran, dass Groß- und Kleinschreibung ignoriert werden soll, indem du alle Wörter in Kleinbuchstaben umwandelst.

**Erweiterungen:**
- Zeige nur die häufigsten Wörter an (z.B. die Top 3).
- Erstelle eine Option, die Worte alphabetisch zu sortieren.

---

## Schwer (Fortgeschrittene)

### 1. Aufgabe: Tic-Tac-Toe

**Beschreibung:**
Schreibe ein Tic-Tac-Toe-Spiel für zwei Spieler. Jeder Spieler setzt abwechselnd ein X oder O auf ein 3x3 Spielfeld. Das Spiel endet, wenn einer der Spieler drei gleiche Symbole in einer Reihe, Spalte oder Diagonale hat. Alternativ endet es mit einem Unentschieden, wenn das Spielfeld voll ist.

**Tipps:**
- Verwende ein zweidimensionales Array, um das Spielfeld zu speichern.
```java
char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
```
- Erstelle eine Methode, um das Spielfeld nach jedem Zug anzuzeigen.
```java
public static void printBoard() {
    // Code, um das Spielfeld schön darzustellen
}
```
- Überprüfe, ob einer der Spieler gewonnen hat, indem du alle Reihen, Spalten und Diagonalen kontrollierst.

**Erweiterungen:**
- Füge eine einfache KI hinzu, die gegen den Benutzer spielt.
- Erlaube es den Spielern, den Schwierigkeitsgrad zu wählen (z.B. zufällige Züge oder eine Strategie, um den Sieg zu verhindern).

---

### 2. Aufgabe: Bankkonto-Simulation

**Beschreibung:**
Schreibe ein Programm, das eine einfache Bankkonto-Simulation durchführt. Ein Kunde soll Geld auf sein Konto einzahlen und abheben können. Es soll auch die Möglichkeit geben, das aktuelle Saldo anzuzeigen. Implementiere dafür die Klassen `Bankkonto` und `Kunde`.

**Tipps:**
- Erstelle eine `Bankkonto`-Klasse mit Attributen für das Kontosaldo.
```java
class Bankkonto {
    private double saldo;
    
    public Bankkonto(double anfangssaldo) {
        this.saldo = anfangssaldo;
    }
    
    public void einzahlen(double betrag) {
        // Code zum Einzahlen
    }
    
    public void abheben(double betrag) {
        // Code zum Abheben
    }
    
    public double getSaldo() {
        return saldo;
    }
}
```
- Erstelle Methoden zum Einzahlen und Abheben und achte darauf, dass der Benutzer nicht mehr abheben kann, als auf dem Konto ist.
- Die Klasse `Kunde` kann einfach sein und muss nur das Bankkonto verwalten.

**Erweiterungen:**
- Simuliere mehrere Bankkonten pro Kunde und ermögliche Überweisungen zwischen den Konten.
- Implementiere eine Verzinsung für das Guthaben.
