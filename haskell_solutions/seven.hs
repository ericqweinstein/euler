-- Project Euler Problem Number Seven:
--
-- What is the 10,001st prime number?

problemSeven :: Int -> Integer
problemSeven n = last (take n [x | x <- [1..], isPrime x])

isPrime :: Integer -> Bool
isPrime n = not $ any divisible $ takeWhile dividing [2..] where
  divisible x = n `mod` x == 0
  dividing  x = x * x <= n

-- problemSeven 10002 ==> 104743

