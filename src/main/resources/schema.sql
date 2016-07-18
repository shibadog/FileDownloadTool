
create table if not exists login_user (
    user_id int primary key auto_increment,
  login_id varchar(256),
  password varchar(256),
  display_name varchar(255),
  enabled boolean,
  primary key(user_id)
);

create table if not exists authorities (
  user_id int,
  authority varchar(256),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);