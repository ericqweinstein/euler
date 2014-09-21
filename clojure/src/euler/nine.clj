(ns euler.nine
  (:require [euler.utils :refer [square]]))

(defn triple?
  "Checks whether a vector of integers
  constitutes a Pythagorean triple."
  [a b c]
  (= (+ (square a) (square b)) (square c)))

(defn problem-nine
  "Finds the Pythagorean triple
  whose elements sum to 1000."
  [n]
  (for [a (range 1 n)
        b (range a n)
        c [(- 1000 a b)]
        :when (triple? a, b, c)]
   (list, a, b, c)))

; The question asks for the product, which is 31875000,
; but I'm more interested in the triple itself.
