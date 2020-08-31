-- Table: public.jca00
-- DROP TABLE public.jca00;
CREATE TABLE public.jca00 (
    itemId bigint GENERATED ALWAYS AS IDENTITY (
        INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1
    ) PRIMARY KEY,
    itemData text NOT NULL
) TABLESPACE pg_default;
ALTER TABLE public.jca00 OWNER to postgres;
COMMENT ON TABLE public.jca00 IS 'JCA table';
COMMENT ON COLUMN public.jca00.itemId IS 'jca0 ids';
COMMENT ON COLUMN public.jca00.itemData IS 'This is the item data';
