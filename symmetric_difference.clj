(fn [s1 s2]
  (clojure.set/union
   (set(filter (fn [x] (= nil (some #{x} s2))) s1))
   (set(filter (fn [x] (= nil (some #{x} s1))) s2))
   )
  )
