package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhba extends fgvi {
    private static final long serialVersionUID = 567577003350648021L;
    private final fgul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhba(String str) {
        super("DELEGATED-TO");
        fgul fgulVar = new fgul(fhev.e(str));
        int i = fgwj.a;
        this.b = fgulVar;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.fgvi
    protected final boolean b() {
        return false;
    }
}
