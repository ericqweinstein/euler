(ns euler.six)

(defn square
  "Squares a number."
  [number]
  (* number number))

(defn problem-six
  "Gets the difference between the sum
  of the squares and the square of the
  sums for the numbers 1 - 100."
  []
  (- (square (reduce + (range 101))) (reduce + (map square(range 101)))))
