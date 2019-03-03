(fn [k hsm]
  (and
   (contains? hsm k)
   (= (hsm k) nil)
   )
  )
