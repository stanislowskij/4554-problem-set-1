# Problem 1 breaking ciphers (6 points)

Exercises 1.1, 1.2 on p. 24. You don't need to answer question 3 in 1.1 and question 2 in 1.2. You may want to write a program to compute letter frequencies, it will also be useful for the lab (or you may want to wait until the lab and then come back to this problem). 

Explain how you obtained the decryption.  

---

**1.1.** The ciphertext below was encrypted using a substitution cipher. Decrypt the ciphertext without knowledge of the key.

```
    lrvmnir bpr sumvbwvr jx bpr lmiwv yjeryrkbi jx qmbm wi
bpr xjvni mkd ymibrut jx irhx wi bpr riirkvr jx
ymbinlmtmipw utn qmumbr dj w ipmhh but bj rhnvwdmbr bpr
yjeryrkbi jx bpr qmbm mvvjudwko bj yt wkbrusurbmbwjk
lmird jk xjubt trmui jx ibndt

    wb wi kjb mk rmit bmiq bj rashmwk rmvp yjeryrkb mkd wbi
iwokwxwvmkvr mkd ijyr ynib urymwk nkrashmwkrd bj ower m
vjyshrbr rashmkmbwjk jkr cjnhd pmer bj lr fnmhwxwrd mkd
wkiswurd bj invp mk rabrkb bpmb pr vjnhd urmvp bpr ibmbr
jx rkhwopbrkrd ywkd vmsmlhr jx urvjokwgwko ijnkdhrii
ijnkd mkd ipmsrhrii ipmsr w dj kjb drry ytirhx bpr xwkmh
mnbpjuwbt lnb yt rasruwrkvr cwbp qmbm pmi hrxb kj djnlb
bpmb bpr xjhhjcwko wi bpr sujsru msshwvmbwjk mkd
wkbrusurbmbwjk w jxxru yt bprjuwri wk bpr pjsr bpmb bpr
riirkvr jx jqwkmcmk qmumbr cwhh urymwk wkbmvb
```

1. Compute the relative frequency of all letters A...Z in the ciphertext. You may
want to use a tool such as the open-source program CrypTool [50] for this task.
However, a paper and pencil approach is also still doable.
2. Decrypt the ciphertext with the help of the relative letter frequency of the English
language (see Table 1.1 in Sect. 1.2.2). Note that the text is relatively short and
that the letter frequencies in it might not perfectly align with that of general
English language from the table.

### Solution

The code for frequency analysis is in the [Util.java](/src/Util.java) file.

Calling the method frequencyAnalysis() on the ciphertext above outputs:

`[r=13.00%, b=10.53%, m=9.60%, k=7.59%, j=7.43%, w=7.28%, i=6.35%, p=4.64%, u=3.72%, d=3.56%, h=3.56%, v=3.41%, x=3.10%, y=2.94%, n=2.63%, s=2.63%, t=2.01%, l=1.24%, o=1.08%, q=1.08%, a=0.77%, c=0.77%, e=0.77%, f=0.15%, g=0.15%]`

Assuming these frequencies align with those of the English alphabet, we can say that `e -> r` and `t -> b`.

There are multiple occurrences of "`bpr`" in the text, so `h -> p`.

I then made a method to map a substitution alphabet to the English alphabet and decode an input string, defaulting to '?' if the key for that letter is unknown. The decoded text, so far, looks like:

`?e????e the ????t??e ?? the ????? ???e?e?t? ?? ??t? ...`

From here I found more words. `a -> m`, `c -> v`, `i -> w`, `s -> i`. Then the first few words became clear: 

`"because the practice of the basic ..."`

For the cipher itself, I got as far as decoding the key to be `mlvdrxopwXqhyvjsXuibnecatX`, where X are unknowns.

The decrypted text:

```
because the practice of the basic movements of kata is
the focus and mastery of self is the essence of
matsubayashi ryu karate do i shall try to elucidate the
movements of the kata according to my interpretation
based on forty years of study

it is not an easy task to explain each movement and its
significance and some must remain unexplained to give a
complete explanation one would have to be qualified and
inspired to such an extent that he could reach the state
of enlightened mind capable of recognizing soundless
sound and shapeless shape i do not deem myself the final
authority but my experience with kata has left no doubt
that the following is the proper application and
interpretation i offer my theories in the hope that the
essence of okinawan karate will remain intact
```

------

**1.2.** We received the following ciphertext which was encoded with a shift cipher: `xultpaajcxitltlxaarpjhtiwtgxktghidhipxciwtvgtpilpit ghlxiwiwtxgqadds`. 1. Perform an attack against the cipher based on a letter frequency count: How many letters do you have to identify through a frequency count to recover the key? What is the cleartext?

### Solution

The frequency analysis method from earlier shows that the most commonly-occurring letter in the string is T, followed by I. 

`[t=14.93%, i=13.43%, x=10.45%, a=7.46%, g=7.46%, l=7.46%, p=7.46%, h=5.97%, w=5.97%, d=4.48%, c=2.99%, j=2.99%, k=1.49%, q=1.49%, r=1.49%, s=1.49%, u=1.49%, v=1.49%]`

T is the only letter that needs to be identified. If T is 19, and it is the encoding of E, which is 4, then the shift is 15. Putting this into the decryption method from earlier, the plaintext is:

`ifweallunitewewillcausetheriverstostainthegreatwaterswiththeirblood`


