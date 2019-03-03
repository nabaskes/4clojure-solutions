(fn [lst n]
  (map
   (fn [x] (x 0))
   (filter
    (fn [x] (not= (- n 1) (mod (x 1) n)))
    (map
     vector
     lst
     (range (count lst))
     )
    )
   )
  )
