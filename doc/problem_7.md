# Problem 7 (4 points)

How many possible keys for Affine cipher exist for the following alphabets?
- Italian: 21 letters
- Russian: 33 letters
  
Please explain your answers.

### Solution

The number of possible keys for an alphabet of x letters is given by m*x, where m is the number of possible values for a; i.e., the numbers with a multiplicative inverse in $\mathbb{Z}_x$.

Italian has x = 21. The numbers in $\mathbb{Z}_{21}$ without a muliplicative inverse are `{0, 3, 6, 7, 9, 12, 14, 18}`, so there are 21-8 = 13 possible values for a. Therefore, Italian has 13*21 = **273** possible keys for the Affine cipher.

Russian has x = 33. The numbers in $\mathbb{Z}_{33}$ without a muliplicative inverse are `{0, 3, 6, 9, 11, 12, 15, 18, 21, 22, 24, 27, 30}`, so there are 33-13 = 20 possible values for a. Therefore, Russian has 20*33 = **660** possible keys for the Affine cipher.