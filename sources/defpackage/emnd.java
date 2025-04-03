package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emnd extends emnh {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final engw e;
    private final engw f;
    private final fceq g;

    public emnd(String str, String str2, String str3, String str4, engw engwVar, engw engwVar2, fceq fceqVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = engwVar;
        this.f = engwVar2;
        this.g = fceqVar;
    }

    @Override // defpackage.emnh
    public final engw a() {
        return this.f;
    }

    @Override // defpackage.emnh
    public final engw b() {
        return this.e;
    }

    @Override // defpackage.emnh
    public final fceq c() {
        return this.g;
    }

    @Override // defpackage.emnh
    public final String d() {
        return this.b;
    }

    @Override // defpackage.emnh
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emnh) {
            emnh emnhVar = (emnh) obj;
            if (this.a.equals(emnhVar.f()) && this.b.equals(emnhVar.d()) && this.c.equals(emnhVar.e()) && this.d.equals(emnhVar.g()) && enkr.h(this.e, emnhVar.b()) && enkr.h(this.f, emnhVar.a()) && this.g.equals(emnhVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.emnh
    public final String f() {
        return this.a;
    }

    @Override // defpackage.emnh
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        fceq fceqVar = this.g;
        engw engwVar = this.f;
        return "Entity{text=" + this.a + ", canonicalText=" + this.b + ", categoryHrid=" + this.c + ", type=" + this.d + ", contactAnnotations=" + String.valueOf(this.e) + ", annotations=" + String.valueOf(engwVar) + ", amount=" + fceqVar.toString() + "}";
    }
}
