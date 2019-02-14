(defun test (x)
    
	(if (= x 0)
        
		(format t "Pasa nada")
            
			(if (= x 1)
            
				(format t "pasa algo")
                
						(if (> x 4)
                
							(format t "pasan algo mas grande")))
)

)

(test 1)