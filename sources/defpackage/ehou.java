package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehou {
    public ehoi a;
    public ehoi b;
    public ehoi c;
    public ehoi d;
    public ehoh e;
    public ehoh f;
    public ehoh g;
    public ehoh h;
    public ehok i;
    public ehok j;
    public ehok k;
    public ehok l;

    public ehou() {
        this.a = new ehot();
        this.b = new ehot();
        this.c = new ehot();
        this.d = new ehot();
        this.e = new ehoe(0.0f);
        this.f = new ehoe(0.0f);
        this.g = new ehoe(0.0f);
        this.h = new ehoe(0.0f);
        this.i = new ehok();
        this.j = new ehok();
        this.k = new ehok();
        this.l = new ehok();
    }

    private static void l(ehoi ehoiVar) {
        if (ehoiVar instanceof ehot) {
            float f = ((ehot) ehoiVar).a;
        } else if (ehoiVar instanceof ehoj) {
            float f2 = ((ehoj) ehoiVar).a;
        }
    }

    public final void a(ehoi ehoiVar) {
        this.d = ehoiVar;
        l(ehoiVar);
    }

    public final void b(float f) {
        this.h = new ehoe(f);
    }

    public final void c(ehoi ehoiVar) {
        this.c = ehoiVar;
        l(ehoiVar);
    }

    public final void d(float f) {
        this.g = new ehoe(f);
    }

    public final void e(ehoi ehoiVar) {
        this.a = ehoiVar;
        l(ehoiVar);
    }

    public final void f(float f) {
        this.e = new ehoe(f);
    }

    public final void g(ehoi ehoiVar) {
        this.b = ehoiVar;
        l(ehoiVar);
    }

    public final void h(float f) {
        this.f = new ehoe(f);
    }

    public final void i(float f) {
        f(f);
        h(f);
        d(f);
        b(f);
    }

    public final void j(float f) {
        e(ehoq.a(0));
        f(f);
    }

    public final void k(float f) {
        g(ehoq.a(0));
        h(f);
    }

    public ehou(ehow ehowVar) {
        this.a = new ehot();
        this.b = new ehot();
        this.c = new ehot();
        this.d = new ehot();
        this.e = new ehoe(0.0f);
        this.f = new ehoe(0.0f);
        this.g = new ehoe(0.0f);
        this.h = new ehoe(0.0f);
        this.i = new ehok();
        this.j = new ehok();
        this.k = new ehok();
        this.l = new ehok();
        this.a = ehowVar.b;
        this.b = ehowVar.c;
        this.c = ehowVar.d;
        this.d = ehowVar.e;
        this.e = ehowVar.f;
        this.f = ehowVar.g;
        this.g = ehowVar.h;
        this.h = ehowVar.i;
        this.i = ehowVar.j;
        this.j = ehowVar.k;
        this.k = ehowVar.l;
        this.l = ehowVar.m;
    }
}
