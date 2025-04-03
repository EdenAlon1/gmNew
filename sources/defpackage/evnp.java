package defpackage;

import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnp extends evlf {
    public static final evlg a = new ObjectTypeAdapter$1(1);
    private final evkn b;
    private final int c;

    public evnp(evkn evknVar, int i) {
        this.b = evknVar;
        this.c = i;
    }

    private final Object c(evpl evplVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return evplVar.j();
        }
        if (i2 == 6) {
            return evld.a(this.c, evplVar);
        }
        if (i2 == 7) {
            return Boolean.valueOf(evplVar.s());
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(evpm.a(i)));
        }
        evplVar.p();
        return null;
    }

    private static final Object e(evpl evplVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            evplVar.l();
            return new ArrayList();
        }
        if (i2 != 2) {
            return null;
        }
        evplVar.m();
        return new evmu();
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        int t = evplVar.t();
        Object e = e(evplVar, t);
        if (e == null) {
            return c(evplVar, t);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (evplVar.r()) {
                String h = e instanceof Map ? evplVar.h() : null;
                int t2 = evplVar.t();
                Object e2 = e(evplVar, t2);
                Object c = e2 == null ? c(evplVar, t2) : e2;
                if (e instanceof List) {
                    ((List) e).add(c);
                } else {
                    ((Map) e).put(h, c);
                }
                if (e2 != null) {
                    arrayDeque.addLast(e);
                    e = c;
                }
            } else {
                if (e instanceof List) {
                    evplVar.n();
                } else {
                    evplVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        if (obj == null) {
            evpnVar.j();
            return;
        }
        evlf b = this.b.b(obj.getClass());
        if (!(b instanceof evnp)) {
            b.b(evpnVar, obj);
        } else {
            evpnVar.f();
            evpnVar.h();
        }
    }
}
