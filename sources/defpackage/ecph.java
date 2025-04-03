package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecph extends ecpj {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final engw e;
    private final int f;

    public ecph(int i, int i2, int i3, int i4, engw engwVar, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = engwVar;
        this.f = i5;
    }

    @Override // defpackage.ecpj
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ecpj
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecpj) {
            ecpj ecpjVar = (ecpj) obj;
            if (this.a == ecpjVar.e() && this.b == ecpjVar.d() && this.c == ecpjVar.f() && this.d == ecpjVar.g() && enkr.h(this.e, ecpjVar.h()) && this.f == ecpjVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecpj
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ecpj
    public final int g() {
        return this.d;
    }

    @Override // defpackage.ecpj
    public final engw h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    @Override // defpackage.ecpj
    public final int i() {
        return this.f;
    }

    public final String toString() {
        return "StallConfigurations{initialMonitoringDelayMs=" + this.a + ", checkForResponseIntervalMs=" + this.b + ", midStallCheckForResponseIntervalMs=" + this.c + ", postToMainIntervalMs=" + this.d + ", stallThresholdsMs=" + this.e.toString() + ", enablement=" + echm.a(this.f) + "}";
    }
}
