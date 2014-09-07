(ns euler.four)

(defn palindrome? [string]
  "Checks whether a string is a palindrome."
  (= (reverse string) (seq string)))

(defn problem-four []
  "Finds the largest palindrome made from
  the product of two three-digit numbers."
  (apply max (filter #(palindrome? (str %)) (for [x (range 100 999) y (range 100 999)] (* x y)))))
