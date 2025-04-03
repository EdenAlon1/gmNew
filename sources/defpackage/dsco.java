package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsco implements dres {
    private String a;
    private String b;
    private String c;
    private Iterable d;
    private drek e;

    @Override // defpackage.dpal
    public final /* bridge */ /* synthetic */ doxr a() {
        drek drekVar = this.e;
        if (drekVar != null) {
            return drekVar;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.dpat
    public final /* bridge */ /* synthetic */ doxs b() {
        String str;
        String str2;
        Iterable iterable;
        drek drekVar;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null && (iterable = this.d) != null && (drekVar = this.e) != null) {
            return new dsci(str3, str, str2, iterable, drekVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" description");
        }
        if (this.c == null) {
            sb.append(" webUrl");
        }
        if (this.d == null) {
            sb.append(" variations");
        }
        if (this.e == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dres
    public final /* synthetic */ void c(String str) {
        this.b = str;
    }

    @Override // defpackage.dres
    public final /* synthetic */ void d(String str) {
        this.a = str;
    }

    @Override // defpackage.drqv
    public final /* synthetic */ void e(Iterable iterable) {
        this.d = iterable;
    }

    @Override // defpackage.dres
    public final /* synthetic */ void f(String str) {
        this.c = str;
    }

    @Override // defpackage.dpal
    public final /* bridge */ /* synthetic */ void g(doxr doxrVar) {
        this.e = (drek) doxrVar;
    }
}
