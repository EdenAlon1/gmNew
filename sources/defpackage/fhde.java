package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhde extends fgwo {
    private static final long serialVersionUID = 7788138484983240112L;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhde() {
        super("PERCENT-COMPLETE");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return String.valueOf(this.c);
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = Integer.parseInt(str);
    }
}
