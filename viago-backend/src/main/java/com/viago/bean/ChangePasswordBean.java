package com.viago.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ChangePasswordBean {
    @NotBlank(message = "{required}")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "{format}")
    private String newPassword;
    @NotBlank(message = "{required}")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "{format}")
    private String oldPassword;
    @NotBlank(message = "{required}")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,15})$", message = "{format}")
    private String confirmOldPassword;

    public boolean isOldConfirmPasswordEqual() {
        return this.confirmOldPassword.equals(this.oldPassword);
    }
}
