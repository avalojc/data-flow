-- Table: public.jca0
-- DROP TABLE public.jca0;
CREATE TABLE public.jca0 (
    itemId bigint GENERATED ALWAYS AS IDENTITY (
        INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1
    ) PRIMARY KEY,
    itemData text NOT NULL
) TABLESPACE pg_default;
ALTER TABLE public.jca0 OWNER to postgres;
COMMENT ON TABLE public.jca0 IS 'JCA table';
COMMENT ON COLUMN public.jca0.itemId IS 'jca0 ids';
COMMENT ON COLUMN public.jca0.itemData IS 'This is the item Data';
