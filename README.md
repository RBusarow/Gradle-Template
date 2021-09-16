
1. set up docusaurus
  ```shell
  cd website
  npm install
  cd ..
  ```

3. search and replace **all files** (not just `*.kt*`):
- `TEMPLATE_PROJECT_NAME` -> project's GitHub name
- `TEMPLATE_DOMAIN` -> project's domain
- `TEMPLATE_GITHUB_USER` -> GitHub username
- `TEMPLATE_AUTHOR_NAME` -> author name, like "Rick Busarow"

3. create a GitHub secret for GH Actions named `PERSONAL_ACCESS_TOKEN`
