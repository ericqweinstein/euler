(ns euler.three
  (:require [clojure.math.numeric-tower :as math]))

(defn factor?
  "Checks whether y is a factor of x."
  [x y]
  (zero? (mod x y)))

(defn factors
  "Gets all the factors for a given number."
  [number]
  (concat (filter #(factor? number %) (range 1 (math/floor (math/sqrt number)))) [number]))

(defn prime?
  "Checks whether a number is prime."
  [number]
  (= (count (factors number)) 2))

(defn problem-three
  "Gets the largest prime factor
  of the number 600851475143."
  [number]
  (reduce max (filter prime? (factors number))))
