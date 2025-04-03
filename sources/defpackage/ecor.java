package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecor extends ecot {
    private final int a;
    private final boolean b;
    private final emxc c;
    private final int d;

    public ecor(int i, int i2, boolean z, emxc emxcVar) {
        this.d = i;
        this.a = i2;
        this.b = z;
        this.c = emxcVar;
    }

    @Override // defpackage.ecot
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ecot
    public final emxc e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecot) {
            ecot ecotVar = (ecot) obj;
            if (this.d == ecotVar.g() && this.a == ecotVar.d()) {
                ecotVar.h();
                if (this.b == ecotVar.f() && this.c.equals(ecotVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ecot
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.ecot
    public final int g() {
        return this.d;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ ((((this.d ^ 1000003) * 1000003) ^ this.a) * (-721379959))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + echm.a(this.d) + ", batchSize=" + this.a + ", urlSanitizer=null, enableUrlAutoSanitization=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + "}";
    }

    @Override // defpackage.ecot
    public final void h() {
    }
}
