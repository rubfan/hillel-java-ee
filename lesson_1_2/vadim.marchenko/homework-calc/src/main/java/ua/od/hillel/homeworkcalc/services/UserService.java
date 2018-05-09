package ua.od.hillel.homeworkcalc.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public String operationResultToUser(int operationResult, String username) {
    if (username != null) {
      return operationResult + " " + username;
    }
    return operationResult + " Unknown User";
  }


}
