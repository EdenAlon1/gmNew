package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbh extends fgvi {
    public static final fhbh b = new fhbh("NEEDS-ACTION");
    public static final fhbh c = new fhbh("ACCEPTED");
    public static final fhbh d = new fhbh("DECLINED");
    public static final fhbh e = new fhbh("TENTATIVE");
    public static final fhbh f = new fhbh("DELEGATED");
    public static final fhbh g = new fhbh("COMPLETED");
    public static final fhbh h = new fhbh("IN-PROCESS");
    private static final long serialVersionUID = -7856347127343842441L;
    private final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbh(String str) {
        super("PARTSTAT");
        int i = fgwj.a;
        this.i = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.i;
    }
}
