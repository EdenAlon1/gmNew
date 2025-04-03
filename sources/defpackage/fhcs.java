package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcs extends fgwo {
    private static final long serialVersionUID = -9171193801247139294L;
    private fgyx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcs() {
        super("EXRULE");
        fgyu fgyuVar = fgyu.a;
        this.c = new fgyx((byte[]) null);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgyx(str);
    }
}
