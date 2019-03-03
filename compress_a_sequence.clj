(fn dedupeconsec [s]
  (if
    (empty? s)
    '()
    (if
      (= (first s) (first (rest s)))
      (dedupeconsec (rest s))
      (concat (list (first s)) (dedupeconsec (rest s)))
      )
    )
  )
