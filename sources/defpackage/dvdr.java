package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdr {
    public static final dvur a(evxg evxgVar) {
        if (evxgVar != null) {
            int ordinal = evxgVar.ordinal();
            if (ordinal == 1) {
                return dvur.ACTION_POSITIVE;
            }
            if (ordinal == 2) {
                return dvur.ACTION_NEGATIVE;
            }
            if (ordinal == 3) {
                return dvur.ACTION_DISMISS;
            }
            if (ordinal == 4) {
                return dvur.ACTION_ACKNOWLEDGE;
            }
        }
        return dvur.ACTION_UNKNOWN;
    }

    public static final int b(evzd evzdVar) {
        evzdVar.getClass();
        int i = evzdVar.c;
        if (i == 5) {
            return 6;
        }
        if (i == 3) {
            return 4;
        }
        int a = evxr.a((i == 2 ? (evxu) evzdVar.d : evxu.a).m);
        if (a != 0 && a == 5) {
            return 3;
        }
        int i2 = evzdVar.c;
        int a2 = evxr.a((i2 == 2 ? (evxu) evzdVar.d : evxu.a).m);
        if (a2 != 0 && a2 == 7) {
            return 2;
        }
        if (i2 == 6) {
            return 5;
        }
        if (i2 == 11) {
            return 7;
        }
        evzc b = evzc.b(evzdVar.e);
        if (b == null) {
            b = evzc.UITYPE_NONE;
        }
        return b == evzc.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG ? 8 : 1;
    }
}
