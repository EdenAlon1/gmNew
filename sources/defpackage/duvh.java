package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvh extends duvp {
    public byte a;
    private String b;
    private int c;
    private int d;
    private int e;
    private engw f;
    private boolean g;
    private boolean h;

    public duvh() {
    }

    @Override // defpackage.duvp
    public final duvq a() {
        if (this.a == 63 && this.b != null && this.f != null) {
            return new duvi(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" emoji");
        }
        if ((this.a & 1) == 0) {
            sb.append(" positionInCategory");
        }
        if ((this.a & 2) == 0) {
            sb.append(" categoryIndex");
        }
        if ((this.a & 4) == 0) {
            sb.append(" categorySize");
        }
        if (this.f == null) {
            sb.append(" variants");
        }
        if ((this.a & 8) == 0) {
            sb.append(" inVariantsPopup");
        }
        if ((this.a & 16) == 0) {
            sb.append(" isSelected");
        }
        if ((this.a & 32) == 0) {
            sb.append(" isActivated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.duvp
    public final void b(int i) {
        this.d = i;
        this.a = (byte) (this.a | 2);
    }

    @Override // defpackage.duvp
    public final void c(int i) {
        this.e = i;
        this.a = (byte) (this.a | 4);
    }

    @Override // defpackage.duvp
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null emoji");
        }
        this.b = str;
    }

    @Override // defpackage.duvp
    public final void e(boolean z) {
        this.g = z;
        this.a = (byte) (this.a | 8);
    }

    @Override // defpackage.duvp
    public final void f(boolean z) {
        this.h = z;
        this.a = (byte) (this.a | 16);
    }

    @Override // defpackage.duvp
    public final void g(int i) {
        this.c = i;
        this.a = (byte) (this.a | 1);
    }

    @Override // defpackage.duvp
    public final void h(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null variants");
        }
        this.f = engwVar;
    }

    public duvh(duvq duvqVar) {
        duvi duviVar = (duvi) duvqVar;
        this.b = duviVar.a;
        this.c = duviVar.b;
        this.d = duviVar.c;
        this.e = duviVar.d;
        this.f = duviVar.e;
        this.g = duviVar.f;
        this.h = duviVar.g;
        this.a = (byte) 63;
    }
}
