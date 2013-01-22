(ns guesser.core-test
  (:use clojure.test
        guesser.core
        midje.sweet))

(fact (rand-int 10) => 2)

(deftest number-guess-test
  (testing "If the number is the same, say 'yay'"
    (is (= (number-guess 2) "yay"))
    (is (= (number-guess 3) "nay!"))
    ))
