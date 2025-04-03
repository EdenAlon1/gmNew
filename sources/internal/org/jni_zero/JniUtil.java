package internal.org.jni_zero;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JniUtil {
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        ArrayMap arrayMap = new ArrayMap(length >> 1);
        for (int i = 0; i < length; i += 2) {
            arrayMap.put(objArr[i], objArr[i + 1]);
        }
        return arrayMap;
    }

    private static Object[] mapToArray(Map<Object, Object> map) {
        int size = map.size();
        Object[] objArr = new Object[size + size];
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            objArr[i] = entry.getKey();
            objArr[i + 1] = entry.getValue();
            i += 2;
        }
        return objArr;
    }
}
