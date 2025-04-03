package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhay extends fgvi {
    public static final fhay b = new fhay("INDIVIDUAL");
    public static final fhay c = new fhay("GROUP");
    public static final fhay d = new fhay("RESOURCE");
    public static final fhay e = new fhay("ROOM");
    public static final fhay f = new fhay("UNKNOWN");
    private static final long serialVersionUID = -3134064324693983052L;
    private final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhay(String str) {
        super("CUTYPE");
        int i = fgwj.a;
        this.g = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.g;
    }
}
