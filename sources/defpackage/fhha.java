package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhha {
    public fhgv a;
    public int b;
    public String c;
    public fhge d;
    public fhgf e;
    public fhhe f;
    public fhhb g;
    public fhhb h;
    public fhhb i;
    public long j;
    public long k;
    public fhhy l;
    private fhgt m;

    public fhha() {
        this.b = -1;
        this.e = new fhgf();
    }

    public static final void b(String str, fhhb fhhbVar) {
        if (fhhbVar != null) {
            if (fhhbVar.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            }
            if (fhhbVar.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            }
            if (fhhbVar.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            }
            if (fhhbVar.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }
    }

    public final fhhb a() {
        int i = this.b;
        if (i < 0) {
            throw new IllegalStateException(a.h(i, "code < 0: "));
        }
        fhgv fhgvVar = this.a;
        if (fhgvVar == null) {
            throw new IllegalStateException("request == null");
        }
        fhgt fhgtVar = this.m;
        if (fhgtVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.c;
        if (str != null) {
            return new fhhb(fhgvVar, fhgtVar, str, i, this.d, this.e.b(), this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(fhgh fhghVar) {
        this.e = fhghVar.e();
    }

    public final void d(fhgt fhgtVar) {
        fhgtVar.getClass();
        this.m = fhgtVar;
    }

    public fhha(fhhb fhhbVar) {
        this.b = -1;
        this.a = fhhbVar.a;
        this.m = fhhbVar.b;
        this.b = fhhbVar.d;
        this.c = fhhbVar.c;
        this.d = fhhbVar.e;
        this.e = fhhbVar.f.e();
        this.f = fhhbVar.g;
        this.g = fhhbVar.h;
        this.h = fhhbVar.i;
        this.i = fhhbVar.j;
        this.j = fhhbVar.k;
        this.k = fhhbVar.l;
        this.l = fhhbVar.m;
    }
}
