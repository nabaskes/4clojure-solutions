(fn [lst n]
  (reduce
   concat
   (map
    #(repeat n %)
    lst
    )
   )
  )
