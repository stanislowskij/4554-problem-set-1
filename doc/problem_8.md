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

1. Note that the encryption algorithm $e_{k2}(e_{k1}(x)) = a_2(a_1x+b_1)+b_2$. Expanding this produces $a_2a_1x + a_2b_1 + b_2$. Let $a_3 = a_2a_1$ and let $b_3 = a_2b_1 + b_2$. Then $e_{k3} = a_3x + b_3 = e_{k2}(e_{k1}(x))$, so the double encryption is equivalent to a single encryption. 

    Also, note that $a_3$ is always a valid key, since, in integer ring $\mathbb{Z}_k$, $\text{gcd}(a_1, k) > 1 \space \wedge \text{gcd}(a_2, k) > 1 \implies \text{gcd}(a_1a_2, k) > 1$. 
    
    (This is hand-wavy and I don't have a concrete proof for this, but I'm sure it's a safe assumption to make. I don't want to spend more time on this than I already have.)

2. Recall that $a_3 = a_2a_1$ and $b_3 = a_2b_1 + b_2$. Setting $a_1 = 3$, $b_1 = 5$, $a_2 = 11$, $b_2 = 7$, we have that:
   
    $a_3 = a_2a_1 = 11*3 = 33 \equiv 7 \space\text{mod}\space 26$

    $b_3 = a_2b_1 + b_2 = 11*5 + 7 = 62 \equiv 10 \space\text{mod}\space 26$

3. To verify by example (note that K converts to 10):

    $e_{k1}(10) = a_1(10) + b_1 = 3(10) + 5 = 35 \equiv 9 \space \text{mod} \space 26$

    $e_{k2}(9) = a_2(9) + b_2 = 11(9) + 7 = 106 \equiv 2 \space \text{mod} \space 26$

    is equivalent to:

    $e_{k3}(10) = a_3(10) + b_3 = 7(10) + 10 = 80 \equiv 2 \space \text{mod} \space 26$

4. The effective key space is not increased. Since any double-encryption affine equation is equivalent to some single-encryption in the same integer ring, and all possible keys in the key space are shared between both integer rings, it doesn't make any sense to say that the key space increases or decreases. The effect of an exhaustive key-search attack on a double-encryption is thus equivalent to that of a single-encryption.