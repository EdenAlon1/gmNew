package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealy {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ealy() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ealy.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ealy)) {
            return false;
        }
        ealy ealyVar = (ealy) obj;
        return this.a == ealyVar.a && this.b == ealyVar.b && this.c == ealyVar.c;
    }

    public final int hashCode() {
        return (((ealx.a(this.a) * 31) + ealx.a(this.b)) * 31) + ealx.a(this.c);
    }

    public final String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ")";
    }

    public ealy(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ ealy(boolean z, boolean z2, boolean z3, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 & ((i & 2) == 0), z3 & ((i & 4) == 0));
    }
}
