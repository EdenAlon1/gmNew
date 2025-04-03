package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzur extends dzvn {
    public final dzvq a;
    private final String b;
    private final eyee c;
    private final int d;
    private final int e;
    private final String f;

    public dzur(dzvq dzvqVar, String str, eyee eyeeVar, int i, int i2, String str2) {
        this.a = dzvqVar;
        this.b = str;
        this.c = eyeeVar;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.dzvn
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dzvn
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dzvn
    public final dzvq c() {
        return this.a;
    }

    @Override // defpackage.dzvn
    public final eyee d() {
        return this.c;
    }

    @Override // defpackage.dzvn
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzvn) {
            dzvn dzvnVar = (dzvn) obj;
            if (this.a.equals(dzvnVar.c()) && ((str = this.b) != null ? str.equals(dzvnVar.e()) : dzvnVar.e() == null) && this.c.equals(dzvnVar.d()) && this.d == dzvnVar.b() && this.e == dzvnVar.a() && this.f.equals(dzvnVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzvn
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.c;
        return "MediaElement{mediaSource=" + String.valueOf(this.a) + ", localURI=" + this.b + ", thumbnail=" + String.valueOf(eyeeVar) + ", width=" + this.d + ", height=" + this.e + ", mediaDescription=" + this.f + "}";
    }
}
