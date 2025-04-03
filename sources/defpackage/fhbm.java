package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbm extends fgvi {
    public static final fhbm b = new fhbm("TRUE");
    public static final fhbm c = new fhbm("FALSE");
    private static final long serialVersionUID = -5381653882942018012L;
    private final Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbm(String str) {
        super("RSVP");
        Boolean valueOf = Boolean.valueOf(str);
        int i = fgwj.a;
        this.d = valueOf;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.d.booleanValue() ? "TRUE" : "FALSE";
    }
}
