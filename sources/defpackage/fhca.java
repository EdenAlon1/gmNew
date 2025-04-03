package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhca extends fgwo {
    public static final fhca c = new fhbz();
    private static final long serialVersionUID = 7446184786984981423L;
    private String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhca() {
        super("CALSCALE");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.d;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhca(fgwl fgwlVar) {
        super("CALSCALE", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.d = "GREGORIAN";
    }
}
