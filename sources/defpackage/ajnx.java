package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajnx extends ajoj {
    public final String a;
    public final int b;
    public final boolean c;

    public ajnx(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.ajoj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ajoj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajoj
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajoj) {
            ajoj ajojVar = (ajoj) obj;
            if (this.a.equals(ajojVar.b()) && this.b == ajojVar.a() && this.c == ajojVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SingleRegistrationProvisioningEventInfo{simId=" + this.a + ", subId=" + this.b + ", setupVendorIms=" + this.c + "}";
    }
}
