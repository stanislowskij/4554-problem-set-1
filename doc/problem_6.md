# Problem 6 (5 points)

Problem 1.11 on p. 26 (you don’t need to say who wrote the line, but you can). Explain how you got the decryption. 

---

**1.11.** This problem deals with the affine cipher with the key parameters a = 7, b = 22.
1. Decrypt the text below:

`falszztysyjzy
jkywjrztyjztyy
naryjkyswarztyegyyj`

### Solution

Note: 1/a is 15, because 7*15 = 105 ≡ 1 mod 26.

Therefore, the decryption formula is `15 * (c - 22) mod 26`.

Convert each letter to numbers:

`5 0 11 18 25 25 19 24 18 24 9 25 24 9 10 
24 22 9 17 25 19 24 24 13 0 17 24 9 10 24 
18 22 0 17 25 19 24 4 6 24 24 9`

Apply the formula to each:

`5 8 17 18 19 19 7 4 18 4 13 19 4 13 2 4 0 13 3 19 7 4 4 21 8 3 4 13 2 4 18 0 8 3 19 7 4 16 20 4 4 13`

Convert back to letters. The decryption is:

`firstthesentenceandtheevidencesaidthequeen`