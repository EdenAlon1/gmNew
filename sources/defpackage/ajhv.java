package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajhv {
    public static int a(int i) {
        return i - 2;
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }
}
