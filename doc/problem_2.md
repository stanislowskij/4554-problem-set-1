# Problem 2 (5 points)

Problem 1.4 on p. 25. 

7-bit characters here mean that any possible combination of 7 bits is a valid character (this would include digits and symbols). In question 3 only 26 letters of the alphabet can be used, so fewer than 7 bits are needed to uniquely encode a letter.

---

**1.4.** We now consider the relation between passwords and key size. For this purpose we consider a cryptosystem where the user enters a key in the form of a password.
1. Assume a password consisting of 8 letters, where each letter is encoded by the ASCII scheme (7 bits per character, i.e., 128 possible characters). What is the size of the key space which can be constructed by such passwords?
2. What is the corresponding key length in bits?
3. Assume that most users use only the 26 lowercase letters from the alphabet instead of the full 7 bits of the ASCII-encoding. What is the corresponding key length in bits in this case?
4. At least how many characters are required for a password in order to generate a key length of 128 bits in case of letters consisting of
    - 7-bit characters?
    - 26 lowercase letters from the alphabet?
  
### Solution

1. The number of possible keys generated in this manner, or the size of the key space, is 128^8, or about 72057600000000000 (7.2 x 10^16).
2. The key length in bits of an 8-letter key is 7*8 = 56 bits.
3. If most users use only the 26 lowercase letters from the alphabet, there are only 26 combinations for each letter, rather than 128. So, only 2^5 (or 32) bits are needed to encode a letter. The key length in bits, then, is 5*8 = 40 bits.
4. To generate a key length of 128 bits using:
    - 7 bits, requires at least 19 characters.
    - 26 lowercase letters, requires at least 26 characters.