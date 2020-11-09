def is_prime?(number)
  for possible_divisor in 2..(number-1)
    if number % possible_divisor == 0
      return false
    end
  end

  true
end

def prime_numbers
  for number in 1..1000
    if (is_prime?(number))
      puts number
    end
  end
end

prime_numbers
