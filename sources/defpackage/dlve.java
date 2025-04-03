package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlve implements dlvq {
    private final String a;
    private final dlvp b;
    private final dowd c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final dnwi g;
    private final dlvg h;

    public /* synthetic */ dlve(String str, dlvp dlvpVar, boolean z, boolean z2, boolean z3, dlvg dlvgVar, int i) {
        dlvgVar = (i & 128) != 0 ? new dlvg(false, false) : dlvgVar;
        int i2 = i & 32;
        int i3 = i & 16;
        int i4 = i & 8;
        int i5 = i & 2;
        boolean z4 = z3 & (i2 == 0);
        boolean z5 = z2 & (i3 == 0);
        boolean z6 = z & (i4 == 0);
        dlvpVar = i5 != 0 ? null : dlvpVar;
        dlvgVar.getClass();
        this.a = str;
        this.b = dlvpVar;
        this.c = null;
        this.d = z6;
        this.e = z5;
        this.f = z4;
        this.g = null;
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
        return null;
    }

    @Override // defpackage.dlvq
    public final dowd d() {
        return null;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlve)) {
            return false;
        }
        dlve dlveVar = (dlve) obj;
        if (!ffkj.e(this.a, dlveVar.a) || !ffkj.e(this.b, dlveVar.b)) {
            return false;
        }
        dowd dowdVar = dlveVar.c;
        if (!ffkj.e(null, null) || this.d != dlveVar.d || this.e != dlveVar.e || this.f != dlveVar.f) {
            return false;
        }
        dnwi dnwiVar = dlveVar.g;
        return ffkj.e(null, null) && ffkj.e(this.h, dlveVar.h);
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
        return ((((((((hashCode + (dlvpVar == null ? 0 : dlvpVar.hashCode())) * 961) + dlvd.a(this.d)) * 31) + dlvd.a(this.e)) * 31) + dlvd.a(this.f)) * 961) + this.h.hashCode();
    }

    public final String toString() {
        return "Error(contentDescription=" + this.a + ", transcript=" + this.b + ", voiceMood=null, isOutgoing=" + this.d + ", isRichType=" + this.e + ", isHighlighted=" + this.f + ", statusUiData=null, flags=" + this.h + ")";
    }
}
