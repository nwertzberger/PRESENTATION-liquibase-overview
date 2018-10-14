--liquibase formatted sql

--changeset nwertzberger:add-country-table

create table country (
  -- Longest country name is "United Kingdom of Great Britain and Northern Ireland"
  id varchar(55)
);

grant select,update,delete,insert to liquibase_demo;

--changeset nwertzberger:add-country-column-to-state

alter table state add column (
  country varchar(55) default value 'United States of America'
);

--changeset nwertzberger:add-constraints
alter table state add foreign key (country) references country(id);



