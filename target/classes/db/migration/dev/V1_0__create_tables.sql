USE ${dbName};


CREATE TABLE IF NOT EXISTS temperature
(
    id                      bigint        NOT NULL AUTO_INCREMENT,
    device_id                bigint NOT NULL,
    temp                bigint NOT NULL,
    is_last            TINYINT    NOT NULL,
    created_date            TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_modification_date  TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE = InnoDB;