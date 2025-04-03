package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsk {
    public int a;
    public int b;
    private String c;
    private String d;

    public nsk() {
        this.a = -1;
    }

    public final nsl a() {
        return new nsl(this.a, this.c, this.d, this.b);
    }

    public final void b(String str) {
        String f = lre.f(str);
        boolean z = true;
        if (f != null && !lre.i(f)) {
            z = false;
        }
        lti.b(z, "Not an audio MIME type: ".concat(String.valueOf(f)));
        this.c = f;
    }

    public final void c(String str) {
        String f = lre.f(str);
        boolean z = true;
        if (f != null && !lre.l(f)) {
            z = false;
        }
        lti.b(z, "Not a video MIME type: ".concat(String.valueOf(f)));
        this.d = f;
    }

    public nsk(nsl nslVar) {
        this.a = nslVar.a;
        this.c = nslVar.b;
        this.d = nslVar.c;
        this.b = nslVar.d;
    }
}
