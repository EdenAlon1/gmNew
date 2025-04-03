package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwf {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        new HashSet(Arrays.asList(Curve25519.NATIVE, "unity"));
        b = new HashMap();
        new ehvt("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        synchronized (ehwf.class) {
            map = b;
            map.put(Curve25519.JAVA, 20002);
        }
        return map;
    }
}
