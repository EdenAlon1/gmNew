package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espl extends espq {
    private String a;
    private String b;
    private enhd c;
    private enhk d;

    @Override // defpackage.espq
    public final enhd a() {
        if (this.c == null) {
            this.c = new enhd();
        }
        return this.c;
    }

    @Override // defpackage.espq
    public final espr b() {
        String str;
        enhd enhdVar = this.c;
        if (enhdVar != null) {
            this.d = enhdVar.c();
        } else if (this.d == null) {
            this.d = enoz.a;
        }
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new espm(str2, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" subType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.espq
    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"subType\" has not been set");
    }

    @Override // defpackage.espq
    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.espq
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.espq
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }
}
