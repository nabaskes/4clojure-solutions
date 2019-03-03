(fn [lst]
  (set
   (filter
    #(> (count %) 1)
    (map
     set
     (vals (group-by sort lst))
     )
    )
   )
  )
