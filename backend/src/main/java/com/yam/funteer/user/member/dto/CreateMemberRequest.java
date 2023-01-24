package com.yam.funteer.user.member.dto;

import com.yam.funteer.user.UserType;
import com.yam.funteer.user.member.entity.Member;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor @ToString
public class CreateMemberRequest {

    @Email(message = "이메일 형식이 올바르지 않습니다.")
    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private String password;

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotBlank(message = "휴대폰 번호를 입력해주세요.")
    @Pattern(regexp = "(01[016789])-(\\d{3,4})-(\\d{4})", message = "올바른 휴대폰 번호를 입력해주세요.")
    private String phone;

    @NotBlank(message = "닉네임은 필수 입력 값입니다.")
    private String nickname;

    public Member toEntity(){
        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .phone(phone)
                .nickName(nickname)
                .status(UserType.NORMAL)
                .money(0L)
                .isPrivate(false)
                .regDate(LocalDateTime.now())
                .build();
    }

    public void encryptPassword() {
    }
}
