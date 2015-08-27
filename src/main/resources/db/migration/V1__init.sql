-- Table: notification_request_intent

-- DROP TABLE notification_request_intent;

CREATE TABLE notification_request_intent
(
  id bigint NOT NULL,
  loan_id character varying(36) NOT NULL,
  card_id character varying(36),
  template_id character varying(150) NOT NULL,
  creation_date timestamp NOT NULL,
  intent_status character varying(36) NOT NULL,
  CONSTRAINT pk_notification_request_intent PRIMARY KEY (id)
);

CREATE TABLE scheduler_execution_records
(
  id bigint NOT NULL,
  creation_date timestamp NOT NULL,
  execution_type character varying(36) NOT NULL,
  CONSTRAINT pk_scheduler_execution_records PRIMARY KEY (id)
);