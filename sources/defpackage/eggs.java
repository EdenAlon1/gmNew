package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggs extends egfk {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final engw e;
    private final engw f;
    private final enhk g;
    private final emxc h;
    private final engw i;

    public eggs(String str, String str2, String str3, long j, engw engwVar, engw engwVar2, enhk enhkVar, emxc emxcVar, engw engwVar3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = engwVar;
        this.f = engwVar2;
        this.g = enhkVar;
        this.h = emxcVar;
        this.i = engwVar3;
    }

    @Override // defpackage.egfk
    public final long a() {
        return this.d;
    }

    @Override // defpackage.egfk
    public final emxc c() {
        return this.h;
    }

    @Override // defpackage.egfk
    public final engw d() {
        return this.i;
    }

    @Override // defpackage.egfk
    public final engw e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfk) {
            egfk egfkVar = (egfk) obj;
            if (this.a.equals(egfkVar.i()) && this.b.equals(egfkVar.h()) && this.c.equals(egfkVar.j()) && this.d == egfkVar.a() && enkr.h(this.e, egfkVar.f()) && enkr.h(this.f, egfkVar.e()) && ennc.m(this.g, egfkVar.g()) && this.h.equals(egfkVar.c()) && enkr.h(this.i, egfkVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egfk
    public final engw f() {
        return this.e;
    }

    @Override // defpackage.egfk
    public final enhk g() {
        return this.g;
    }

    @Override // defpackage.egfk
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.egfk
    public final String i() {
        return this.a;
    }

    @Override // defpackage.egfk
    public final String j() {
        return this.c;
    }

    public final String toString() {
        return "ArtPhoto{name=" + this.a + ", accessibilityLabel=" + this.b + ", url=" + this.c + ", id=" + this.d + ", presets=" + this.e.toString() + ", frames=" + this.f.toString() + ", layers=" + ennc.g(this.g) + ", errorState=" + String.valueOf(this.h) + ", eventLogs=" + this.i.toString() + "}";
    }
}
