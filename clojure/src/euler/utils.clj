(ns euler.utils
  (:require [clojure.math.numeric-tower :as math]))

(defn factor?
  "Checks whether y is a factor of x."
  [x y]
  (zero? (mod x y)))

(defn factors
  "Gets all factors for a given number."
  [n]
  (concat
    (filter
      #(factor? n %)
      (range 1 (math/floor (math/sqrt n)))) [n]))

(defn square
  "Squares a number."
  [n]
  (* n n))

(defn prime?
  "Checks whether a number is prime."
  [n]
  (.isProbablePrime (BigInteger/valueOf n) 10))
