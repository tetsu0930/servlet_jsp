CREATE TABLE product (
	id int auto_increment primary key, 
	name varchar(100) not null, 
	price int not null
);

INSERT INTO product(name, price) values('まぐろ', 100);
INSERT INTO product(name, price) values('サーモン', 100);
INSERT INTO product(name, price) values('エビ', 100);
INSERT INTO product(name, price) values('イカ', 100);
INSERT INTO product(name, price) values('えんがわ', 100);
INSERT INTO product(name, price) values('穴子', 100);
INSERT INTO product(name, price) values('卵', 100);
INSERT INTO product(name, price) values('ホタテ', 100);
INSERT INTO product(name, price) values('赤貝', 100);
INSERT INTO product(name, price) values('つぶ貝', 100);
INSERT INTO product(name, price) values('サラダ軍艦', 150);
INSERT INTO product(name, price) values('ねぎとろ軍艦', 150);
INSERT INTO product(name, price) values('アボガド巻', 150);
INSERT INTO product(name, price) values('トロ', 200);
INSERT INTO product(name, price) values('いくら', 200);
INSERT INTO product(name, price) values('ウニ', 200);