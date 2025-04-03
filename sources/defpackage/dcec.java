package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcec extends dcgn {
    private final String a;
    private final int b;
    private final int c;
    private final epsw d;
    private final long e;

    public dcec(String str, int i, int i2, epsw epswVar, long j) {
        this.a = str;
        this.b = i;
        this.c = i2;
        if (epswVar == null) {
            throw new NullPointerException("Null cameraCaptureInformation");
        }
        this.d = epswVar;
        this.e = j;
    }

    @Override // defpackage.dcgn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dcgn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dcgn
    public final long c() {
        return this.e;
    }

    @Override // defpackage.dcgn
    public final epsw d() {
        return this.d;
    }

    @Override // defpackage.dcgn
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcgn) {
            dcgn dcgnVar = (dcgn) obj;
            if (this.a.equals(dcgnVar.e()) && this.b == dcgnVar.b() && this.c == dcgnVar.a() && this.d.equals(dcgnVar.d()) && this.e == dcgnVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "MiniCameraCapture{contentType=" + this.a + ", width=" + this.b + ", height=" + this.c + ", cameraCaptureInformation=" + this.d.toString() + ", modifiedTimestamp=" + this.e + "}";
    }
}
