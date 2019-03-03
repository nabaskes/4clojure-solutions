(fn [s1 s2]
  (reduce
   +
   (map
    (fn [v]
      (* (first v) (second v))
      )
    (map vector s1 s2)
    )
   )
  )
