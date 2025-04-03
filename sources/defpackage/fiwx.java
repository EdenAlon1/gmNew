package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwx {
    private static final fiyi a;

    static {
        fiww fiwwVar = new fiww();
        a = fiwwVar;
        fiwwVar.d(1, "IN");
        fiwwVar.d(3, "CH");
        fiwwVar.e(3, "CHAOS");
        fiwwVar.d(4, "HS");
        fiwwVar.e(4, "HESIOD");
        fiwwVar.d(254, "NONE");
        fiwwVar.d(PrivateKeyType.INVALID, "ANY");
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i < 0 || i > 65535) {
            throw new fixs(i);
        }
    }
}
