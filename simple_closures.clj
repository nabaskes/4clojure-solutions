(fn raiseton [n]
  (fn [x] (reduce * (repeat n x))))
