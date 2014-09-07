(ns euler.five
  ; Who NAMES these things
  (:require [clojure.math.numeric-tower :as math]))

(defn problem-five [n]
  "Finds the smallest number divisible
  by each of the numbers one to twenty."
  (reduce math/lcm (range 1 n)))
