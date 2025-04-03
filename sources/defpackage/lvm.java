package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvm implements lra {
    public final long a;
    public final long b;
    public final long c;

    public lvm(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
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
        if (!(obj instanceof lvm)) {
            return false;
        }
        lvm lvmVar = (lvm) obj;
        return this.a == lvmVar.a && this.b == lvmVar.b && this.c == lvmVar.c;
    }

    public final int hashCode() {
        return ((((ermr.a(this.a) + 527) * 31) + ermr.a(this.b)) * 31) + ermr.a(this.c);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
