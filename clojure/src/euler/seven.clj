(ns euler.seven)

(defn prime? [n]
  "Leverages Java interop to check
  whether a number is prime."
  (.isProbablePrime (BigInteger/valueOf n) 10))

(defn problem-seven [n]
  "Finds the 10,001st prime number."
  (nth (filter prime? (iterate inc 1)) n))
