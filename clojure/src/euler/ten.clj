(ns euler.ten)

(defn prime? [n]
  "Leverages Java interop to check
  whether a number is prime."
  (.isProbablePrime (BigInteger/valueOf n) 10))

(defn problem-ten [limit]
  "Finds the sum of all prime
  numbers below two million."
  (reduce + (filter prime? (range 2 limit))))
