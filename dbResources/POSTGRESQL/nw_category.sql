CREATE TABLE nw_category (
    id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    type VARCHAR(20) NOT NULL,
    active BOOLEAN DEFAULT TRUE,
    priority VARCHAR(20) DEFAULT 'Medium',
    budget_amount DECIMAL(10,2) DEFAULT 0.00,
    goal_amount DECIMAL(10,2) DEFAULT 0.00,
    alert BOOLEAN DEFAULT FALSE,
    threshold DECIMAL(10,2),
    recurring BOOLEAN DEFAULT FALSE,
    frequency VARCHAR(50) DEFAULT 'None',
    currency VARCHAR(20) DEFAULT 'USD',
    tax_related BOOLEAN DEFAULT FALSE,
    transaction_history JSONB,
    start_date DATE,
    end_date DATE,
    cre_date DATE,
    mod_date DATE,

    CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES nw_user (id) ON DELETE CASCADE
);

CREATE INDEX idx_user_id ON nw_category (user_id);
CREATE INDEX idx_name ON nw_category (name);
CREATE INDEX idx_type ON nw_category (type);
