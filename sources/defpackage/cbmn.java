package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmn extends cbpb {
    private final cbnb a;
    private final engw b;
    private final engw c;
    private final engw d;
    private final engw e;
    private final engw f;
    private final engw g;
    private final cbnb h;

    public cbmn(cbnb cbnbVar, engw engwVar, engw engwVar2, engw engwVar3, engw engwVar4, engw engwVar5, engw engwVar6, cbnb cbnbVar2) {
        this.a = cbnbVar;
        this.b = engwVar;
        this.c = engwVar2;
        this.d = engwVar3;
        this.e = engwVar4;
        this.f = engwVar5;
        this.g = engwVar6;
        this.h = cbnbVar2;
    }

    @Override // defpackage.cbpb
    public final cbnb a() {
        return this.a;
    }

    @Override // defpackage.cbpb
    public final cbnb b() {
        return this.h;
    }

    @Override // defpackage.cbpb
    public final engw c() {
        return this.g;
    }

    @Override // defpackage.cbpb
    public final engw d() {
        return this.c;
    }

    @Override // defpackage.cbpb
    public final engw e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbpb) {
            cbpb cbpbVar = (cbpb) obj;
            if (this.a.equals(cbpbVar.a()) && enkr.h(this.b, cbpbVar.g()) && enkr.h(this.c, cbpbVar.d()) && enkr.h(this.d, cbpbVar.h()) && enkr.h(this.e, cbpbVar.e()) && enkr.h(this.f, cbpbVar.f()) && enkr.h(this.g, cbpbVar.c()) && this.h.equals(cbpbVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cbpb
    public final engw f() {
        return this.f;
    }

    @Override // defpackage.cbpb
    public final engw g() {
        return this.b;
    }

    @Override // defpackage.cbpb
    public final engw h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        cbnb cbnbVar = this.h;
        engw engwVar = this.g;
        engw engwVar2 = this.f;
        engw engwVar3 = this.e;
        engw engwVar4 = this.d;
        engw engwVar5 = this.c;
        engw engwVar6 = this.b;
        return "SearchResults{conversations=" + this.a.toString() + ", messageIds=" + engwVar6.toString() + ", images=" + engwVar5.toString() + ", videos=" + engwVar4.toString() + ", links=" + engwVar3.toString() + ", locations=" + engwVar2.toString() + ", contacts=" + engwVar.toString() + ", starredTexts=" + cbnbVar.toString() + "}";
    }
}
