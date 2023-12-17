insert into Ingredients(IngredientID, name) values (1, 'Potato');
insert into Ingredients(IngredientID, name) values (2, 'Onion');
insert into Ingredients(IngredientID, name) values (3, 'Rice');


insert into Recipes(RecipeID, Name, Creator, Description, EstimatedTime) values (1, 'Kartoffelgratin', 'Anna', 'Backe das Gratin!', '1:00:00');
insert into Recipes(RecipeID, Name, Creator, Description, EstimatedTime) values (2, 'Kekse', 'Anna', 'Nom', '2:05:00');

insert into Recipes_Ingredients(RecipeID, IngredientID, Amount) values (1, 1, 3);
insert into Recipes_Ingredients(RecipeID, IngredientID, Amount) values (1, 2, 3);
insert into Recipes_Ingredients(RecipeID, IngredientID, Amount) values (2, 2, 3);