package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhpe {
    private final String a;
    private final fhpf b;
    private final fhpn c;

    public fhpe(String str, fhpn fhpnVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (fhpnVar == null) {
            throw new IllegalArgumentException("Body may not be null");
        }
        this.a = str;
        this.c = fhpnVar;
        this.b = new fhpf();
        e(fhpnVar);
        f(fhpnVar);
        g(fhpnVar);
    }

    public String a() {
        return this.a;
    }

    public fhpf b() {
        return this.b;
    }

    public fhpn c() {
        return this.c;
    }

    public void d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Field name may not be null");
        }
        this.b.e(new fhpj(str, str2));
    }

    protected void e(fhpn fhpnVar) {
        StringBuilder sb = new StringBuilder("form-data; name=\"");
        sb.append(a());
        sb.append("\"");
        if (fhpnVar.f() != null) {
            sb.append("; filename=\"");
            sb.append(fhpnVar.f());
            sb.append("\"");
        }
        d(fhpi.c, sb.toString());
    }

    protected void f(fhpn fhpnVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(fhpnVar.c());
        if (fhpnVar.e() != null) {
            sb.append("; charset=");
            sb.append(fhpnVar.e());
        }
        d(fhpi.a, sb.toString());
    }

    protected void g(fhpn fhpnVar) {
        d(fhpi.b, fhpnVar.g());
    }
}
