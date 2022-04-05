/*
 * Copyright (c) Akveo 2019. All Rights Reserved.
 * Licensed under the Personal / Commercial License.
 * See LICENSE_PERSONAL / LICENSE_COMMERCIAL in the project root for license information on type of purchased license.
 */

package com.akveo.bundlejava.authentication.resetpassword.exception;

import com.akveo.bundlejava.exception.HttpException;
import org.springframework.http.HttpStatus;

public class CantSendEmailHttpException extends HttpException {
    public CantSendEmailHttpException() {
        super("Impossible d'envoyer l'email pour le moment, réessayer plus tard !", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
