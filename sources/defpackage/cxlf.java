package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxlf {
    public final ffix a;
    public final ffix b;

    public cxlf(ffix ffixVar, ffix ffixVar2) {
        this.a = ffixVar;
        this.b = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxlf)) {
            return false;
        }
        cxlf cxlfVar = (cxlf) obj;
        return ffkj.e(this.a, cxlfVar.a) && ffkj.e(this.b, cxlfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TurnOffRcsScreenUiData(onPositiveClick=" + this.a + ", onNegativeClick=" + this.b + ")";
    }

    public cxlf() {
        this(new ffix() { // from class: cxld
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffix() { // from class: cxle
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
