package com.viago.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ChangePasswordBean {
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "Password must be 8–15 characters long, include at least one uppercase letter and one number, and use only letters, digits, and @, #, $, ^, +, =.\n")
    @NotBlank(message = "New Password is a required field")
    private String newPassword;
    @NotBlank(message = "Old Password is a required field")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "Password must be 8–15 characters long, include at least one uppercase letter and one number, and use only letters, digits, and @, #, $, ^, +, =.\n")
    private String oldPassword;
    @NotBlank(message = "Confirm Old Password is a required field")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "Password must be 8–15 characters long, include at least one uppercase letter and one number, and use only letters, digits, and @, #, $, ^, +, =.\n")
    private String confirmOldPassword;

    public boolean isOldConfirmPasswordEqual() {
        return this.confirmOldPassword.equals(this.oldPassword);
    }
}
