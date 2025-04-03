package defpackage;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chhp {
    public static Map a(String str, String str2) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("APP_NAME", str);
        arrayMap.put("REQUEST_ID", str2);
        return arrayMap;
    }

    public static Map b(String str) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("REQUEST_ID", str);
        return arrayMap;
    }
}
