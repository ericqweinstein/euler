(ns euler.three
  (:require [clojure.math.numeric-tower :as math]))

(defn factor? [x y]
  "Checks whether y is a factor of x."
  (zero? (mod x y)))

(defn factors [number]
  "Gets all the factors for a given number."
  (concat (filter #(factor? number %) (range 1 (math/floor (math/sqrt number)))) [number]))

(defn prime? [number]
  "Checks whether a number is prime."
  (= (count (factors number)) 2))

(defn problem-three [number]
  "Gets the largest prime factor
  of the number 600851475143."
  (reduce max (filter #(prime? %) (factors number))))
