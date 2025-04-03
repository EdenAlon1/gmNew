package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlga extends dlaf {
    public final dlgu a;
    private final List b;
    private final List c;

    public dlga(List list, dlgu dlguVar, List list2) {
        this.b = list;
        this.a = dlguVar;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlga)) {
            return false;
        }
        dlga dlgaVar = (dlga) obj;
        return ffkj.e(this.b, dlgaVar.b) && ffkj.e(this.a, dlgaVar.a) && ffkj.e(this.c, dlgaVar.c);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.c.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dlga(defpackage.dlgu r2) {
        /*
            r1 = this;
            ffel r0 = defpackage.ffel.a
            r1.<init>(r0, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlga.<init>(dlgu):void");
    }
}
