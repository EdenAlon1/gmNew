package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhcd extends fgwo {
    public static final fhcd c = new fhcc("PUBLIC");
    public static final fhcd d = new fhcc("PRIVATE");
    public static final fhcd e = new fhcc("CONFIDENTIAL");
    private static final long serialVersionUID = 4939943639175551481L;
    private String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcd() {
        super("CLASS");
        fgyu fgyuVar = fgyu.a;
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.f;
    }

    @Override // defpackage.fgwo
    public void c(String str) {
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhcd(fgwl fgwlVar, String str) {
        super("CLASS", fgwlVar);
        fgyu fgyuVar = fgyu.a;
        this.f = str;
    }
}
