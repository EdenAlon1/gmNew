package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnm extends evlf {
    static final evnm a = new evnm();

    private evnm() {
    }

    public static final evkt e(evpl evplVar) {
        int t = evplVar.t();
        evkt g = g(evplVar, t);
        if (g == null) {
            return f(evplVar, t);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (evplVar.r()) {
                String h = g instanceof evkw ? evplVar.h() : null;
                int t2 = evplVar.t();
                evkt g2 = g(evplVar, t2);
                evkt f = g2 == null ? f(evplVar, t2) : g2;
                if (g instanceof evkq) {
                    ((evkq) g).a.add(f);
                } else {
                    ((evkw) g).e(h, f);
                }
                if (g2 != null) {
                    arrayDeque.addLast(g);
                    g = f;
                }
            } else {
                if (g instanceof evkq) {
                    evplVar.n();
                } else {
                    evplVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return g;
                }
                g = (evkt) arrayDeque.removeLast();
            }
        }
    }

    private static final evkt f(evpl evplVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new evkz(evplVar.j());
        }
        if (i2 == 6) {
            return new evkz(new evmm(evplVar.j()));
        }
        if (i2 == 7) {
            return new evkz(Boolean.valueOf(evplVar.s()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(evpm.a(i)));
        }
        evplVar.p();
        return evkv.a;
    }

    private static final evkt g(evpl evplVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            evplVar.l();
            return new evkq();
        }
        if (i2 != 2) {
            return null;
        }
        evplVar.m();
        return new evkw();
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        return e(evplVar);
    }

    @Override // defpackage.evlf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(evpn evpnVar, evkt evktVar) {
        if (evktVar == null || (evktVar instanceof evkv)) {
            evpnVar.j();
            return;
        }
        if (evktVar instanceof evkz) {
            evkz evkzVar = (evkz) evktVar;
            if (evkzVar.i()) {
                evpnVar.l(evkzVar.e());
                return;
            } else if (evkzVar.h()) {
                evpnVar.n(evkzVar.h() ? ((Boolean) evkzVar.a).booleanValue() : Boolean.parseBoolean(evkzVar.a()));
                return;
            } else {
                evpnVar.m(evkzVar.a());
                return;
            }
        }
        if (evktVar instanceof evkq) {
            evpnVar.e();
            Iterator<evkt> it = evktVar.b().iterator();
            while (it.hasNext()) {
                b(evpnVar, it.next());
            }
            evpnVar.g();
            return;
        }
        if (!(evktVar instanceof evkw)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(evktVar.getClass()))));
        }
        evpnVar.f();
        evmo evmoVar = new evmo((evmp) evktVar.c().a.entrySet());
        while (evmoVar.hasNext()) {
            evmt a2 = evmoVar.a();
            evpnVar.i((String) a2.f);
            b(evpnVar, (evkt) a2.h);
        }
        evpnVar.h();
    }
}
