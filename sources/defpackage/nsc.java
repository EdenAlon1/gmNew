package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nsc {
    public final nrx a;
    public final int b;
    public final lrb c;
    public boolean d;

    public nsc(lqc lqcVar, nrx nrxVar) {
        this.a = nrxVar;
        this.c = lqcVar.l;
        this.b = ntl.b(lqcVar.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static String k(lqc lqcVar, List list) {
        String str = lqcVar.o;
        lti.f(str);
        boolean l = lre.l(str);
        enin eninVar = new enin();
        eninVar.c(lqcVar.o);
        if (l) {
            eninVar.c("video/hevc");
            eninVar.c("video/avc");
        }
        eninVar.j(list);
        engw g = eninVar.g().g();
        for (int i = 0; i < g.size(); i++) {
            String str2 = (String) g.get(i);
            if (list.contains(str2)) {
                if (l && lpo.i(lqcVar.C)) {
                    if (!nqt.g(str2, lqcVar.C).isEmpty()) {
                        return str2;
                    }
                } else if (!nqt.f(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract void d();

    protected boolean g() {
        return false;
    }

    protected abstract lqc p();

    protected abstract lxz q();

    public abstract nrl r(nql nqlVar, lqc lqcVar, int i);

    protected abstract void s();

    protected abstract boolean t();
}
