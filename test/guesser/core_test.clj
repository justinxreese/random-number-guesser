(ns guesser.core-test
  (:use clojure.test
        guesser.core))

(deftest number-guess-test
  (testing "If the number is the same, say 'yay'"
    (is (= (number-guess 2 (fn [] 2)) "yay"))
    (is (= (number-guess 3 (fn [] 2)) "nay!"))
    ))

(deftest number-guess-test-with-string
  (testing "If the number is the same, say 'yay' and my string"
    (is (= (number-guess 2 "horse" (fn [] 2)) "yay horse"))
    (is (= (number-guess 3 "horse" (fn [] 2)) "nay!"))
    ))
