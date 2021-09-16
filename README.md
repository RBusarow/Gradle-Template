
1. set up docusaurus
  ```shell
  cd website
  npm install
  cd ..
  ```

3. search and replace **all files** (not just `*.kt*`):
- replace `\$PROJECT$` with the project's GitHub name
- replace `$PROJECT$` with the project's GitHub name
- replace `\$DOMAIN$` with the project's domain
- replace `$DOMAIN$` with the project's domain
- replace `\$GITHUB_USER$` with the GitHub username
- replace `$GITHUB_USER$` with the GitHub username

3. create a GitHub secret for GH Actions named `PERSONAL_ACCESS_TOKEN`
