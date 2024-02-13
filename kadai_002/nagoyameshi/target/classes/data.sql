-- shopsテーブル
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (1, '手羽きん屋', 'meshi_01.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 2000, 6000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (2, '味噌煮込みうどんヌ', 'meshi_02.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 1000, 8000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (3, 'パスタイトリアン', 'meshi_03.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 500, 3000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (4, 'よっ寿司ドンマイ', 'meshi_04.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 3000, 7000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (5, 'みっそみそ', 'meshi_05.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 3000, 7000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (6, '卵ナポリタン', 'meshi_06.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 3000, 7000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (7, '鳥富豪', 'meshi_07.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 5000, 10000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');
INSERT IGNORE INTO shops (id, name, image_name, description, price_min, price_max, open_time, close_time, postal_code, address, phone_number, rest_day) VALUES (8, 'ココダ珈琲', 'meshi_08.jpg', '最寄り駅から徒歩10分。自然豊かで閑静な場所にあります。長期滞在も可能です。', 500, 2000, '9:00', '20:00', '073-0145', '北海道砂川市西五条南X-XX-XX', '012-345-678' , '土日祝日');

-- rolesテーブル
INSERT IGNORE INTO roles (id, name) VALUES (1, 'ROLE_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (2, 'ROLE_ADD_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (3, 'ROLE_ADDPULUS_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (4, 'ROLE_ADMIN');
