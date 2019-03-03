(fn inter [s1 s2]
  (set
   (filter
    (fn [x] (= x (some #{x} s2)))
    s1
    )
   )
  )
