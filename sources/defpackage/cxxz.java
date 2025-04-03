package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxz extends cxyi {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public cxxz(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.cxyi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cxyi
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.cxyi
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.cxyi
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxyi) {
            cxyi cxyiVar = (cxyi) obj;
            if (this.a == cxyiVar.a() && this.b == cxyiVar.c() && this.c == cxyiVar.d() && this.d == cxyiVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        int i2 = this.a;
        return ((((i ^ ((i2 ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "Priority{getWeight=" + this.a + ", canBeShownAgain=" + this.b + ", canShowAfterAnotherBanner=" + this.c + ", anyOtherBannersCanShowAfterThis=" + this.d + "}";
    }
}
