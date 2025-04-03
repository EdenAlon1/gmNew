package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecpx extends ecpy {
    private final emxc a;
    private final emxc b;

    public ecpx(emxc emxcVar, emxc emxcVar2) {
        this.a = emxcVar;
        this.b = emxcVar2;
    }

    @Override // defpackage.ecpy
    public final emxc d() {
        return this.b;
    }

    @Override // defpackage.ecpy
    public final emxc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecpy) {
            ecpy ecpyVar = (ecpy) obj;
            ecpyVar.f();
            if (this.a.equals(ecpyVar.e()) && this.b.equals(ecpyVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 395873938;
    }

    public final String toString() {
        return "StartupConfigurations{enablement=DEFAULT, metricExtensionProvider=Optional.absent(), customTimestampProvider=Optional.absent()}";
    }

    @Override // defpackage.ecpy
    public final void f() {
    }
}
