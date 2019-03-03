(fn rot [n lst]
  (cond
   (> n (count lst))
   (recur (- n (count lst)) lst)
   (> (* -1 n) (count lst))
   (recur (+ n (count lst)) lst)
   (> 0 n)
   (concat
    (drop (+ (count lst) n) lst)
    (take (+ (count lst) n) lst)
    )
   :else
   (concat
    (drop n lst)
    (take n lst)
    )
   )
  )
