(fn rn [st en]
  (when
   (> en st)
   (cons st (rn (+ st 1) en))
   )
  )
