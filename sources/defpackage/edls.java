package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edls extends edps {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final edmn f;

    public edls(String str, int i, int i2, String str2, String str3, edmn edmnVar) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str2 == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.d = str2;
        this.e = str3;
        this.f = edmnVar;
    }

    @Override // defpackage.edps
    public final int a() {
        return this.b;
    }

    @Override // defpackage.edps
    public final int b() {
        return this.c;
    }

    @Override // defpackage.edps
    public final edmn c() {
        return this.f;
    }

    @Override // defpackage.edps
    public final String d() {
        return this.a;
    }

    @Override // defpackage.edps
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        edmn edmnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edps) {
            edps edpsVar = (edps) obj;
            if (this.a.equals(edpsVar.d()) && this.b == edpsVar.a() && this.c == edpsVar.b() && this.d.equals(edpsVar.f()) && ((str = this.e) != null ? str.equals(edpsVar.e()) : edpsVar.e() == null) && ((edmnVar = this.f) != null ? edmnVar.equals(edpsVar.c()) : edpsVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edps
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        edmn edmnVar = this.f;
        return hashCode2 ^ (edmnVar != null ? edmnVar.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoMetadata{attributions=" + this.a + ", height=" + this.b + ", width=" + this.c + ", photoReference=" + this.d + ", name=" + this.e + ", authorAttributions=" + String.valueOf(this.f) + "}";
    }
}
