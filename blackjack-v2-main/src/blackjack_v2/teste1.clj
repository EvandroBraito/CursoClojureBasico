(ns blackjack-v2.teste1)

; var nome = "Evandro";
; var idade = 31;
; int idade = 31;
(def nome "Evandro")
(def idade 31)
(def numeros [1 3 6 8])
(println numeros)

(defn saudacao
  "Saudacao iniciante em Clojure"
  [arg]
  (str "Bem vindo " arg))

(println (saudacao nome))
