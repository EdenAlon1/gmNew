package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcq extends fgwo {
    private static final long serialVersionUID = 9144969653829796798L;
    public fgvd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcq() {
        super("DURATION");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgvd(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcq(fgvd fgvdVar) {
        super("DURATION");
        fgyu fgyuVar = fgyu.a;
        this.c = fgvdVar;
    }
}
