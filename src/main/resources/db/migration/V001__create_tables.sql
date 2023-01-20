CREATE table if not exists expense (
	id INT auto_increment NOT NULL PRIMARY KEY,
	description varchar(500) NOT NULL,
	value decimal(19,2) NOT NULL,
	created datetime(6) NOT NULL,
	paid bit not null default false
);

CREATE table if not exists user (
    id INT auto_increment NOT NULL PRIMARY KEY,
    name varchar(200) NOT NULL,
    user varchar(50) NOT NULL UNIQUE,
    password varchar(20) NOT NULL,
    email varchar(300) NOT NULL UNIQUE,
    created datetime(6) NOT NULL,
    phone varchar(20) NOT NULL
);

CREATE table if not exists expense_user (
    expense_id INT NOT NULL,
    user_id INT NOT NULL,
    paid_value decimal(19,2) NOT NULL,
    created datetime(6) NOT NULL,
    constraint fk_expense_user_expense foreign key (expense_id) references expense (id),
    constraint fk_expense_user_user foreign key (user_id) references user (id)
);

