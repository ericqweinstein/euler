(ns euler.nine)

(defn square [n]
  "Squares a number."
  (* n n))

(defn triple? [a, b, c]
  "Checks whether a vector of integers
  constitutes a Pythagorean triple."
  (= (+ (square a) (square b)) (square c)))

(defn problem-nine [n]
  "Finds the Pythagorean triple
  whose elements sum to 1000."
  (for [a (range 1 n)
        b (range a n)
        c [(- 1000 a b)]
        :when (triple? a, b, c)]
   (list, a, b, c)))

; The question asks for the product, which is 31875000,
; but I'm more interested in the triple itself.
