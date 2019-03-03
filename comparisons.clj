(fn [op x y]
  (if
    (op x y)
    :lt
    (if
      (op y x)
      :gt
      :eq
      )
    )
  )
