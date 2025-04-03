package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgww extends dgxb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public dgww(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
    }

    @Override // defpackage.dgxb
    public final int a() {
        return this.h;
    }

    @Override // defpackage.dgxb
    public final String b() {
        return this.g;
    }

    @Override // defpackage.dgxb
    public final String c() {
        return this.b;
    }

    @Override // defpackage.dgxb
    public final String d() {
        return this.d;
    }

    @Override // defpackage.dgxb
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxb) {
            dgxb dgxbVar = (dgxb) obj;
            if (this.a.equals(dgxbVar.e()) && this.b.equals(dgxbVar.c()) && this.c.equals(dgxbVar.h()) && this.d.equals(dgxbVar.d()) && this.e.equals(dgxbVar.g()) && this.f.equals(dgxbVar.f()) && this.g.equals(dgxbVar.b()) && this.h == dgxbVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dgxb
    public final String f() {
        return this.f;
    }

    @Override // defpackage.dgxb
    public final String g() {
        return this.e;
    }

    @Override // defpackage.dgxb
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "BuildInfo{fingerprint=" + this.a + ", brand=" + this.b + ", product=" + this.c + ", device=" + this.d + ", model=" + this.e + ", manufacturer=" + this.f + ", baseOs=" + this.g + ", sdkInt=" + this.h + "}";
    }
}
