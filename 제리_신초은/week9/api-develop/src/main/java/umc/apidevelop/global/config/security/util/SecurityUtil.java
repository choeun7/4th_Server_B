package umc.apidevelop.global.config.security.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

//API 호출 시, Member의 정보가 헤더에 담겨져 올텐데, 어떤 Member가 API를 요청했는지 조회하는 코드
public class SecurityUtil {
    public static String getCurrentMemberId() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication.getName() == null) {
            throw new RuntimeException("No authentication information.");
        }
        return authentication.getName();
        //이제, SecurityUtil.getCurrentMemberId() 코드를 사용하면 편리하게 현재 memberId를 조회할 수 있다.
    }
}