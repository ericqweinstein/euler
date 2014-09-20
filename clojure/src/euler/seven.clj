(ns euler.seven)

(defn prime?
  "Leverages Java interop to check
  whether a number is prime."
  [n]
  (.isProbablePrime (BigInteger/valueOf n) 10))

(defn problem-seven
  "Finds the 10,001st prime number."
  [n]
  (nth (filter prime? (iterate inc 1)) n))
