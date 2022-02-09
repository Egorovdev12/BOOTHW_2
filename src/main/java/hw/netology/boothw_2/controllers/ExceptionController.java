package hw.netology.boothw_2.controllers;

import hw.netology.boothw_2.exceptions.InvalidCredentials;
import hw.netology.boothw_2.exceptions.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("hw.netology.boothw_2")
public class ExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidCredentials.class)
    public String icHandler(InvalidCredentials exception) {
        return exception.getMessage();
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedUser.class)
    public String uuHandler(UnauthorizedUser exception) {
        return exception.getMessage();
    }
}