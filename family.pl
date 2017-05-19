parent(tom,bob).
parent(pam,bob).
parent(tom,liz).
parent(bob,pat).
parent(pat,jim).
parent(bob,ann).

female(pam).
female(liz).
female(pat).
female(ann).

male(tom).
male(bob).
male(jim).

offspring(Y,X):-
	parent(X,Y).

mother(X,Y):-
	parent(X,Y),
	female(X).

grandparent(X,Z):-
	parent(X,Y),
	parent(Y,Z).


sister(X,Y):-
	parent(Z,X),
	parent(Z,Y),
	female(X).
	%not X=X.

hasachild(X):-
	parent(X,_).

  happy(X):-hasachild(X).

predecessor(X,Z):-
	parent(X,Z).

predecessor(X,Z):-
	parent(X,Y),
	predecessor(Y,Z).


somebody_has_child:-
	parent(_,_).
