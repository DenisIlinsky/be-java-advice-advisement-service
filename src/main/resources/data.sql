create table Advisement
    (
    id           serial
        constraint id
            primary key,
    adviser_id   uuid not null,
    user_id      uuid not null,
    created_by   uuid not null,
    meeting_link TEXT not null,
    type         TEXT not null DEFAULT 'TRIAL, COMMON',
    status       TEXT not null DEFAULT 'PAYMENT_WAITING, START_WAITING, IN_PROGRESS, COMPLETED, CANCELED',
    start_date   TIMESTAMP not null,
    end_date     TIMESTAMP not null
);