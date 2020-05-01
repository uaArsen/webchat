create table "User"
(
  id serial not null
    constraint user_pk
      primary key,
  nickname varchar(256) not null,
  created_at timestamp not null
);

create unique index user_id_uindex
  on "User" (id);

create unique index user_nickname_uindex
  on "User" (nickname);

create table "Chat"
(
  id serial not null
    constraint chat_pk
      primary key,
  created_at timestamp not null,
  author integer
    constraint author
      references "User"
);


create unique index chat_id_uindex
  on "Chat" (id);

create table "Message"
(
  id serial not null
    constraint message_pk
      primary key,
  text varchar not null,
  author integer
    constraint author
      references "User",
  chat integer
    constraint chat
      references "Chat",
  created_at timestamp not null
);

create unique index message_id_uindex
  on "Message" (id);

create table "User_chat"
(
  id serial not null
    constraint user_chat_pk
      primary key,
  chat integer
    constraint chat
      references "Chat",
  "user" integer
    constraint "user"
      references "User"
);

create unique index user_chat_id_uindex
  on "User_chat" (id);