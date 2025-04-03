package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drkd extends drkg<drld, drkd> {
    private final boolean a;
    private final boolean b;

    public drkd() {
        this(3);
    }

    @Override // defpackage.drkg
    public final /* bridge */ /* synthetic */ boolean a(drka drkaVar) {
        drld drldVar = (drld) drkaVar;
        if (ffkj.e(drldVar, drla.a)) {
            return this.a;
        }
        if (ffkj.e(drldVar, drko.a)) {
            return this.b;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drkd)) {
            return false;
        }
        drkd drkdVar = (drkd) obj;
        return this.a == drkdVar.a && this.b == drkdVar.b;
    }

    public final int hashCode() {
        return (drkc.a(this.a) * 31) + drkc.a(this.b);
    }

    public final String toString() {
        return "Image(supportsWebP=" + this.a + ", supportsHEIF=" + this.b + ")";
    }

    public drkd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ drkd(int i) {
        this(1 == (i & 1), false);
    }
}
