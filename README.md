# spring-cloud-import-issue

The broken application will use the vault configured in `application.yml` when running with `local` profile.
The working application is my current work around. We remove `spring.config.import` from the main `application.yml` and place it in `application-local.yml` and in a newly created `application-production.yml`
