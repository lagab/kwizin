package com.lagab.kwizin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * @author gabriel
 * @since 12/10/2018.
 * Properties specific to App
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final ApplicationProperties.Security security = new ApplicationProperties.Security();
    
    public ApplicationProperties(){
        
    }
    public ApplicationProperties.Security getSecurity() {
        return this.security;
    }

    public static class Security {
        private final ApplicationProperties.Security.ClientAuthorization clientAuthorization = new ApplicationProperties.Security.ClientAuthorization();
        private final ApplicationProperties.Security.Authentication authentication = new ApplicationProperties.Security.Authentication();
        private final ApplicationProperties.Security.RememberMe rememberMe = new ApplicationProperties.Security.RememberMe();

        public Security() {
        }

        public ApplicationProperties.Security.ClientAuthorization getClientAuthorization() {
            return this.clientAuthorization;
        }

        public ApplicationProperties.Security.Authentication getAuthentication() {
            return this.authentication;
        }

        public ApplicationProperties.Security.RememberMe getRememberMe() {
            return this.rememberMe;
        }

        public static class RememberMe {
            @NotNull
            private String key;

            public RememberMe() {
                this.key = com.lagab.kwizin.config.ApplicationDefaults.Security.RememberMe.key;
            }

            public String getKey() {
                return this.key;
            }

            public void setKey(String key) {
                this.key = key;
            }
        }

        public static class Authentication {
            private final ApplicationProperties.Security.Authentication.Jwt jwt = new ApplicationProperties.Security.Authentication.Jwt();

            public Authentication() {
            }

            public ApplicationProperties.Security.Authentication.Jwt getJwt() {
                return this.jwt;
            }

            public static class Jwt {
                private String secret;
                private long tokenValidityInSeconds;
                private long tokenValidityInSecondsForRememberMe;

                public Jwt() {
                    this.secret = com.lagab.kwizin.config.ApplicationDefaults.Security.Authentication.Jwt.secret;
                    this.tokenValidityInSeconds = 1800L;
                    this.tokenValidityInSecondsForRememberMe = 2592000L;
                }

                public String getSecret() {
                    return this.secret;
                }

                public void setSecret(String secret) {
                    this.secret = secret;
                }

                public long getTokenValidityInSeconds() {
                    return this.tokenValidityInSeconds;
                }

                public void setTokenValidityInSeconds(long tokenValidityInSeconds) {
                    this.tokenValidityInSeconds = tokenValidityInSeconds;
                }

                public long getTokenValidityInSecondsForRememberMe() {
                    return this.tokenValidityInSecondsForRememberMe;
                }

                public void setTokenValidityInSecondsForRememberMe(long tokenValidityInSecondsForRememberMe) {
                    this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
                }
            }
        }

        public static class ClientAuthorization {
            private String accessTokenUri;
            private String tokenServiceId;
            private String clientId;
            private String clientSecret;

            public ClientAuthorization() {
                this.accessTokenUri = com.lagab.kwizin.config.ApplicationDefaults.Security.ClientAuthorization.accessTokenUri;
                this.tokenServiceId = com.lagab.kwizin.config.ApplicationDefaults.Security.ClientAuthorization.tokenServiceId;
                this.clientId = com.lagab.kwizin.config.ApplicationDefaults.Security.ClientAuthorization.clientId;
                this.clientSecret = com.lagab.kwizin.config.ApplicationDefaults.Security.ClientAuthorization.clientSecret;
            }

            public String getAccessTokenUri() {
                return this.accessTokenUri;
            }

            public void setAccessTokenUri(String accessTokenUri) {
                this.accessTokenUri = accessTokenUri;
            }

            public String getTokenServiceId() {
                return this.tokenServiceId;
            }

            public void setTokenServiceId(String tokenServiceId) {
                this.tokenServiceId = tokenServiceId;
            }

            public String getClientId() {
                return this.clientId;
            }

            public void setClientId(String clientId) {
                this.clientId = clientId;
            }

            public String getClientSecret() {
                return this.clientSecret;
            }

            public void setClientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
            }
        }
    }

}
