(ns euler.two-test
  (:require [clojure.test :refer :all]
            [euler.two :refer :all]))

(deftest problem-two-test
  (testing "Problem 2"
    (is (= 4613732 (problem-two 4000000)))))
