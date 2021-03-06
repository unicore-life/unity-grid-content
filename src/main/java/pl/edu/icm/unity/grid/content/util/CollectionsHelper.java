package pl.edu.icm.unity.grid.content.util;

import java.util.Collections;
import java.util.List;

/**
 * Helper class with used collections methods.
 *
 * @author R.Kluszczynski
 */
public final class CollectionsHelper {
    private CollectionsHelper() {
    }

    public static <T> List<T> unmodifiableOrEmptyOnNull(List<T> objectList) {
        return objectList == null ? Collections.emptyList() : Collections.unmodifiableList(objectList);
    }

    public static <T> boolean isListNullOrEmpty(List<T> anyList) {
        return anyList == null || anyList.isEmpty();
    }
}
