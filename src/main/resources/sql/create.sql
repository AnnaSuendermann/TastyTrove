create table Recipes (
                         RecipeID int primary key auto_increment,
                         Name varchar(64) unique not null,
                         Creator varchar(32),
                         Description varchar(2048)
);

create table Ingredients (
                             IngredientID int primary key auto_increment,
                             Name varchar(64) unique not null
);

create table Recipes_Ingredients (
                                     RecipeID int,
                                     IngredientID int,
                                     Amount int,
                                     primary key (RecipeID, IngredientID),
                                     foreign key(RecipeID) references Recipes(RecipeID),
                                     foreign key(IngredientID) references Ingredients(IngredientID)
);

create table Categories(
                           CategoryID int primary key,
                           Name varchar(32)
);

create table Recipe_Categories(
                                  CategoryID int,
                                  RecipeID int,
                                  primary key(CategoryID, RecipeID),
                                  foreign key(CategoryID) references Categories(CategoryID),
                                  foreign key(RecipeID) references Recipes(RecipeID)
);

create table Ratings(
                        RatingID int primary key,
                        RecipeID int unique,
                        Satisfaction int,
                        foreign key(RecipeID) references Recipes(RecipeID)
);