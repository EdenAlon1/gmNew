package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwok extends dwru {
    public final String a;
    public final long b;
    public final String c;
    public final emxc d;
    public final engw e;
    public final enhk f;
    public final emxc g;

    public dwok(String str, long j, String str2, emxc emxcVar, engw engwVar, enhk enhkVar, emxc emxcVar2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = emxcVar;
        this.e = engwVar;
        this.f = enhkVar;
        this.g = emxcVar2;
    }

    @Override // defpackage.dwru
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dwru
    public final emxc b() {
        return this.g;
    }

    @Override // defpackage.dwru
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.dwru
    public final engw d() {
        return this.e;
    }

    @Override // defpackage.dwru
    public final enhk e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwru) {
            dwru dwruVar = (dwru) obj;
            if (this.a.equals(dwruVar.f()) && this.b == dwruVar.a() && this.c.equals(dwruVar.g()) && this.d.equals(dwruVar.c()) && enkr.h(this.e, dwruVar.d()) && ennc.m(this.f, dwruVar.e()) && this.g.equals(dwruVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwru
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dwru
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "ImportFilesRequest{groupName=" + this.a + ", buildId=" + this.b + ", variantId=" + this.c + ", customPropertyOptional=" + String.valueOf(this.d) + ", updatedDataFileList=" + this.e.toString() + ", inlineFileMap=" + ennc.g(this.f) + ", accountOptional=" + String.valueOf(this.g) + "}";
    }
}
