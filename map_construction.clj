(fn zm [kys vlz]
  (reduce
   conj
   (map
    (fn [k v] {k v})
    kys
    vlz
    )
   )
  )
