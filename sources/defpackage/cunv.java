package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunv {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        ffew.g(new ffcf(dlfs.a, Float.valueOf(0.0f)), new ffcf(dlfs.b, Float.valueOf(0.5f)), new ffcf(dlfs.c, Float.valueOf(1.0f)));
        b = ffew.g(new ffcf(dlfs.a, cula.a), new ffcf(dlfs.b, cula.b), new ffcf(dlfs.c, cula.c));
    }

    public static final cula a(dlfs dlfsVar) {
        return (cula) Map.EL.getOrDefault(b, dlfsVar, cula.a);
    }
}
