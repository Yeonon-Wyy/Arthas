## Model
database name: arthas-user

table name: user

sql schema:
```sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `avatar` varchar(255) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_idx` (`username`) USING BTREE,
  KEY `username_password_idx` (`username`,`password`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```
