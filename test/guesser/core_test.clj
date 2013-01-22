(ns guesser.core-test
  (:use clojure.test
        guesser.core))

(deftest number-guess-test
  (testing "If the number is the same, say 'yay'"
    (is (= (number-guess 2 (constantly 2)) "yay"))
    (is (= (number-guess 3 (constantly 2)) "nay!"))
    ))

(deftest number-guess-test-with-string
  (testing "If the number is the same, say 'yay' and my string"
    (is (= (number-guess 2 "horse" (constantly 2)) "yay horse"))
    (is (= (number-guess 3 "horse" (constantly 2)) "nay!"))
    ))
