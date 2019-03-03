(fn dup [lst]
  (if
    (empty? lst)
    lst
    (cons (first lst) (cons (first lst) (dup (rest lst))))
    )
  )
