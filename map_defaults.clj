(fn [dflt s]
  ((fn makedflthash [default lst hashmap]
     (if
       (empty? lst)
       hashmap
       (recur default (rest lst) (conj hashmap {(first lst) default}))
       )
     )
   dflt
   (rest s)
   {(first s) dflt}
   )
  )
