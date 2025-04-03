package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgf {
    private static final List e = ffdx.g("image/*", "video/*");
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dqgf() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqgf.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqgf)) {
            return false;
        }
        dqgf dqgfVar = (dqgf) obj;
        return ffkj.e(this.a, dqgfVar.a) && this.b == dqgfVar.b && this.c == dqgfVar.c && this.d == dqgfVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.d;
        return ((((hashCode + dqge.a(this.b)) * 31) + dqge.a(this.c)) * 31) + dqge.a(z);
    }

    public final String toString() {
        return "SystemContentPickerConfiguration(allowedMimeTypes=" + this.a + ", areMultiplePicksAllowed=" + this.b + ", shouldShowFab=" + this.c + ", shouldShowTile=" + this.d + ")";
    }

    public /* synthetic */ dqgf(boolean z, boolean z2, int i) {
        List list = (i & 1) != 0 ? e : null;
        boolean z3 = (i & 2) != 0;
        boolean z4 = z & ((i & 4) == 0);
        boolean z5 = (i & 8) == 0;
        list.getClass();
        this.a = list;
        this.b = z3;
        this.c = z4;
        this.d = z2 & z5;
    }
}
