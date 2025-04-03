package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oso {
    public final osb a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public oso(osb osbVar, int[] iArr, String[] strArr) {
        iArr.getClass();
        strArr.getClass();
        this.a = osbVar;
        this.b = iArr;
        this.c = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        this.d = length2 == 0 ? ffen.a : fffi.b(strArr[0]);
    }
}
