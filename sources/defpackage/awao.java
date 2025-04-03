package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awao {
    public static final awap a(String str) {
        if (str != null) {
            return new awap(str);
        }
        return null;
    }

    public static final String b(awap awapVar) {
        if (awapVar != null) {
            return awapVar.a;
        }
        return null;
    }

    public static final awap c() {
        awap a = a(UUID.randomUUID().toString());
        a.getClass();
        return a;
    }
}
