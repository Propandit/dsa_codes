import math
import random

def simulated_annealing(initial_state, objective_function, temperature, cooling_rate):
    current_state = initial_state
    best_state = current_state
    
    while temperature > 0.1:
        new_state = get_neighbor_state(current_state)
        
        current_energy = objective_function(current_state)
        new_energy = objective_function(new_state)
        
        if new_energy < current_energy:
            current_state = new_state
            if new_energy < objective_function(best_state):
                best_state = new_state
        else:
            probability = math.exp((current_energy - new_energy) / temperature)
            if random.random() < probability:
                current_state = new_state
        
        temperature *= cooling_rate
    
    return best_state

def get_neighbor_state(state):
    # Generate a neighboring state by making a small change to the current state
    # This can be implemented based on the specific problem being solved
    
    # Example: For a binary state, flip a random bit
    neighbor = list(state)
    index = random.randint(0, len(neighbor)-1)
    neighbor[index] = 1 - neighbor[index]
    
    return tuple(neighbor)

def objective_function(state):
    # Evaluate the objective function for the given state
    # This can be implemented based on the specific problem being solved
    
    # Example: For a binary state, count the number of ones
    return sum(state)

# Example usage
initial_state = (0, 1, 0, 1, 0)  # Initial state
temperature = 100  # Initial temperature
cooling_rate = 0.95  # Cooling rate

best_state = simulated_annealing(initial_state, objective_function, temperature, cooling_rate)
print("Best state:", best_state)
print("Objective value:", objective_function(best_state))
