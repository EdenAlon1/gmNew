package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvl implements dlvq {
    private final String a;
    private final dlvp b;
    private final dowd c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final dnwi g;
    private final dlvg h;

    public dlvl(String str, dlvp dlvpVar, dowd dowdVar, boolean z, boolean z2, boolean z3, dnwi dnwiVar, dlvg dlvgVar) {
        this.a = str;
        this.b = dlvpVar;
        this.c = dowdVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = dnwiVar;
        this.h = dlvgVar;
    }

    @Override // defpackage.dlvq
    public final dlvg a() {
        return this.h;
    }

    @Override // defpackage.dlvq
    public final dlvp b() {
        return this.b;
    }

    @Override // defpackage.dlvq
    public final dnwi c() {
        return this.g;
    }

    @Override // defpackage.dlvq
    public final dowd d() {
        return this.c;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvl)) {
            return false;
        }
        dlvl dlvlVar = (dlvl) obj;
        return ffkj.e(this.a, dlvlVar.a) && ffkj.e(this.b, dlvlVar.b) && ffkj.e(this.c, dlvlVar.c) && this.d == dlvlVar.d && this.e == dlvlVar.e && this.f == dlvlVar.f && ffkj.e(this.g, dlvlVar.g) && ffkj.e(this.h, dlvlVar.h);
    }

    @Override // defpackage.dlvq
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.dlvq
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.dlvq
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dlvp dlvpVar = this.b;
        int hashCode2 = (hashCode + (dlvpVar == null ? 0 : dlvpVar.hashCode())) * 31;
        dowd dowdVar = this.c;
        int hashCode3 = (((((((hashCode2 + (dowdVar == null ? 0 : dowdVar.hashCode())) * 31) + dlvk.a(this.d)) * 31) + dlvk.a(this.e)) * 31) + dlvk.a(this.f)) * 31;
        dnwi dnwiVar = this.g;
        return ((hashCode3 + (dnwiVar != null ? dnwiVar.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ", transcript=" + this.b + ", voiceMood=" + this.c + ", isOutgoing=" + this.d + ", isRichType=" + this.e + ", isHighlighted=" + this.f + ", statusUiData=" + this.g + ", flags=" + this.h + ")";
    }
}
