(ns guesser.core)

(defn number-guess
  "Compare my guess to a random number"
  [guess random-fn]
  (if (== guess (random-fn)) "yay" "nay!"))
