-- banking_core_service.banking_core_user definition

CREATE TABLE `banking_core_user` (
    `id`                    bigint(20) NOT NULL AUTO_INCREMENT,
    `email`                 varchar(255) DEFAULT NULL,
    `first_name`            varchar(255) DEFAULT NULL,
    `identification_number` varchar(255) DEFAULT NULL,
    `last_name`             varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);