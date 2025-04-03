package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngo extends ngp {
    public final long a;
    public final long b;

    public ngo(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.ngp
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }
}
