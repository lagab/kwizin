package com.lagab.kwizin.config;

/**
 * @author gabriel
 * @since 12/10/2018.
 */
public interface ApplicationDefaults {
    public interface Security {
        public interface RememberMe {
            String key = null;
        }

        public interface Authentication {
            public interface Jwt {
                String secret = null;
                long tokenValidityInSeconds = 1800L;
                long tokenValidityInSecondsForRememberMe = 2592000L;
            }
        }

        public interface ClientAuthorization {
            String accessTokenUri = null;
            String tokenServiceId = null;
            String clientId = null;
            String clientSecret = null;
        }

        public interface Http {
            String authTokenHeaderName = null;
            String authToken = null;
        }
    }
}
