(ns euler.ten
  (:require [euler.utils :refer [prime?]]))

(defn problem-ten
  "Finds the sum of all prime
  numbers below two million."
  [limit]
  (reduce + (filter prime? (range 2 limit))))
