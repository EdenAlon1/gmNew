package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrq {
    public static final int a(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return 3;
            }
        } else if (z) {
            return 1;
        }
        return !z2 ? 0 : 2;
    }

    public static final int b(jsy jsyVar, int i) {
        return a(jsyVar.compareTo(jsy.c) >= 0, jss.b(i, 1));
    }
}
