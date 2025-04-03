package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvn implements dlvq {
    public final dowd a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final dnwi e;
    public final long f;
    public final dmae g;
    private final String h;
    private final dlvp i;
    private final dlvg j;

    public dlvn(String str, dlvp dlvpVar, dowd dowdVar, boolean z, boolean z2, boolean z3, dnwi dnwiVar, long j, dmae dmaeVar, dlvg dlvgVar) {
        this.h = str;
        this.i = dlvpVar;
        this.a = dowdVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = dnwiVar;
        this.f = j;
        this.g = dmaeVar;
        this.j = dlvgVar;
    }

    @Override // defpackage.dlvq
    public final dlvg a() {
        return this.j;
    }

    @Override // defpackage.dlvq
    public final dlvp b() {
        return this.i;
    }

    @Override // defpackage.dlvq
    public final dnwi c() {
        return this.e;
    }

    @Override // defpackage.dlvq
    public final dowd d() {
        return this.a;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvn)) {
            return false;
        }
        dlvn dlvnVar = (dlvn) obj;
        return ffkj.e(this.h, dlvnVar.h) && ffkj.e(this.i, dlvnVar.i) && ffkj.e(this.a, dlvnVar.a) && this.b == dlvnVar.b && this.c == dlvnVar.c && this.d == dlvnVar.d && ffkj.e(this.e, dlvnVar.e) && this.f == dlvnVar.f && ffkj.e(this.g, dlvnVar.g) && ffkj.e(this.j, dlvnVar.j);
    }

    @Override // defpackage.dlvq
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dlvq
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.dlvq
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        dlvp dlvpVar = this.i;
        int hashCode2 = (hashCode + (dlvpVar == null ? 0 : dlvpVar.hashCode())) * 31;
        dowd dowdVar = this.a;
        int hashCode3 = (((((((hashCode2 + (dowdVar == null ? 0 : dowdVar.hashCode())) * 31) + dlvm.a(this.b)) * 31) + dlvm.a(this.c)) * 31) + dlvm.a(this.d)) * 31;
        dnwi dnwiVar = this.e;
        int hashCode4 = dnwiVar == null ? 0 : dnwiVar.hashCode();
        long j = this.f;
        int i = (((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        dmae dmaeVar = this.g;
        return ((i + (dmaeVar != null ? dmaeVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "LoadingPlayback(contentDescription=" + this.h + ", transcript=" + this.i + ", voiceMood=" + this.a + ", isOutgoing=" + this.b + ", isRichType=" + this.c + ", isHighlighted=" + this.d + ", statusUiData=" + this.e + ", displayedTimeInMillis=" + this.f + ", waveformUiData=" + this.g + ", flags=" + this.j + ")";
    }
}
