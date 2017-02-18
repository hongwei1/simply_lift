val a= 5;

for {
  r <- Option(5)  // make sure it's a post
  b <- Option(6) // make sure it's a post
} {
  print(r)
  print(b)
  r
}