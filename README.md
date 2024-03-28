# Roman Numerals Kata

For this Kata, write a function to convert from normal (Arabic) numbers to Roman Numerals:  
1 -> I  
10 -> X  
7 -> VII  
etc.  
There is no need to be able to convert numbers larger than about 3000.

## Background information

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

## Additional Rules

- A number written in Arabic numerals can be broken into digits.
  For example, 1903 is composed of 1 (one thousand), 9 (nine hundreds), 0 (zero tens), and 3 (three units).
  To write the Roman numeral, each of the non-zero digits should be treated separately.
  In the above example, 1,000 = M, 900 = CM, and 3 = III. Therefore, 1903 = MCMIII.
- The symbols “I”, “X”, “C”, and “M” can be repeated three times in succession, but no more.
  (They may appear more than three times if they appear non-sequentially, such as XXXIX.)
  “D”, “L”, and “V” can never be repeated.
- “I” can be subtracted from “V” and “X” only. “X” can be subtracted from “L” and “C” only.
  “C” can be subtracted from “D” and “M” only. “V”, “L”, and “D” can never be subtracted.
- Only one small-value symbol may be subtracted from any large-value symbol.
