from alcs_n_russians_funcs import *

rm = ResourceManager('firmadeath')

def create_smoking_recipes():
    print('\tCreating smoking recipes...')
    smoking_recipe(rm, 'meat', not_rotten(lacks_trait('#tfc:foods/raw_meats', 'firmalife:smoked')), item_stack_provider(copy_input=True, add_trait='firmalife:smoked'))
    
def create_recipes():
    print('Creating recipes...')
    create_smoking_recipes()

def main():
    create_recipes()
    

main()