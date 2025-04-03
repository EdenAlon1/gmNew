package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbj extends fgvi {
    public static final fhbj b = new fhbj("PARENT");
    public static final fhbj c = new fhbj("CHILD");
    public static final fhbj d = new fhbj("SIBLING");
    private static final long serialVersionUID = 5346030888832899016L;
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbj(String str) {
        super("RELTYPE");
        int i = fgwj.a;
        this.e = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.e;
    }
}
