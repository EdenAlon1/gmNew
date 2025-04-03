package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhaz extends fgvi {
    private static final long serialVersionUID = -795956139235258568L;
    private final fgul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhaz(String str) {
        super("DELEGATED-FROM");
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
