package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emne extends emni {
    private String a;
    private engw b;
    private float c;
    private String d;
    private fbrg e;
    private byte f;

    @Override // defpackage.emni
    public final emnj a() {
        String str;
        engw engwVar;
        String str2;
        fbrg fbrgVar;
        if (this.f == 1 && (str = this.a) != null && (engwVar = this.b) != null && (str2 = this.d) != null && (fbrgVar = this.e) != null) {
            return new emnf(str, engwVar, this.c, str2, fbrgVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" entities");
        }
        if (this.f == 0) {
            sb.append(" score");
        }
        if (this.d == null) {
            sb.append(" textPrediction");
        }
        if (this.e == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.emni
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null entities");
        }
        this.b = engwVar;
    }

    @Override // defpackage.emni
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = str;
    }

    @Override // defpackage.emni
    public final void d(float f) {
        this.c = f;
        this.f = (byte) 1;
    }

    @Override // defpackage.emni
    public final void e(fbrg fbrgVar) {
        if (fbrgVar == null) {
            throw new NullPointerException("Null source");
        }
        this.e = fbrgVar;
    }

    @Override // defpackage.emni
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null textPrediction");
        }
        this.d = str;
    }
}
