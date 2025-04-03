package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzso extends dzsr {
    private final dzsq a;
    private final String b;
    private final emxc c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public dzso(dzsq dzsqVar, String str, emxc emxcVar, int i, int i2, int i3, int i4) {
        this.a = dzsqVar;
        this.b = str;
        this.c = emxcVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.dzsr
    public final int a() {
        return this.g;
    }

    @Override // defpackage.dzsr
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dzsr
    public final int c() {
        return this.f;
    }

    @Override // defpackage.dzsr
    public final int d() {
        return this.d;
    }

    @Override // defpackage.dzsr
    public final dzsq e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsr) {
            dzsr dzsrVar = (dzsr) obj;
            dzsq dzsqVar = this.a;
            if (dzsqVar != null ? dzsqVar.equals(dzsrVar.e()) : dzsrVar.e() == null) {
                String str = this.b;
                if (str != null ? str.equals(dzsrVar.g()) : dzsrVar.g() == null) {
                    if (this.c.equals(dzsrVar.f()) && this.d == dzsrVar.d() && this.e == dzsrVar.b() && this.f == dzsrVar.c() && this.g == dzsrVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dzsr
    public final emxc f() {
        return this.c;
    }

    @Override // defpackage.dzsr
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        dzsq dzsqVar = this.a;
        int hashCode = dzsqVar == null ? 0 : dzsqVar.hashCode();
        String str = this.b;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "PhotoData{mediaId=" + String.valueOf(this.a) + ", localURI=" + this.b + ", thumbnail=" + emxcVar.toString() + ", width=" + this.d + ", height=" + this.e + ", size=" + this.f + ", downloadStatus=" + this.g + "}";
    }
}
