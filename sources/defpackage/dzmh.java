package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmh extends dzjo {
    public Long a;
    public Long b;
    public dzjp c;
    private engw d;

    @Override // defpackage.dzjo
    public final dzjq a() {
        if (this.d != null && this.a != null && this.b != null && this.c != null) {
            return new dzmi(this.d, this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" tachyonToken");
        }
        if (this.a == null) {
            sb.append(" expireAt");
        }
        if (this.b == null) {
            sb.append(" refreshedAt");
        }
        if (this.c == null) {
            sb.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzjo
    public final void b(dzjp dzjpVar) {
        this.c = dzjpVar;
    }

    @Override // defpackage.dzjo
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null tachyonToken");
        }
        this.d = engwVar;
    }
}
