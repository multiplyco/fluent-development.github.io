setup:
	yarn && yarn install-deps

release:
	yarn release

dev:
	open index.html ; make dev1 & make dev2 ; fg

dev1:
	yarn build:dev

dev2:
	yarn sass:dev

serve:
	yarn serve
