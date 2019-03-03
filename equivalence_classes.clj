(fn eqcl [p s]
  (into
   #{}
   (map
    #(into #{} %)
    (vals
     (group-by
      p
      s
      )
     )
    )
   )
  )
