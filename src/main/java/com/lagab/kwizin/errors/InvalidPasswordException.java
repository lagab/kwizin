package com.lagab.kwizin.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;
/**
 * @author gabriel
 * @since 15/10/2018.
 */
public class InvalidPasswordException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super(ErrorConstants.INVALID_PASSWORD_TYPE, "Incorrect password", Status.BAD_REQUEST);
    }
}
