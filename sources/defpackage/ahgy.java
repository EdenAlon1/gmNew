package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahgy extends ahhz {
    private final boolean a;
    private final boolean b;

    public ahgy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ahhz
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.ahhz
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahhz) {
            ahhz ahhzVar = (ahhz) obj;
            if (this.a == ahhzVar.b() && this.b == ahhzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuperSortSettingsData{superSortEnabled=" + this.a + ", otpAutoDeleteEnabled=" + this.b + "}";
    }
}
