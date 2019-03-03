(fn [fun lst]
  (zipmap
   (distinct (map fun lst))
   (for
     [x (distinct (map fun lst))]
     (filter #(= x (fun %)) lst)
     )
   )
  )
