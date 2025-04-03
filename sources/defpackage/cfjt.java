package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfjt {
    public final ceve a;
    public final String b;
    public final List c;

    public cfjt(ceve ceveVar, String str, List list) {
        str.getClass();
        this.a = ceveVar;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfjr
            if (r0 == 0) goto L13
            r0 = r6
            cfjr r0 = (defpackage.cfjr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfjr r0 = new cfjr
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ceve r6 = r5.a
            cfjs r2 = new cfjs
            r2.<init>(r5)
            java.util.List r4 = r5.c
            engw r4 = defpackage.engq.a(r4)
            elfl r6 = r6.r(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfjt.a(ffgu):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfjt)) {
            return false;
        }
        cfjt cfjtVar = (cfjt) obj;
        return ffkj.e(this.a, cfjtVar.a) && ffkj.e(this.b, cfjtVar.b) && ffkj.e(this.c, cfjtVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Tranche(handler=" + this.a + ", queueName=" + this.b + ", items=" + this.c + ")";
    }
}
