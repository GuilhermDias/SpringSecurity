CREATE TABLE usuarios(
    id TEXT NOT NULL PRIMARY KEY UNIQUE,
    login TEXT NOT NULL UNIQUE,
    senha TEXT NOT NULL,
    permissao TEXT NOT NULL
);