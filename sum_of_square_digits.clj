(fn [lst]
  (count
   (filter
    #(< % (reduce + (map
                     (fn [n] (reduce * (repeat 2 (- (int n) 48))))
                     (seq (str %))
                     )))
    lst
    )
   )
  )
