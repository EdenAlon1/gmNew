package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cptn {
    public static int a(int i) {
        return b(Optional.of(Integer.valueOf(i)));
    }

    static int b(Optional optional) {
        if (optional.isEmpty()) {
            return 1;
        }
        int intValue = ((Integer) optional.get()).intValue();
        if (intValue <= 0) {
            return 2;
        }
        if (intValue < 2) {
            return 3;
        }
        if (intValue < 3) {
            return 4;
        }
        if (intValue < 4) {
            return 5;
        }
        if (intValue < 5) {
            return 6;
        }
        if (intValue < 6) {
            return 7;
        }
        if (intValue < 7) {
            return 8;
        }
        if (intValue < 8) {
            return 9;
        }
        if (intValue < 9) {
            return 10;
        }
        if (intValue < 10) {
            return 11;
        }
        if (intValue < 11) {
            return 12;
        }
        if (intValue < 101) {
            return 13;
        }
        if (intValue < 1001) {
            return 103;
        }
        if (intValue < 5001) {
            return 105;
        }
        if (intValue < 10001) {
            return 106;
        }
        return intValue < 50001 ? 108 : 113;
    }
}
