package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzq extends evae {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final double e;
    public final engw f;

    public euzq(boolean z, int i, float f, float f2, double d, engw engwVar) {
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = d;
        this.f = engwVar;
    }

    @Override // defpackage.evae
    public final double a() {
        return this.e;
    }

    @Override // defpackage.evae
    public final float b() {
        return this.c;
    }

    @Override // defpackage.evae
    public final float c() {
        return this.d;
    }

    @Override // defpackage.evae
    public final int d() {
        return this.b;
    }

    @Override // defpackage.evae
    public final engw e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evae) {
            evae evaeVar = (evae) obj;
            if (this.a == evaeVar.f() && this.b == evaeVar.d() && Float.floatToIntBits(this.c) == Float.floatToIntBits(evaeVar.b()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(evaeVar.c()) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(evaeVar.a()) && enkr.h(this.f, evaeVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.evae
    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "GrpcRetryConfig{enabled=" + this.a + ", maxAttempts=" + this.b + ", initialBackoffSeconds=" + this.c + ", maxBackoffSeconds=" + this.d + ", backoffMultiplier=" + this.e + ", retryableStatusCodes=" + this.f.toString() + "}";
    }
}
