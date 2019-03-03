(fn [sets]
  (= (count (reduce clojure.set/union sets))
     (reduce + (map count sets))
     )
  )
