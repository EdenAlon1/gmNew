package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhdy extends fgwo {
    public static final fhdy c = new fhdx("OPAQUE");
    public static final fhdy d = new fhdx("TRANSPARENT");
    private static final long serialVersionUID = 3801479657311785518L;
    private String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdy() {
        super("TRANSP");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.e;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdy(fgwl fgwlVar, String str) {
        super("TRANSP", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.e = str;
    }
}
