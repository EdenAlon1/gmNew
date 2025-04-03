package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzy {
    public ipl a;
    public ipl b;
    public final int c = 2;
    private final int d = 0;
    private final int e = 0;

    public final void a(inx inxVar, inx inxVar2, long j) {
        long b = eaz.b(j);
        if (inxVar != null) {
            dzt.d(inxVar, dzt.e(inxVar, jzk.a(b)));
            this.a = inxVar instanceof ipl ? (ipl) inxVar : null;
        }
        if (inxVar2 != null) {
            dzt.d(inxVar2, dzt.e(inxVar2, jzk.a(b)));
            this.b = inxVar2 instanceof ipl ? (ipl) inxVar2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzy)) {
            return false;
        }
        dzy dzyVar = (dzy) obj;
        int i = dzyVar.c;
        int i2 = dzyVar.d;
        int i3 = dzyVar.e;
        return true;
    }

    public final int hashCode() {
        return 1922;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
