package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbn extends fgvi {
    public static final fhbn b = new fhbn("SERVER");
    public static final fhbn c = new fhbn("CLIENT");
    public static final fhbn d = new fhbn("NONE");
    private final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbn(String str) {
        super("SCHEDULE-AGENT");
        int i = fgwj.a;
        this.e = fhev.e(str);
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.e;
    }
}
