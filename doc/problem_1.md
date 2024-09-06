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