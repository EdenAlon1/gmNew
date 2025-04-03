package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbyb extends dbyf {
    private final String a;
    private final enip b;
    private final enip c;
    private final enip d;
    private final enip e;
    private final enip f;
    private final enip g;
    private final enip h;
    private final enip i;

    public dbyb(String str, enip enipVar, enip enipVar2, enip enipVar3, enip enipVar4, enip enipVar5, enip enipVar6, enip enipVar7, enip enipVar8) {
        this.a = str;
        this.b = enipVar;
        this.c = enipVar2;
        this.d = enipVar3;
        this.e = enipVar4;
        this.f = enipVar5;
        this.g = enipVar6;
        this.h = enipVar7;
        this.i = enipVar8;
    }

    @Override // defpackage.dbyf
    public final enip a() {
        return this.d;
    }

    @Override // defpackage.dbyf
    public final enip b() {
        return this.c;
    }

    @Override // defpackage.dbyf
    public final enip c() {
        return this.h;
    }

    @Override // defpackage.dbyf
    public final enip d() {
        return this.e;
    }

    @Override // defpackage.dbyf
    public final enip e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbyf) {
            dbyf dbyfVar = (dbyf) obj;
            if (this.a.equals(dbyfVar.i()) && this.b.equals(dbyfVar.g()) && this.c.equals(dbyfVar.b()) && this.d.equals(dbyfVar.a()) && this.e.equals(dbyfVar.d()) && this.f.equals(dbyfVar.f()) && this.g.equals(dbyfVar.h()) && this.h.equals(dbyfVar.c()) && this.i.equals(dbyfVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dbyf
    public final enip f() {
        return this.f;
    }

    @Override // defpackage.dbyf
    public final enip g() {
        return this.b;
    }

    @Override // defpackage.dbyf
    public final enip h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.dbyf
    public final String i() {
        return this.a;
    }

    public final String toString() {
        enip enipVar = this.i;
        enip enipVar2 = this.h;
        enip enipVar3 = this.g;
        enip enipVar4 = this.f;
        enip enipVar5 = this.e;
        enip enipVar6 = this.d;
        enip enipVar7 = this.c;
        return "Contact{displayName=" + this.a + ", phones=" + this.b.toString() + ", emails=" + enipVar7.toString() + ", addresses=" + enipVar6.toString() + ", ims=" + enipVar5.toString() + ", organizations=" + enipVar4.toString() + ", websites=" + enipVar3.toString() + ", events=" + enipVar2.toString() + ", notes=" + enipVar.toString() + "}";
    }
}
