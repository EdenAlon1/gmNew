package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhdb extends fgwo {
    public static final fhdb c = new fhda("PUBLISH");
    public static final fhdb d = new fhda("REQUEST");
    public static final fhdb e = new fhda("REPLY");
    public static final fhdb f = new fhda("ADD");
    public static final fhdb g = new fhda("CANCEL");
    public static final fhdb h = new fhda("REFRESH");
    public static final fhdb i = new fhda("COUNTER");
    public static final fhdb j = new fhda("DECLINE-COUNTER");
    private static final long serialVersionUID = 7220956532685378719L;
    private String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdb() {
        super("METHOD");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.k;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhdb(fgwl fgwlVar, String str) {
        super("METHOD", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.k = str;
    }
}
