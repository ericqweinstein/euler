(ns euler.two)

(defn fib [a b]
  "Calculates Fibonacci numbers."
  (lazy-cat [a] (fib b (+ a b))))

(defn problem-two [n]
  "Finds the sum of the even-valued terms of
  the Fibonacci sequence below four million."
  (reduce + (for [f (fib 1 2) :when (zero? (mod f 2)) :while (< f n)] f)))
