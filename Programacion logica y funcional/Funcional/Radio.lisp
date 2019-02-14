(defun area-circle(rad)
   
"Calcula el area de un circulo"
   
(terpri)
   
(format t "Radius: ~5f" rad)
   
(format t "~%Area: ~10f" (* 3.141592 rad rad))
)

(area-circle 10)