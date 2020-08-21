setup:
	yarn && yarn install-deps

release:
	yarn release

dev1:
	yarn sass:dev

dev2:
	yarn build:dev

serve:
	yarn serve
