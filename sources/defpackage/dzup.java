package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzup extends dzvl {
    private final dzsq a;
    private final String b;
    private final eyee c;
    private final int d;
    private final int e;
    private final String f;

    public dzup(dzsq dzsqVar, String str, eyee eyeeVar, int i, int i2, String str2) {
        this.a = dzsqVar;
        this.b = str;
        this.c = eyeeVar;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.dzvl
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dzvl
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dzvl
    public final dzsq c() {
        return this.a;
    }

    @Override // defpackage.dzvl
    public final eyee d() {
        return this.c;
    }

    @Override // defpackage.dzvl
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvl) {
            dzvl dzvlVar = (dzvl) obj;
            if (this.a.equals(dzvlVar.c()) && ((str = this.b) != null ? str.equals(dzvlVar.f()) : dzvlVar.f() == null) && this.c.equals(dzvlVar.d()) && this.d == dzvlVar.b() && this.e == dzvlVar.a() && this.f.equals(dzvlVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzvl
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.c;
        return "ImageElement{mediaId=" + this.a.toString() + ", localURI=" + this.b + ", thumbnail=" + eyeeVar.toString() + ", width=" + this.d + ", height=" + this.e + ", imageDescription=" + this.f + "}";
    }
}
