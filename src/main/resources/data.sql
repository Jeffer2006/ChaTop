-- Insert sample users (using INSERT IGNORE to avoid duplicates)
-- Password for all users is "secret" - BCrypt hash: $2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iYqiSfFe5ldcR7gZZvGvxGOoQP.
INSERT IGNORE INTO users (email, name, password, created_at, updated_at) VALUES
('admin@admin.com', 'Admin User', '$2a$12$Ma6Gg/C3SmJXcr9.chNwvOC4h5f46iW3A6ZwXRpNuV7dN2DMbXbQy', NOW(), NOW()),
('john.doe@example.com', 'John Doe', '$2a$12$Ma6Gg/C3SmJXcr9.chNwvOC4h5f46iW3A6ZwXRpNuV7dN2DMbXbQy', NOW(), NOW()),
('jane.smith@example.com', 'Jane Smith', '$2a$12$Ma6Gg/C3SmJXcr9.chNwvOC4h5f46iW3A6ZwXRpNuV7dN2DMbXbQy', NOW(), NOW()),
('bob.wilson@example.com', 'Bob Wilson', '$2a$12$Ma6Gg/C3SmJXcr9.chNwvOC4h5f46iW3A6ZwXRpNuV7dN2DMbXbQy', NOW(), NOW());

-- Insert sample rentals (using INSERT IGNORE to avoid duplicates)
INSERT IGNORE INTO rentals (name, surface, price, picture, description, owner_id, created_at, updated_at) VALUES
('Cozy Downtown Apartment', 75.5, 1200.00, 'https://images.unsplash.com/photo-1522708323590-d24dbb6b0267', 'Beautiful apartment in the heart of downtown with modern amenities and great city views.', 2, NOW(), NOW()),
('Spacious Family Home', 150.0, 2500.00, 'https://images.unsplash.com/photo-1570129477492-45c003edd2be', 'Perfect family home with 4 bedrooms, large garden, and quiet neighborhood.', 3, NOW(), NOW()),
('Modern Studio Loft', 45.0, 800.00, 'https://images.unsplash.com/photo-1502672260266-1c1ef2d93688', 'Stylish studio loft with high ceilings and industrial design elements.', 2, NOW(), NOW()),
('Luxury Penthouse', 200.0, 4500.00, 'https://images.unsplash.com/photo-1512917774080-9991f1c4c750', 'Exclusive penthouse with panoramic city views and premium finishes.', 4, NOW(), NOW()),
('Charming Cottage', 90.0, 1800.00, 'https://images.unsplash.com/photo-1449844908441-8829872d2607', 'Quaint cottage with garden, perfect for those seeking tranquility.', 3, NOW(), NOW());

-- Insert sample messages (using INSERT IGNORE to avoid duplicates)
INSERT IGNORE INTO messages (user_id, rental_id, message, created_at, updated_at) VALUES
(1, 1, 'Hi, I am interested in this apartment. Could you provide more details about the lease terms?', NOW(), NOW()),
(4, 1, 'Is this apartment still available? I would like to schedule a viewing.', NOW(), NOW()),
(1, 2, 'This family home looks perfect for us. What is the earliest move-in date?', NOW(), NOW()),
(2, 4, 'The penthouse looks amazing! Could we arrange a tour this weekend?', NOW(), NOW()),
(3, 3, 'I love the industrial design of this loft. Are pets allowed?', NOW(), NOW()),
(1, 5, 'The cottage seems very peaceful. Is it furnished or unfurnished?', NOW(), NOW());
