package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehw {
    public static final int a(hne hneVar, int i) {
        int i2 = hneVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = hneVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((ehv) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ehv) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
