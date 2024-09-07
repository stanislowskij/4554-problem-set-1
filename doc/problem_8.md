# Problem 8 (5 points)

Problem 1.14 on p. 27.

---

**1.14.** An obvious approach to increase the security of a symmetric algorithm is to apply the same cipher twice, i.e.: $y = e_{k2}(e_{k1}(x))$

As is often the case in cryptography, things are very tricky and results are often different from the expected and/ or desired ones. In this problem we show that a double encryption with the affine cipher is only as secure as single encryption! Assume two affine ciphers $e_{k1} = a_1x+b_1$ and $e_{k2} = a_2x+b_2$.
1. Show that there is a single affine cipher $e_{k3} = a_3x + b_3$ which performs exactly
the same encryption (and decryption) as the combination $e_{k2}(e_{k1}(x))$.
2. Find the values for $a_3$, $b_3$ when $a_1 = 3$, $b_1 = 5$ and $a_2 = 11$, $b_2 = 7$.
3. For verification: (1) encrypt the letter K first with $e_{k1}$ and the result with $e_{k2}$, and (2) encrypt the letter K with $e_{k3}$.
4. Briefly describe what happens if an exhaustive key-search attack is applied to a double-encrypted affine ciphertext. Is the effective key space increased?

### Solution

