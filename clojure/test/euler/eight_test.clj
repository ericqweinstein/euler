(ns euler.eight-test
  (:require [clojure.test :refer :all]
            [euler.eight :refer :all]))

(deftest problem-eight-test
  (testing "Problem 8"
    (is (= 40824 (problem-eight large-number)))))
