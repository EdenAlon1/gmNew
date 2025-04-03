package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknd {
    public final akzt a;

    public aknd(akzt akztVar) {
        this.a = akztVar;
    }

    public static int a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i3;
    }
}
