(ns euler.five-test
  (:require [clojure.test :refer :all]
            [euler.five :refer :all]))

(deftest problem-five-test
  (testing "Problem 5"
    (is (= 232792560 (problem-five 20)))))
