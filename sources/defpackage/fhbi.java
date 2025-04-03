package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhbi extends fgvi {
    public static final fhbi b = new fhbi("THISANDPRIOR");
    public static final fhbi c = new fhbi("THISANDFUTURE");
    private static final long serialVersionUID = -3057531444558393776L;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhbi(String str) {
        super("RANGE");
        int i = fgwj.a;
        String e = fhev.e(str);
        this.d = e;
        if (fhel.b("ical4j.compatibility.notes") || "THISANDPRIOR".equals(e) || "THISANDFUTURE".equals(e)) {
            return;
        }
        throw new IllegalArgumentException("Invalid value [" + e + "]");
    }

    @Override // defpackage.fguw
    public final String a() {
        return this.d;
    }
}
