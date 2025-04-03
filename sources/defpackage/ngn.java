package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngn implements lra {
    public final float a;
    public final int b;

    public ngn(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngn ngnVar = (ngn) obj;
            if (this.a == ngnVar.a && this.b == ngnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((ermj.a(this.a) + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
