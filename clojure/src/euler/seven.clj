(ns euler.seven
  (:require [euler.utils :refer [prime?]]))

(defn problem-seven
  "Finds the 10,001st prime number."
  [n]
  (nth (filter prime? (iterate inc 1)) n))
