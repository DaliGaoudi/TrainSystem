from Train import *
from Station import *

st1 = Station("A", "A")
st2 = Station("B", "A")
st3 = Station("C", "A")
st4 = Station("D", "A")

t1 = Train("1", st1, st4, [st1, st2, st3, st4])

t1.announce()