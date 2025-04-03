package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eass extends east {
    public final int a;
    public final int b;
    private final String c;

    public eass(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.east
    public final int a() {
        return this.b;
    }

    @Override // defpackage.east
    public final int b() {
        return this.a;
    }

    @Override // defpackage.east
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof east) {
            east eastVar = (east) obj;
            if (this.c.equals(eastVar.c())) {
                eastVar.d();
                if (this.a == eastVar.b() && this.b == eastVar.a()) {
                    eastVar.f();
                    eastVar.e();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * (-721379959)) ^ this.a) * 1000003) ^ this.b) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "GnpMedia{url=" + this.c + ", accountName=null, width=" + this.a + ", height=" + this.b + ", shouldAuthenticateFifeUrls=false, shouldApplyFifeOptions=false}";
    }

    @Override // defpackage.east
    public final void d() {
    }

    @Override // defpackage.east
    public final void e() {
    }

    @Override // defpackage.east
    public final void f() {
    }
}
