CREATE TABLE food_logs (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    user_id BIGINT NOT NULL,
    food_name VARCHAR(255) NOT NULL,
    consumed_at TIMESTAMP NOT NULL,
    quantity DOUBLE PRECISION,
    serving_unit VARCHAR(50),
    calories DOUBLE PRECISION,
    protein_g DOUBLE PRECISION,
    carbs_g DOUBLE PRECISION,
    fat_g DOUBLE PRECISION,
    CONSTRAINT fk_food_logs_users FOREIGN KEY (user_id) REFERENCES users(id)
);