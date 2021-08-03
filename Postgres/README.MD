# Instructions

## Initializate DB

```
sudo docker-compose -f docker-compose.yml up -d --build
```

## Shut down DB

```
sudo docker-compose -f docker-compose.yml down --remove-orphans
```

## Access DB
```
sudo docker exec -it messyo-domestic-postgres psql -U "username" -d "dbname"
```