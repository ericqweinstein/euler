(ns euler.three
  (:require [euler.utils :refer :all]))

(defn problem-three
  "Gets the largest prime factor
  of the number 600851475143."
  [number]
  (reduce max (filter prime? (factors number))))
