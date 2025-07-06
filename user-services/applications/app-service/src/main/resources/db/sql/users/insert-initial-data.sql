SET search_path TO users_schema;

INSERT INTO roles (name, description) VALUES ('ADMIN', 'Full access');
INSERT INTO roles (name, description) VALUES ('USER', 'Limited access');

INSERT INTO permissions (name, description) VALUES ('CREATE_USER', 'Can create users');
INSERT INTO permissions (name, description) VALUES ('DELETE_USER', 'Can delete users');
