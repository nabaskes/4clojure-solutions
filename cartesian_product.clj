(fn cartprod [s1 s2]
  (set (reduce
   concat
   (map
    (fn [x]
      (map
       (fn [y] (vector x y))
       s2
       )
      )
    s1
    )
   )
  )
  )
