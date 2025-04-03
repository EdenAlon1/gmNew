package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbe {
    public static void a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
