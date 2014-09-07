(ns euler.seven-test
  (:require [clojure.test :refer :all]
            [euler.seven :refer :all]))

(deftest problem-seven-test
  (testing "Problem 7"
    (is (= 104743 (problem-seven 10000)))))
