(fn infix [& args]
  (cond
    (> (count args) 3)
    (apply infix ((second args) (first args) (nth args 2)) (rest (rest (rest args))))
    (= (count args) 3)
    ((second args) (first args) (nth args 2))
    :else
    args
    )
  )
