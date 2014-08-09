# encoding: UTF-8

require 'mathn'
require 'prime'
require 'rational'

class Euler
  # Problem 1: Add all the natural numbers below one
  # thousand that are multiples of three or five.
  def problem_one
    0.upto(999).inject do |sum, num|
      num % 3 == 0 || num % 5 == 0 ? sum + num : sum
    end
  end

  # Problem 2: For terms in the Fibonacci sequence
  # whose values do not exceed four million, find
  # the sum of the even-valued terms.
  def problem_two
    fibs(4_000_000).select { |n| n.even? }.reduce(&:+)
  end

  # Problem 3: What is the largest prime
  # factor of the number 600851475143?
  def problem_three
    find_factors(600_851_475_143).max
  end

  # Problem 4: Find the largest palindrome
  # made from the product of two 3-digit numbers.
  def problem_four
    max = 0

    100.upto(999).each do |a|
      a.upto(999).each do |b|
        max = a * b if palindrome?(a * b) && (a * b) > max
      end
    end

    max
  end

  # Problem 5: What is the smallest positive number
  # evenly divisible by all the numbers 1 - 20?
  def problem_five
    (1..20).reduce(1) { |res, n| res.lcm n }
  end

  # Problem 6: Find the difference between the
  # sum of the squares of the first one hundred
  # natural numbers and the square of the sum.
  def problem_six
    (1.upto(100).reduce(:+)) ** 2 - (1.upto(100).map { |n| n ** 2 }).reduce { |sum, n| sum + n }
  end

  # Problem 7: What is the 10,001st prime number?
  def problem_seven
    Prime.first(10_001).last
  end

  # Problem 8: What is the greatest product of five
  # consecutive digits in the below 1000-digit number?
  # @todo Refactor; this is pretty gross.
  def problem_eight
    big_number = File.read('big_number.txt')
    start, stop = 0, 5
    window = big_number[start, stop]
    largest_product = 0
    while stop < big_number.length
      current_product = window.split('').take(5).map(&:to_i).reduce(&:*)
      if current_product > largest_product
        largest_product = current_product
      end
      window = big_number[start += 1, stop += 1]
    end

    largest_product
  end

  # Problem 9: Find the product of the Pythagorean
  # triple elements whose sum is 1,000.
  def problem_nine(sum)
    (1..sum).each do |m|
      (1..sum).each do |n|
        # Thank you, Wikipedia:
        # http://en.wikipedia.org/wiki/Formulas_for_generating_Pythagorean_triples
        a = n ** 2 - m ** 2
        b = 2 * m * n
        c = n ** 2 + m ** 2
        return a, b, c if a + b + c == sum
      end
    end
  end

  # (The above problem asks for the product,
  # which is 31_875_000, but I was more
  # interested in the actual elements of
  # the triple.)

  # Problem 10: Find the sum of all
  # prime numbers below two million.
  def problem_ten
    Prime.instance.each(2_000_000).reduce(&:+)
  end

  private

  def fibs(limit)
    previous, current, numbers = 1, 1, [1, 1]

    while current < limit
      sum = previous + current
      numbers << sum
      previous = current
      current = sum
    end

    numbers
  end

  def find_factors(number)
    return [] if number == 1
    factor = (2..number).find { |x| number % x == 0 }
    [factor] + find_factors(number / factor)
  end

  def palindrome?(n)
    n.to_s == n.to_s.reverse
  end
end
