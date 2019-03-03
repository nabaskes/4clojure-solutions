(fn nthel [lst n]
  (if
    (= n 0)
    (first lst)
    (recur (rest lst) (- n 1))))
