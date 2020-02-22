## Model

database name: arthas-file

table name: file_meta

sql schema:
```sql
CREATE TABLE `file_meta` (
  `id` int(11) NOT NULL,
  `file_hash` varchar(255) NOT NULL,
  `file_size` bigint(20) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `file_location` varchar(255) NOT NULL,
  `status` tinyint(2) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `file_hash_idx` (`file_hash`) USING BTREE,
  KEY `status` (`status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```

database name: arthas-file

table name: user_file_meta

sql schema:
```sql
CREATE TABLE `user_file_meta` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `file_size` bigint(20) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `file_hash` varchar(255) NOT NULL,
  `status` tinyint(2) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userid_filehash_idx` (`user_id`,`file_hash`) USING BTREE,
  KEY `status_idx` (`status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8
```