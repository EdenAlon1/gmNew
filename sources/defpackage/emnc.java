package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnc extends emng {
    public engr a;
    public engw b;
    public engr c;
    public engw d;
    private String e;
    private String f;
    private String g;
    private String h;
    private fceq i;

    @Override // defpackage.emng
    public final emnh a() {
        String str;
        String str2;
        String str3;
        fceq fceqVar;
        engr engrVar = this.a;
        if (engrVar != null) {
            this.b = engrVar.g();
        } else if (this.b == null) {
            int i = engw.d;
            this.b = enou.a;
        }
        engr engrVar2 = this.c;
        if (engrVar2 != null) {
            this.d = engrVar2.g();
        } else if (this.d == null) {
            int i2 = engw.d;
            this.d = enou.a;
        }
        String str4 = this.e;
        if (str4 != null && (str = this.f) != null && (str2 = this.g) != null && (str3 = this.h) != null && (fceqVar = this.i) != null) {
            return new emnd(str4, str, str2, str3, this.b, this.d, fceqVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" text");
        }
        if (this.f == null) {
            sb.append(" canonicalText");
        }
        if (this.g == null) {
            sb.append(" categoryHrid");
        }
        if (this.h == null) {
            sb.append(" type");
        }
        if (this.i == null) {
            sb.append(" amount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.emng
    public final engr b() {
        if (this.a == null) {
            if (this.b == null) {
                int i = engw.d;
                this.a = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.a = engrVar;
                engrVar.j(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.emng
    public final void c(fceq fceqVar) {
        if (fceqVar == null) {
            throw new NullPointerException("Null amount");
        }
        this.i = fceqVar;
    }

    @Override // defpackage.emng
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null canonicalText");
        }
        this.f = str;
    }

    @Override // defpackage.emng
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null categoryHrid");
        }
        this.g = str;
    }

    @Override // defpackage.emng
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.e = str;
    }

    @Override // defpackage.emng
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.h = str;
    }
}
