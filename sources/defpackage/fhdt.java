package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhdt extends fgwo {
    public static final fhdt c = new fhds("TENTATIVE");
    public static final fhdt d = new fhds("CONFIRMED");
    public static final fhdt e = new fhds("CANCELLED");
    public static final fhdt f = new fhds("NEEDS-ACTION");
    public static final fhdt g = new fhds("COMPLETED");
    public static final fhdt h = new fhds("IN-PROCESS");
    public static final fhdt i = new fhds("CANCELLED");
    public static final fhdt j = new fhds("DRAFT");
    public static final fhdt k = new fhds("FINAL");
    public static final fhdt l = new fhds("CANCELLED");
    private static final long serialVersionUID = 7401102230299289898L;
    private String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdt() {
        super("STATUS");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.m;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdt(fgwl fgwlVar, String str) {
        super("STATUS", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.m = str;
    }
}
