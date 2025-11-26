## windows
```
Ensure that docker desktop is running when you run the docker-compose.yml file.
```

### windows error
```
upon startup you may see the below entries in the logs of the mariadb container run
    2025-11-26 07:39:29 2025-11-26  5:39:29 0 [ERROR] InnoDB: File ./ib_logfile0 was not found
    2025-11-26 07:39:29 2025-11-26  5:39:29 0 [ERROR] InnoDB: Plugin initialization aborted with error Generic error
    2025-11-26 07:39:29 2025-11-26  5:39:29 0 [ERROR] Plugin 'InnoDB' registration as a STORAGE ENGINE failed.
    2025-11-26 07:39:29 2025-11-26  5:39:29 0 [ERROR] Unknown/unsupported storage engine: InnoDB
    2025-11-26 07:39:29 2025-11-26  5:39:29 0 [ERROR] Aborting
to fix:  
    delete all the files in the persistent volume
    restart the container 
```

## run
```
run below in the same directory that the docker-compose.yml file is in
docker-compose up -d
```
