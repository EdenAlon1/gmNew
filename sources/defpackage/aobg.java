package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aobg extends aoig {
    public final esfh a;
    public final int b;
    private final String c;

    public aobg(esfh esfhVar, int i, String str) {
        if (esfhVar == null) {
            throw new NullPointerException("Null phoneNumber");
        }
        this.a = esfhVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.aoig
    public final esfh a() {
        return this.a;
    }

    @Override // defpackage.aoig
    public final String b() {
        return this.c;
    }

    @Override // defpackage.aoig
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoig) {
            aoig aoigVar = (aoig) obj;
            if (this.a.equals(aoigVar.a()) && this.b == aoigVar.c()) {
                aoigVar.f();
                aoigVar.e();
                aoigVar.d();
                String str = this.c;
                if (str != null ? str.equals(aoigVar.b()) : aoigVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.c;
        return (((((((((hashCode * 1000003) ^ this.b) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NumberAndValidity{phoneNumber=" + this.a.toString() + ", validity=" + esfj.a(this.b) + ", isPhoneWord=false, isDigitShortCode=false, isAlphaShortCode=false, parseRegion=" + this.c + "}";
    }

    @Override // defpackage.aoig
    public final void d() {
    }

    @Override // defpackage.aoig
    public final void e() {
    }

    @Override // defpackage.aoig
    public final void f() {
    }
}
