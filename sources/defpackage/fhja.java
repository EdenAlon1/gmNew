package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhja {
    private final fhmv a;
    private long b = 262144;

    public fhja(fhmv fhmvVar) {
        this.a = fhmvVar;
    }

    public final String a() {
        String p = this.a.p(this.b);
        this.b -= p.length();
        return p;
    }

    public final fhgh b() {
        fhgf fhgfVar = new fhgf();
        while (true) {
            String a = a();
            if (a.length() == 0) {
                return fhgfVar.b();
            }
            int P = ffpc.P(a, ':', 1, 4);
            if (P != -1) {
                String substring = a.substring(0, P);
                substring.getClass();
                String substring2 = a.substring(P + 1);
                substring2.getClass();
                fhgfVar.c(substring, substring2);
            } else if (a.charAt(0) == ':') {
                String substring3 = a.substring(1);
                substring3.getClass();
                fhgfVar.c("", substring3);
            } else {
                fhgfVar.c("", a);
            }
        }
    }
}
