package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eclu extends ecli {
    private final String a = "";

    @Override // defpackage.ecli
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecli) {
            ecli ecliVar = (ecli) obj;
            ecliVar.e();
            if (this.a.equals(ecliVar.d())) {
                ecliVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=DEFAULT, reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    @Override // defpackage.ecli
    public final void e() {
    }

    @Override // defpackage.ecli
    public final void f() {
    }
}
