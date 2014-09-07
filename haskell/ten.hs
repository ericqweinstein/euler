-- Project Euler Problem Number Ten:
--
-- Find the sum of all prime
-- numbers below two million.

problemTen :: Integer -> Integer
problemTen n = sum [x | x <- [2..n], isPrime x]

isPrime :: Integer -> Bool
isPrime n = not $ any divisible $ takeWhile dividing [2..] where
  divisible x = n `mod` x == 0
  dividing  x = x * x <= n

-- problemTen 2000000 ==> 142913828922
-- (This works, but takes a few minutes to run.)

