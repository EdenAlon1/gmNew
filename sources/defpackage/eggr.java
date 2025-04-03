package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggr extends egfj {
    public enhk a;
    public emxc b = emux.a;
    private String c;
    private String d;
    private String e;
    private long f;
    private engw g;
    private engw h;
    private engw i;
    private byte j;

    @Override // defpackage.egfj
    public final egfk a() {
        String str;
        String str2;
        String str3;
        engw engwVar;
        engw engwVar2;
        enhk enhkVar;
        engw engwVar3;
        if (this.j == 1 && (str = this.c) != null && (str2 = this.d) != null && (str3 = this.e) != null && (engwVar = this.g) != null && (engwVar2 = this.h) != null && (enhkVar = this.a) != null && (engwVar3 = this.i) != null) {
            return new eggs(str, str2, str3, this.f, engwVar, engwVar2, enhkVar, this.b, engwVar3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" name");
        }
        if (this.d == null) {
            sb.append(" accessibilityLabel");
        }
        if (this.e == null) {
            sb.append(" url");
        }
        if (this.j == 0) {
            sb.append(" id");
        }
        if (this.g == null) {
            sb.append(" presets");
        }
        if (this.h == null) {
            sb.append(" frames");
        }
        if (this.a == null) {
            sb.append(" layers");
        }
        if (this.i == null) {
            sb.append(" eventLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egfj
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accessibilityLabel");
        }
        this.d = str;
    }

    @Override // defpackage.egfj
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.i = engwVar;
    }

    @Override // defpackage.egfj
    public final void d(Iterable iterable) {
        this.h = engw.j(iterable);
    }

    @Override // defpackage.egfj
    public final void e(long j) {
        this.f = j;
        this.j = (byte) 1;
    }

    @Override // defpackage.egfj
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
    }

    @Override // defpackage.egfj
    public final void g(Iterable iterable) {
        this.g = engw.j(iterable);
    }

    @Override // defpackage.egfj
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.e = str;
    }
}
