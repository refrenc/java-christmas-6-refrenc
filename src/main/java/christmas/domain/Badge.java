package christmas.domain;

public enum Badge {
    NONE("없음", 0), STAR("별", 5000), TREE("트리", 10000), SANTA("산타", 20000);

    String title;
    Integer minPrice;

    Badge(String title, Integer minPrice) {
        this.title = title;
        this.minPrice = minPrice;
    }

    public static Badge calculateBadge(Integer price) {
        Badge result = NONE;
        for (Badge badge : Badge.values()) {
            if (badge.minPrice > price) {
                return result;
            }
            result = badge;
        }

        return result;
    }
}
