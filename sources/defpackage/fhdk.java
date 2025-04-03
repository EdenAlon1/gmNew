package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhdk extends fgwo {
    private static final long serialVersionUID = -9188265089143001164L;
    public fgyx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdk() {
        super("RRULE");
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
