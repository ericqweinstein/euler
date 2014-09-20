(ns euler.ten)

(defn prime?
  "Leverages Java interop to check
  whether a number is prime."
  [n]
  (.isProbablePrime (BigInteger/valueOf n) 10))

(defn problem-ten
  "Finds the sum of all prime
  numbers below two million."
  [limit]
  (reduce + (filter prime? (range 2 limit))))
