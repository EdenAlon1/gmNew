package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecng extends ecnj {
    private final long a;
    private final enip b;
    private final int c = 2;

    public ecng(int i, long j, enip enipVar) {
        this.a = j;
        this.b = enipVar;
    }

    @Override // defpackage.ecnj
    public final long d() {
        return this.a;
    }

    @Override // defpackage.ecnj
    public final enip e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecnj) {
            ecnj ecnjVar = (ecnj) obj;
            ecnjVar.f();
            if (this.a == ecnjVar.d() && this.b.equals(ecnjVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecnj
    public final int f() {
        return 2;
    }

    public final int hashCode() {
        int i = ((enpd) this.b).c;
        long j = this.a;
        return i ^ ((((int) (j ^ (j >>> 32))) ^ (-723379965)) * 1000003);
    }

    public final String toString() {
        return "DebugMemoryConfigurations{enablement=" + echm.a(2) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + String.valueOf(this.b) + "}";
    }
}
