package lkdcode.class4.app.domain.service;

import lkdcode.class4.app.domain.repository.RecommendedFriendsList;
import lkdcode.class4.app.domain.repository.SNSRepository;

import java.util.List;

public class PointService {

    private final SNSRepository<RecommendedFriendsList> recommendedFriendsList;

    public PointService(final SNSRepository<RecommendedFriendsList> recommendedFriendsList) {
        this.recommendedFriendsList = recommendedFriendsList;
    }

    public void calculatorFriendList() {
        recommendedFriendsList.getList();
    }

    public void calculatorKnownFriends() {
    }

    public void calculatorVisitorList() {
    }

    public RecommendedFriendsList getList() {
        return recommendedFriendsList.getList();
    }

}
