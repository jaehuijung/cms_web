package cms.gongju.common.security;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class configService {

    public configMapper configMapper;

    public configService(configMapper configMapper) {
        this.configMapper = configMapper;
    }

    /**
     * 시큐리티 : 로그인 한 사용자 정보
     */
    MemberDao getSecurityUserInfoList(String id){
        return configMapper.getSecurityUserInfoList(id);
    };

    /**
     * 시큐리티 : 로그인 한 사용자 메뉴접근권한정보
     */
    List<Map<String, Object>> getSecurityUserAuthList(Map<String, Object> paramMap){
        return configMapper.getSecurityUserAuthList(paramMap);
    };

    /**
     * 시큐리티 : 로그인 한 사용자 마지막로그인일자 갱신
     */
    void updateUserLogin(String userId){
        configMapper.updateUserLogin(userId);
    }
}
