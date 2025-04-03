package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzy extends dzav {
    public final String a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final emxc e;
    public final engw f;
    public final engw g;
    public final emxc h;
    public final emxc i;
    public final emxc j;
    private final String k;
    private final enhk l;

    public dyzy(String str, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, String str2, emxc emxcVar4, enhk enhkVar, engw engwVar, engw engwVar2, emxc emxcVar5, emxc emxcVar6, emxc emxcVar7) {
        this.a = str;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = emxcVar3;
        this.k = str2;
        this.e = emxcVar4;
        this.l = enhkVar;
        this.f = engwVar;
        this.g = engwVar2;
        this.h = emxcVar5;
        this.i = emxcVar6;
        this.j = emxcVar7;
    }

    @Override // defpackage.dzav
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dzav
    public final emxc b() {
        return this.i;
    }

    @Override // defpackage.dzav
    public final emxc c() {
        return this.e;
    }

    @Override // defpackage.dzav
    public final emxc d() {
        return this.c;
    }

    @Override // defpackage.dzav
    public final emxc e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzav) {
            dzav dzavVar = (dzav) obj;
            if (this.a.equals(dzavVar.l()) && this.b.equals(dzavVar.a()) && this.c.equals(dzavVar.d()) && this.d.equals(dzavVar.g()) && this.k.equals(dzavVar.k()) && this.e.equals(dzavVar.c()) && this.l.equals(dzavVar.j()) && enkr.h(this.f, dzavVar.h()) && enkr.h(this.g, dzavVar.i()) && this.h.equals(dzavVar.e()) && this.i.equals(dzavVar.b()) && this.j.equals(dzavVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzav
    public final emxc f() {
        return this.j;
    }

    @Override // defpackage.dzav
    public final emxc g() {
        return this.d;
    }

    @Override // defpackage.dzav
    public final engw h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.dzav
    public final engw i() {
        return this.g;
    }

    @Override // defpackage.dzav
    public final enhk j() {
        return this.l;
    }

    @Override // defpackage.dzav
    public final String k() {
        return this.k;
    }

    @Override // defpackage.dzav
    public final String l() {
        return this.a;
    }

    public final String toString() {
        emxc emxcVar = this.j;
        emxc emxcVar2 = this.i;
        emxc emxcVar3 = this.h;
        engw engwVar = this.g;
        engw engwVar2 = this.f;
        enhk enhkVar = this.l;
        emxc emxcVar4 = this.e;
        emxc emxcVar5 = this.d;
        emxc emxcVar6 = this.c;
        return "ProfileInfo{name=" + this.a + ", a11yName=" + String.valueOf(this.b) + ", imageUrl=" + String.valueOf(emxcVar6) + ", thumbnailData=" + String.valueOf(emxcVar5) + ", contentType=" + this.k + ", groupInfo=" + String.valueOf(emxcVar4) + ", metadata=" + enhkVar.toString() + ", menuItems=" + engwVar2.toString() + ", toolbarButtons=" + engwVar.toString() + ", lighterUiConfigurations=" + String.valueOf(emxcVar3) + ", customViewContentModel=" + String.valueOf(emxcVar2) + ", serverTimestampUs=" + String.valueOf(emxcVar) + "}";
    }
}
