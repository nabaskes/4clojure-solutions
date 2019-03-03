(fn mapp [fun lst]
  (lazy-seq
   (concat
    (list (fun (first lst)))
    (cond
     (empty? (rest lst))
     '()
     :else
     (mapp fun (rest lst)))
    )
   )
  )