package cms.gongju.operation.service;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface groupMapper {
    /**
     * 모든 계정그룹 정보를 Map 형태로 조회
     *
     * @return 계정그룹 정보
     */
    List<Map<String, Object>> findAllGroups();

    /**
     * 모든 계정그룹 정보 개수
     *
     * @return 계정그룹 정보 개수
     */
    int findAllGroupsCount();

    /**
     * 중복 계정그룹ID 체크
     *
     * @param group_id 중복 체크할 계정그룹 ID
     * @return 중복 계정그룹ID 여부
     */
    int checkDuplicateId(String group_id);

    /**
     * 계정그룹 등록
     *
     * @param paramMap 계정그룹 등록 데이터
     */
    void createGroupInfo(Map<String, Object> paramMap);

    /**
     * 계정그룹 삭제
     *
     * @param groupId 삭제할 계정그룹 ID
     */
    void deleteGroupInfo(String groupId);

    /**
     * 계정그룹 메뉴설정 리스트
     * @param paramMap 메뉴설정할 계정그룹 ID
     * @return 결과 메시지
     */
    List<Map<String, Object>> getMenuSettingList(Map<String, Object> paramMap);
}
