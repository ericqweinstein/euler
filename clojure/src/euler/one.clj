(ns euler.one)

(defn problem-one [n]
  "Adds all the natural numbers below
  1000 that are multiples of 3 or 5."
  (reduce + (filter #(or (zero? (rem % 3)) (zero? (rem % 5))) (range n))))
