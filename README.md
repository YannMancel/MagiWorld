# MagiWorld
**Goal:** Develop a Java program to create an epic fight game for 2 players in a terminal frame.

**Rules:**
- The game starts with the player 1. He chooses between the personages: Warrior, Sniper or Mage.
- Then, this player chooses its characteristics: Level, Strength, Agility and Intelligence.
- After, the player 2 performs the same steps.
- The game starts really after theses steps. The player 1 begins.
- It is a game turn by turn. In each time, the player chooses between its Basic or Special attack.
- When one of players has not of vitality, the game finishes and the other player wins.

**Characteristics:** Each personage owns 5 characteristics:
1. Level: Chosen by player (min 1, max 100)
2. Vitality: Equals to 5 times the Level
3. Strength: Chosen by player (min 0, max 100)
4. Agility: Chosen by player (min 0, max 100)
5. Intelligence: Chosen by player (min 0, max 100)

Careful: The total [Strength + Agility + Intelligence] must be equal to the Level.

**Attacks:**
Les sorts : Each personage owns 2 attacks.
1. A basic attack
2. A special attack (various effects)

According to the personage type:
1. **Warrior:**
     - "Coup d'Epee": The enemy's damages are equal to the player's strength.
     - "Coup de Rage": The enemy's damages are equal to 2 times the player's strength. The payer's vitality decreases of its strength divided by 2.
2. **Sniper:**
     - "Tir a l'Arc": The enemy's damages are equal to the player's agility.
     - "Concentration": The payer's agility increases of its level divided by 2.
3. **Mage:**
     - "Boule de Feu": The enemy's damages are equal to the player's intelligence.
     - "Soin": The payer's vitality increases of 2 times its intelligence. Careful, He can not a vitality greater than its initial vitality.