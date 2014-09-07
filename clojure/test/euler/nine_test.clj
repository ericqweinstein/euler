(ns euler.nine-test
  (:require [clojure.test :refer :all]
            [euler.nine :refer :all]))

(deftest problem-nine-test
  (testing "Problem 9"
    (is (= '((200 375 425)) (problem-nine 1000)))))
