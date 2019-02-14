:- discontiguous male/1, female/1, parent/2.
male(luis).
male(jose).
male(roberto).
male(miguel).
male(enrique).
female(rosita).
female(esther).
female(mildred).

parent(miguel,luis).
parent(miguel,roberto).
parent(rosita,luis).
parent(rosita,roberto).
parent(enrique,miguel).
parent(mildred,miguel).
parent(esther,rosita).

papa(X,Y) :- male(X),parent(X,Y).
mama(X,Y) :- female(X),parent(X,Y).
hijo(X,Y) :- male(X),parent(Y,X).
hija(X,Y) :- female(X),parent(Y,X).
hermana(X,Y) :- female(X),parent(Par,X),parent(Par,Y), X \= Y.
tio(X,Y) :- hermano(X,Par),parent(Par,Y).
primo(X,Y) :- tio(Unc , X),papa(Unc,Y).
hermano(X,Y) :-  male(X),parent(Somebody,X),parent(Somebody,Y), X \= Y.
