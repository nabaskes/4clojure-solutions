(fn spat [n lst]
  (vector (mapv identity (take n lst))
    (mapv identity (drop n lst))))
