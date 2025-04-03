package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figz {
    private final Map a;

    public figz(Map map) {
        this.a = map;
    }

    public static int[] b(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i = 0; i < countTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.a(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }

    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.a);
    }
}
