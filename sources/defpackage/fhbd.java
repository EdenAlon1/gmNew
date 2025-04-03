package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbd extends fgvi {
    public static final fhbd b = new fhbd("FREE");
    public static final fhbd c = new fhbd("BUSY");
    public static final fhbd d = new fhbd("BUSY-UNAVAILABLE");
    public static final fhbd e = new fhbd("BUSY-TENTATIVE");
    private static final long serialVersionUID = -2217689716824679375L;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbd(String str) {
        super("FBTYPE");
        int i = fgwj.a;
        this.f = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.f;
    }
}
