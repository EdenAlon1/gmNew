package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhec extends fgwo {
    private static final long serialVersionUID = 450274263165493502L;
    public fgze c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhec() {
        super("TZOFFSETFROM");
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
