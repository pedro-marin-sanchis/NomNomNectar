-- Inserting product types
INSERT INTO product_type (id, name, description) VALUES
                                                     (0, 'Vegetable', 'Vegetables are healthy and nutritious'),
                                                     (1, 'Fruit', 'Fruits are a rich source of vitamins and minerals'),
                                                     (2, 'Meat', 'High-quality protein from various meats'),
                                                     (3, 'Fish', 'Seafood rich in omega-3 fatty acids'),
                                                     (4, 'Dairy', 'Dairy products for obtaining calcium and vitamin D'),
                                                     (5, 'Cereal', 'Whole grains and cereals for sustained energy'),
                                                     (6, 'Beverages', 'Variety of refreshing and nutritious beverages'),
                                                     (7, 'Snacks', 'Delicious and healthy snacks for munching');

-- Inserting products
INSERT INTO product (id, kcal, product_type, name, description) VALUES
                                                                    (0, 25, 0, 'Broccoli', 'Fresh and healthy broccoli'),
                                                                    (1, 45, 1, 'Apple', 'Juicy apple full of vitamins'),
                                                                    (2, 120, 2, 'Chicken Breast', 'Lean and delicious chicken breast'),
                                                                    (3, 180, 3, 'Salmon', 'Fresh salmon fillet rich in omega-3'),
                                                                    (4, 90, 4, 'Milk', 'Fresh milk for obtaining calcium'),
                                                                    (5, 110, 5, 'Oats', 'Whole oats for an energetic breakfast'),
                                                                    (6, 0, 6, 'Mineral Water', 'Pure and refreshing water'),
                                                                    (7, 50, 7, 'Walnuts', 'Crunchy walnuts full of nutrients');

-- Inserting menus
INSERT INTO menu (id, price, name, image_reference) VALUES
                                                        (0, 15.99, 'Vegetarian Menu', '/image/menu/menu_vegetarian_azerbaijan_stock.jpg'),
                                                        (1, 19.99, 'Healthy Menu', '/image/menu/menu_healthy_freepik.jpg'),
                                                        (2, 24.99, 'Fitness Menu', '/image/menu/menu_fitness_freepik.jpg'),
                                                        (3, 18.99, 'Kids Menu', '/image/menu/menu_kids_azerbaijan_stock.jpg'),
                                                        (4, 22.99, 'Gourmet Menu', '/image/menu/menu_default_freepik.jpg');

-- Inserting menu products
INSERT INTO menu_products (menu_id, products_id) VALUES
                                                     -- Vegetarian Menu
                                                     (0, 0), -- Broccoli
                                                     (0, 1), -- Apple
                                                     (0, 4), -- Milk

                                                     -- Healthy Menu
                                                     (1, 0), -- Broccoli
                                                     (1, 1), -- Apple
                                                     (1, 2), -- Chicken Breast
                                                     (1, 4), -- Milk

                                                     -- Fitness Menu
                                                     (2, 2), -- Chicken Breast
                                                     (2, 3), -- Salmon
                                                     (2, 5), -- Oats

                                                     -- Kids Menu
                                                     (3, 1), -- Apple
                                                     (3, 6), -- Mineral Water

                                                     -- Gourmet Menu
                                                     (4, 2), -- Chicken Breast
                                                     (4, 3), -- Salmon
                                                     (4, 7); -- Walnuts

INSERT INTO app_user (id, phone_number, email, last_name, name, username, password) VALUES
                                                                                                                                        --Passwords are the same as usernames
                                                                    (0, '5551234567', 'juan.perez@gmail.com', 'Pérez', 'Juan', 'jperez', '$2y$10$6c1lSv7gBYdcrbYn7vFrvefVXZvBrJhqnMG/AohodrP73NxDF5QHO'),
                                                                    (1, '5559876543', 'ana.gomez@hotmail.com', 'Gómez', 'Ana', 'agomez', '$2y$10$XJr8j0mOPN8UaGg5FjC6HOPo3iJMW7IlBvJHP43FzgXp6IT6mPizi'),
                                                                    (2, '5551112233', 'carlos.lopez@outlook.com', 'López', 'Carlos', 'clopez', '$2y$10$jReiLsz/LHjFUSDWm8hKJO4EUG8RPZY/7YAdS9Y8AQNrKmERupR2C');

INSERT INTO food_order (id, menu_id, order_number, user_id, address) VALUES
                                                                         (0, 1, 0, 0, 'Main ST, City'),
                                                                         (1, 2, 1, 0, 'Rural ST, City'),
                                                                         (2, 2, 2, 1, 'Maple ST, Town'),
                                                                         (3, 3, 3, 2, 'Pine ST, Village');

INSERT INTO role (id, name) VALUES
                                (0, 'ADMIN'),
                                (1, 'USER');

INSERT INTO users_roles (role_id, user_id) VALUES
                                               -- jperez
                                               (0, 0), -- admin
                                               -- agomez
                                               (1, 1), -- user
                                               -- clopez
                                               (0, 2), -- admin
                                               (1, 2); -- user