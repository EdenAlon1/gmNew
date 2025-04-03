package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxe {
    public final cui a;
    public final cxa b;
    public final csd c;
    public final cup d;
    public final boolean e;
    public final Map f;

    public cxe() {
        this(null, null, null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxe)) {
            return false;
        }
        cxe cxeVar = (cxe) obj;
        return ffkj.e(this.a, cxeVar.a) && ffkj.e(this.b, cxeVar.b) && ffkj.e(this.c, cxeVar.c) && ffkj.e(this.d, cxeVar.d) && this.e == cxeVar.e && ffkj.e(this.f, cxeVar.f);
    }

    public final int hashCode() {
        cui cuiVar = this.a;
        int hashCode = cuiVar == null ? 0 : cuiVar.hashCode();
        cxa cxaVar = this.b;
        int hashCode2 = ((hashCode * 31) + (cxaVar == null ? 0 : cxaVar.hashCode())) * 31;
        csd csdVar = this.c;
        int hashCode3 = (hashCode2 + (csdVar == null ? 0 : csdVar.hashCode())) * 31;
        cup cupVar = this.d;
        return ((((hashCode3 + (cupVar != null ? cupVar.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public cxe(cui cuiVar, cxa cxaVar, csd csdVar, cup cupVar, boolean z, Map map) {
        this.a = cuiVar;
        this.b = cxaVar;
        this.c = csdVar;
        this.d = cupVar;
        this.e = z;
        this.f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ cxe(defpackage.cui r8, defpackage.cxa r9, defpackage.csd r10, defpackage.cup r11, boolean r12, java.util.Map r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 32
            if (r0 == 0) goto L6
            ffem r13 = defpackage.ffem.a
        L6:
            r6 = r13
            r13 = r14 & 16
            r0 = r14 & 8
            r1 = r14 & 4
            r2 = r14 & 2
            r3 = 1
            if (r13 == 0) goto L14
            r13 = 0
            goto L15
        L14:
            r13 = r3
        L15:
            r14 = r14 & r3
            r5 = r13 & r12
            r12 = 0
            if (r0 == 0) goto L1d
            r4 = r12
            goto L1e
        L1d:
            r4 = r11
        L1e:
            if (r1 == 0) goto L21
            r10 = r12
        L21:
            if (r2 == 0) goto L25
            r2 = r12
            goto L26
        L25:
            r2 = r9
        L26:
            if (r3 != r14) goto L2a
            r1 = r12
            goto L2b
        L2a:
            r1 = r8
        L2b:
            r0 = r7
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxe.<init>(cui, cxa, csd, cup, boolean, java.util.Map, int):void");
    }
}
