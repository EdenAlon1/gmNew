package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqi extends bqf {
    private final int b;
    private final double c;
    private final long d;
    private final Throwable e;

    public bqi(int i, double d, long j, Throwable th) {
        this.b = i;
        this.c = d;
        this.d = j;
        this.e = th;
    }

    @Override // defpackage.bqf
    public final double a() {
        return this.c;
    }

    @Override // defpackage.bqf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bqf
    public final long c() {
        return this.d;
    }

    @Override // defpackage.bqf
    public final Throwable d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqf) {
            bqf bqfVar = (bqf) obj;
            if (this.b == bqfVar.b() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(bqfVar.a()) && this.d == bqfVar.c() && ((th = this.e) != null ? th.equals(bqfVar.d()) : bqfVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = (Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c);
        Throwable th = this.e;
        int hashCode = th == null ? 0 : th.hashCode();
        int i = this.b;
        long j = this.d;
        return ((((((int) doubleToLongBits) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.c + ", audioBytesRecorded=" + this.d + ", errorCause=" + this.e + "}";
    }
}
