package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvt {
    public static final int a(fbcx fbcxVar) {
        int ordinal = fbcxVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 5) {
            return 4;
        }
        Objects.toString(fbcxVar);
        throw new IllegalArgumentException("Unexpected action type ".concat(fbcxVar.toString()));
    }

    public static final int b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1 || i == 2) {
            return 4;
        }
        return i != 3 ? 1 : 5;
    }
}
