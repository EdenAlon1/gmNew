package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrd extends dtvy {
    public dtry a;
    public dtry b;
    public String c;
    public duap d;
    public String e;
    private dtyq f;
    private boolean g;
    private byte h;

    @Override // defpackage.dtvy
    protected final dtvz a() {
        dtyq dtyqVar;
        if (this.h == 1 && (dtyqVar = this.f) != null) {
            return new dtre(dtyqVar, this.a, this.b, this.c, this.d, this.e, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" query");
        }
        if (this.h == 0) {
            sb.append(" isExemptFromIndexRequirementOnJoinedColumn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtvy
    public final dtyq b() {
        dtyq dtyqVar = this.f;
        if (dtyqVar != null) {
            return dtyqVar;
        }
        throw new IllegalStateException("Property \"query\" has not been set");
    }

    @Override // defpackage.dtvy
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dtvy
    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }

    @Override // defpackage.dtvy
    public final void e(dtyq dtyqVar) {
        if (dtyqVar == null) {
            throw new NullPointerException("Null query");
        }
        this.f = dtyqVar;
    }

    @Override // defpackage.dtvy
    public final void f(String str) {
        this.e = str;
    }
}
