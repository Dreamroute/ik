drop table if exists `smart_user`;
CREATE TABLE `smart_user`
(
    `id`   bigint(0)   NOT NULL AUTO_INCREMENT,
    `name` varchar(32) NULL,
    PRIMARY KEY (`id`)
);