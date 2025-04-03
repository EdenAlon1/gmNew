package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhed extends fgwo {
    private static final long serialVersionUID = 8213874575051177732L;
    public fgze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhed() {
        super("TZOFFSETTO");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        fgze fgzeVar = this.c;
        return fgzeVar != null ? fgzeVar.toString() : "";
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgze(str);
    }
}
