(fn [lst]
  (map
   vector
   lst
   (range (count lst))
   )
  )
