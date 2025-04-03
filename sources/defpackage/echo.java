package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class echo extends echt {
    private final echu a;
    private final int b;

    public echo(int i, echu echuVar) {
        this.b = i;
        this.a = echuVar;
    }

    @Override // defpackage.echt
    public final echu d() {
        return this.a;
    }

    @Override // defpackage.echt
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof echt) {
            echt echtVar = (echt) obj;
            if (this.b == echtVar.e()) {
                echtVar.f();
                if (this.a.equals(echtVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + echm.a(this.b) + ", chargeCounterEnabled=false, metricExtensionProvider=" + this.a.toString() + "}";
    }

    @Override // defpackage.echt
    public final void f() {
    }
}
