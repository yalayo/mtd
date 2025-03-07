## Run the cloudflare project
Running the project locally
```shell
cd projects/cloudflare/
npm i # install NPM deps
npm run dev # run dev build in watch mode with CLJS REPL
npx wrangler dev out/main.js # run Cloudflare server at http://localhost:8787
```