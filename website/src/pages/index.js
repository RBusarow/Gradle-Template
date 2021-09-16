import React from "react";
import clsx from "clsx";
import Layout from "@theme/Layout";
import CodeBlock from '@theme/CodeBlock';
import Link from "@docusaurus/Link";
import useDocusaurusContext from "@docusaurus/useDocusaurusContext";
import useBaseUrl from "@docusaurus/useBaseUrl";
import styles from "./styles.module.css";

const features = [
  {
    title: "My Title",
    code: (
`val t = Foo()`
    ),
    description: (
      <>
        Description text for initializing <code>Foo</code>.
      </>
    ),
    dest: "docs/configuration"
  },
];

function Feature({imageUrl, title, description, code, dest}) {
  const imgUrl = useBaseUrl(imageUrl);
  return (
    <div className={clsx("col col--4", styles.feature)}>
      {imgUrl && (
        <div className="text--center">
          <img className={styles.featureImage} src={imgUrl} alt={title}/>
        </div>
      )}
      <h1 align="center">{title}</h1>
      <div>
        <CodeBlock className="language-kotlin">{code}</CodeBlock>
      </div>
      <p>{description}</p>
      <a href={dest}>Read more</a>
    </div>
  );
}

function Home() {
  const context = useDocusaurusContext();
  const {siteConfig = {}} = context;
  return (
    <Layout
      title={`${siteConfig.title}`}
      description="The $PROJECT$ project template"
    >
      <header className={clsx('hero hero--primary', styles.heroBanner)}>
        <div className="container">
          <p className={clsx(styles.heroSlogan)}>
            <strong>$PROJECT$</strong> does something you want.
          </p>
          <div className={styles.buttons}>
            <Link
              className={clsx(
                'button button--outline button--secondary button--lg',
                styles.gettingStartedButton,
              )}
              to={useBaseUrl('docs')}>
              Get Started
            </Link>

            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

            {/*            <iframe
              src="https://ghbtns.com/github-btn.html?user=$GITHUB_USER$&repo=$PROJECT$&type=star&count=true&size=large"
              frameBorder="0" scrolling="0" width="170" height="30" title="GitHub"/>*/}

          </div>
        </div>
      </header>
      <main>
        <div className={styles.badges}>
          <div className="container">
            <a href="https://search.maven.org/search?q=g:$DOMAIN$.$PROJECT$">
              <img
                src="https://img.shields.io/maven-central/v/$DOMAIN$.$PROJECT$/$PROJECT$-api.svg?label=maven&style=for-the-badge&color=aa0055"
                alt="version badge"/>
            </a>

            &nbsp;

            <a href="https://plugins.gradle.org/plugin/$DOMAIN$.$PROJECT$">
              <img
                src="https://img.shields.io/gradle-plugin-portal/v/$DOMAIN$.$PROJECT$?style=for-the-badge"
                alt="Gradle Plugin Portal" />
            </a>

            &nbsp;

            <a href="https://github.com/$GITHUB_USER$/$PROJECT$/blob/main/LICENSE">
              <img
                src="https://img.shields.io/badge/license-apache2.0-blue?style=for-the-badge"
                alt="license"/>
            </a>
          </div>
        </div>
      </main>
      <main>
        <section className={styles.features}>
          <div className="container">
            <div className="row">
              {features.map((props, idx) => (
                <Feature key={idx} {...props} />
              ))}
            </div>
          </div>
        </section>
      </main>
    </Layout>
  );
}

export default Home;
