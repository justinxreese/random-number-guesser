(ns guesser.core)

(defn number-guess
  "Compare my guess to a random number"
  [guess]
  (if (== guess (rand-int 10)) "yay" "nay!"))
