(ns euler.three-test
  (:require [clojure.test :refer :all]
            [euler.three :refer :all]))

(deftest problem-three-test
  (testing "Problem 3"
    (is (= 6857 (problem-three 600851475143)))))
