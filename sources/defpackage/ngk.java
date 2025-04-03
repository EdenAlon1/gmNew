package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngk implements lra {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ngk(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
            ngk ngkVar = (ngk) obj;
            if (this.a == ngkVar.a && this.b == ngkVar.b && this.c == ngkVar.c && this.d == ngkVar.d && this.e == ngkVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a = ermr.a(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((a * 31) + ermr.a(this.b)) * 31) + ermr.a(this.c)) * 31) + ermr.a(j2)) * 31) + ermr.a(j);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
