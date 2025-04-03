package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglp extends eyfq implements eyht {
    public fglp() {
        super(fglq.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo a(int i) {
        return (fglo) ((fglq) this.instance).m.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo b(int i) {
        return (fglo) ((fglq) this.instance).o.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo c(int i) {
        return (fglo) ((fglq) this.instance).l.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo d(int i) {
        return (fglo) ((fglq) this.instance).k.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo e(int i) {
        return (fglo) ((fglq) this.instance).h.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo f(int i) {
        return (fglo) ((fglq) this.instance).i.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fglo g(int i) {
        return (fglo) ((fglq) this.instance).j.get(i);
    }

    public final void h(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.a();
        eydl.addAll(iterable, fglqVar.m);
    }

    public final void i(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.b();
        eydl.addAll(iterable, fglqVar.o);
    }

    public final void j(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        eygr eygrVar = fglqVar.r;
        if (!eygrVar.c()) {
            fglqVar.r = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fglqVar.r);
    }

    public final void k(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        eygr eygrVar = fglqVar.q;
        if (!eygrVar.c()) {
            fglqVar.q = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fglqVar.q);
    }

    public final void l(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.c();
        eydl.addAll(iterable, fglqVar.l);
    }

    public final void m(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.d();
        eydl.addAll(iterable, fglqVar.k);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.e();
        eydl.addAll(iterable, fglqVar.h);
    }

    public final void o(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.f();
        eydl.addAll(iterable, fglqVar.i);
    }

    public final void p(Iterable iterable) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fglqVar.g();
        eydl.addAll(iterable, fglqVar.j);
    }

    public final void q(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.a();
        fglqVar.m.set(i, fgloVar);
    }

    public final void r(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.b();
        fglqVar.o.set(i, fgloVar);
    }

    public final void s(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.c();
        fglqVar.l.set(i, fgloVar);
    }

    public final void t(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.d();
        fglqVar.k.set(i, fgloVar);
    }

    public final void u(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.e();
        fglqVar.h.set(i, fgloVar);
    }

    public final void v(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.f();
        fglqVar.i.set(i, fgloVar);
    }

    public final void w(int i, fglo fgloVar) {
        copyOnWrite();
        fglq fglqVar = (fglq) this.instance;
        fglq fglqVar2 = fglq.a;
        fgloVar.getClass();
        fglqVar.g();
        fglqVar.j.set(i, fgloVar);
    }
}
