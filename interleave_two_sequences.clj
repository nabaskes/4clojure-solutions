(fn intrlv [lst1 lst2]
  (when
    (not (or (empty? lst1) (empty? lst2)))
    (cons (first lst1) (cons (first lst2) (intrlv (rest lst1) (rest lst2))))
    )
  )
