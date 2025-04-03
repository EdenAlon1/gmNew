package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtua {
    private static final Map a = new HashMap();

    public static synchronized Integer a(String str) {
        Integer num;
        synchronized (dtua.class) {
            num = (Integer) a.get(str);
        }
        return num;
    }

    public static synchronized void b(String str, Integer num) {
        synchronized (dtua.class) {
            a.put(str, num);
        }
    }
}
