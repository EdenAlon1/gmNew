package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqt {
    public final List a;
    public final List b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pqt() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqt.<init>():void");
    }

    public static final pqt a(String... strArr) {
        return new pqt(null, ffdo.L(strArr), 11);
    }

    public /* synthetic */ pqt(List list, List list2, int i) {
        list = (i & 1) != 0 ? ffel.a : list;
        ffel ffelVar = (i & 2) != 0 ? ffel.a : null;
        list2 = (i & 4) != 0 ? ffel.a : list2;
        list.getClass();
        ffelVar.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }
}
