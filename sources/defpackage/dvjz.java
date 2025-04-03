package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvjz implements emwl {
    public abstract void a(eyaw eyawVar, evzo evzoVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyaw eyawVar = (eyaw) obj;
        evzo evzoVar = (evzo) evzr.a.createBuilder();
        e(eyawVar, evzoVar);
        g(eyawVar, evzoVar);
        o(eyawVar, evzoVar);
        b(eyawVar, evzoVar);
        i(eyawVar, evzoVar);
        j(eyawVar, evzoVar);
        n(eyawVar, evzoVar);
        m(eyawVar, evzoVar);
        d(eyawVar, evzoVar);
        k(eyawVar, evzoVar);
        l(eyawVar, evzoVar);
        f(eyawVar, evzoVar);
        h(eyawVar, evzoVar);
        c(eyawVar, evzoVar);
        a(eyawVar, evzoVar);
        if ((eyawVar.b & 8) != 0) {
            emwd emwdVar = dvlu.b;
            eyav b = eyav.b(eyawVar.f);
            if (b == null) {
                b = eyav.PULSE_ANIMATION_TYPE_UNSPECIFIED;
            }
            evzq evzqVar = (evzq) emwdVar.fP(b);
            evzoVar.copyOnWrite();
            evzr evzrVar = (evzr) evzoVar.instance;
            evzrVar.q = evzqVar.c;
            evzrVar.b |= 4096;
        }
        if ((eyawVar.b & 32) != 0) {
            float f = eyawVar.g;
            evzoVar.copyOnWrite();
            evzr evzrVar2 = (evzr) evzoVar.instance;
            evzrVar2.b |= 8192;
            evzrVar2.r = f;
        }
        if ((eyawVar.b & 64) != 0) {
            boolean z = eyawVar.h;
            evzoVar.copyOnWrite();
            evzr evzrVar3 = (evzr) evzoVar.instance;
            evzrVar3.b |= 16384;
            evzrVar3.s = z;
        }
        return (evzr) evzoVar.build();
    }

    public abstract void b(eyaw eyawVar, evzo evzoVar);

    public abstract void c(eyaw eyawVar, evzo evzoVar);

    public abstract void d(eyaw eyawVar, evzo evzoVar);

    public abstract void e(eyaw eyawVar, evzo evzoVar);

    public abstract void f(eyaw eyawVar, evzo evzoVar);

    public abstract void g(eyaw eyawVar, evzo evzoVar);

    public abstract void h(eyaw eyawVar, evzo evzoVar);

    public abstract void i(eyaw eyawVar, evzo evzoVar);

    public abstract void j(eyaw eyawVar, evzo evzoVar);

    public abstract void k(eyaw eyawVar, evzo evzoVar);

    public abstract void l(eyaw eyawVar, evzo evzoVar);

    public abstract void m(eyaw eyawVar, evzo evzoVar);

    public abstract void n(eyaw eyawVar, evzo evzoVar);

    public abstract void o(eyaw eyawVar, evzo evzoVar);
}
