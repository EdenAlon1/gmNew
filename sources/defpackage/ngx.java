package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngx extends ngp {
    public final long a;
    public final long b;

    public ngx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static long d(luv luvVar, long j) {
        long j2 = luvVar.j();
        if ((128 & j2) != 0) {
            return 8589934591L & ((((j2 & 1) << 32) | luvVar.r()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ngp
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }
}
