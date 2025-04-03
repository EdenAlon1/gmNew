package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnn extends evlf {
    private final evlf a;
    private final evlf b;
    private final evmw c;

    public evnn(evlf evlfVar, evlf evlfVar2, evmw evmwVar) {
        this.a = evlfVar;
        this.b = evlfVar2;
        this.c = evmwVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        int i;
        int t = evplVar.t();
        if (t == 9) {
            evplVar.p();
            return null;
        }
        Map map = (Map) this.c.a();
        if (t == 1) {
            evplVar.l();
            while (evplVar.r()) {
                evplVar.l();
                Object a = this.a.a(evplVar);
                if (map.put(a, this.b.a(evplVar)) != null) {
                    throw new evlb("duplicate key: ".concat(String.valueOf(String.valueOf(a))));
                }
                evplVar.n();
            }
            evplVar.n();
            return map;
        }
        evplVar.m();
        while (evplVar.r()) {
            evml evmlVar = evml.a;
            int i2 = evplVar.c;
            if (i2 == 0) {
                i2 = evplVar.b();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else {
                if (i2 != 14) {
                    throw evplVar.d("a name");
                }
                i = 10;
            }
            evplVar.c = i;
            Object a2 = this.a.a(evplVar);
            if (map.put(a2, this.b.a(evplVar)) != null) {
                throw new evlb("duplicate key: ".concat(String.valueOf(String.valueOf(a2))));
            }
        }
        evplVar.o();
        return map;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        for (Map.Entry entry : map.entrySet()) {
            evpnVar.i(String.valueOf(entry.getKey()));
            this.b.b(evpnVar, entry.getValue());
        }
        evpnVar.h();
    }
}
