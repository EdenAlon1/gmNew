package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdq extends fgwo {
    private static final long serialVersionUID = -848562477226746807L;
    private fgyy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdq() {
        super("RESOURCES");
        fgyu fgyuVar = fgyu.a;
        this.c = new fgyy();
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgyy(str);
    }
}
