setup:
	yarn && yarn install-deps

prod:
	yarn release

dev1:
	yarn sass:dev

dev2:
	yarn build:dev

serve:
	yarn serve && open localhost:8080
