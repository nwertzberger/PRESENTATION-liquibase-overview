--liquibase formatted sql

--changeset nwertzberger:add-country-table
create table country (
  -- Longest country name is "United Kingdom of Great Britain and Northern Ireland"
  id varchar(55) not null
);
--rollback drop table country;

--changeset nwertzberger:populate-country-with-usa
insert into country (id) values ('United States of America');
--rollback delete from country where id='United States of America';

--changeset nwertzberger:add-country-column-to-state
alter table state
  add country varchar(55) default 'United States of America';
--rollback alter table state drop country;

--changeset nwertzberger:add-primary-key-to-country-table
alter table country
  add constraint country_pk
  primary key (id);
--rollback alter table country drop constraint country_pk;

--changeset nwertzberger:add-constraints-for-state-and-country
alter table state
 add constraint state_fk1
 foreign key (country) references country(id);
--rollback alter table state drop constraint state_fk1;


