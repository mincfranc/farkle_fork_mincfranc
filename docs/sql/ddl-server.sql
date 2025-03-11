create sequence game_seq start with 1 increment by 50;
create sequence roll_seq start with 1 increment by 50;
create sequence turn_seq start with 1 increment by 50;
create sequence user_profile_seq start with 1 increment by 50;
create table game
(
    game_id         bigint not null,
    turn_id         bigint,
    user_profile_id bigint not null,
    state           enum ('FINISHED','IN_PLAY','PRE_GAME'),
    primary key (game_id)
);
create table roll
(
    farkle      boolean not null,
    number_dice integer not null,
    roll_score  integer,
    roll_id     bigint  not null,
    primary key (roll_id)
);
create table roll_die
(
    face_value integer not null,
    roll_id    bigint  not null
);
create table turn
(
    finished   boolean not null,
    turn_score integer not null,
    game_id    bigint  not null,
    turn_id    bigint  not null,
    primary key (turn_id)
);
create table user_profile
(
    user_profile_id bigint not null,
    external_key    uuid   not null unique,
    auth_key        varchar(255),
    display_name    varchar(255),
    primary key (user_profile_id)
);
alter table if exists game
    add constraint FK8ygyvq2bfg7wsdrv08jgxhgld foreign key (user_profile_id) references user_profile;
alter table if exists game
    add constraint FKoaji90cp43q1p2v8u82lg76fg foreign key (turn_id) references turn;
alter table if exists roll_die
    add constraint FK27uspo9bf2ahsy3dknypc02hs foreign key (roll_id) references roll;
alter table if exists turn
    add constraint FKfnda1g6jd92jpiakpu2689pgf foreign key (game_id) references game;
