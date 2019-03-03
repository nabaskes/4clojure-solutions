(fn iter [f x]
  (lazy-seq
   (cons
    x
    (iter f (f x))
    )
   )
  )
