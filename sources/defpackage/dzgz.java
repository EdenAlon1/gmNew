package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgz extends dzhb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final emxc g;
    public final emxc h;

    public dzgz(String str, String str2, String str3, String str4, String str5, String str6, emxc emxcVar, emxc emxcVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = emxcVar;
        this.h = emxcVar2;
    }

    @Override // defpackage.dzhb
    public final emxc a() {
        return this.h;
    }

    @Override // defpackage.dzhb
    public final emxc b() {
        return this.g;
    }

    @Override // defpackage.dzhb
    public final String c() {
        return this.f;
    }

    @Override // defpackage.dzhb
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dzhb
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzhb) {
            dzhb dzhbVar = (dzhb) obj;
            if (this.a.equals(dzhbVar.g()) && this.b.equals(dzhbVar.h()) && this.c.equals(dzhbVar.d()) && this.d.equals(dzhbVar.f()) && this.e.equals(dzhbVar.e()) && this.f.equals(dzhbVar.c()) && this.g.equals(dzhbVar.b()) && this.h.equals(dzhbVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzhb
    public final String f() {
        return this.d;
    }

    @Override // defpackage.dzhb
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dzhb
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.h;
        return "LinkPreview{messageText=" + this.a + ", title=" + this.b + ", description=" + this.c + ", imageUrl=" + this.d + ", domain=" + this.e + ", canonicalUrl=" + this.f + ", image=" + String.valueOf(this.g) + ", expirationTimeMs=" + String.valueOf(emxcVar) + "}";
    }
}
