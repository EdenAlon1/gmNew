package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrc {
    public static final Set a;
    private static final Set b;
    private static final Set c;

    static {
        Set b2 = fffi.b(100);
        b = b2;
        Set d = fffi.d(1, 2, 11);
        c = d;
        a = fffi.g(b2, d);
    }
}
