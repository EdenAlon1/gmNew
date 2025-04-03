package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcz extends fgwo {
    private static final long serialVersionUID = -3541686430899510312L;
    private fgvg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcz() {
        super("LOCATION-TYPE");
        fgyu fgyuVar = fgyu.a;
        this.c = new fgvg();
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgvg(str);
    }
}
