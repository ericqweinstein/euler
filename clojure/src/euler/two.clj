(ns euler.two)

(defn fib
  "Calculates Fibonacci numbers."
  [a b]
  (lazy-cat [a] (fib b (+ a b))))

(defn problem-two
  "Finds the sum of the even-valued terms of
  the Fibonacci sequence below four million."
  [n]
  (reduce + (for [f (fib 1 2) :when (zero? (mod f 2)) :while (< f n)] f)))
