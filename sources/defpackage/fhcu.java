package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhcu extends fgwo {
    private static final long serialVersionUID = -6415954847619338567L;
    private fgwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcu() {
        super("FREEBUSY");
        fgyu fgyuVar = fgyu.a;
        this.c = new fgwn();
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.fgwo
    public final void c(String str) {
        this.c = new fgwn(str);
    }
}
