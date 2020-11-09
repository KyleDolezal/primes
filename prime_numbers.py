def is_prime(number):
  for possible_divisor in range(2,(number-1)):
    if number % possible_divisor == 0:
      return False
  return True

def prime_numbers():
  for number in range(1,1000):
    if (is_prime(number)):
      print(number)

prime_numbers()
