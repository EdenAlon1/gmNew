package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjv extends lml {
    public final dbjh a;
    public final dbjc b;
    public final ffhd c;
    public final cavj d;
    public final Map e;
    public final fgcm f;
    public final fgdj g;
    public final ffxx h;
    private final ffsk i;

    public dbjv(ffsk ffskVar, dbjh dbjhVar, dbjc dbjcVar, ffhd ffhdVar, cavj cavjVar) {
        ffskVar.getClass();
        dbjcVar.getClass();
        ffhdVar.getClass();
        cavjVar.getClass();
        this.i = ffskVar;
        this.a = dbjhVar;
        this.b = dbjcVar;
        this.c = ffhdVar;
        this.d = cavjVar;
        List g = ffdx.g(new dbjd(1, "Dump Database", "dump", new ffix() { // from class: dbji
            @Override // defpackage.ffix
            public final Object invoke() {
                dbjv.this.c(false);
                return ffcu.a;
            }
        }), new dbjd(2, "Dump Database (Redacted)", "dump", new ffix() { // from class: dbjj
            @Override // defpackage.ffix
            public final Object invoke() {
                dbjv.this.c(true);
                return ffcu.a;
            }
        }), new dbjd(3, "Install Fake sqlite_stat1", "run", new ffix() { // from class: dbjk
            @Override // defpackage.ffix
            public final Object invoke() {
                dbjv dbjvVar = dbjv.this;
                dbjvVar.b(new dbjq(dbjvVar, null));
                return ffcu.a;
            }
        }), new dbjd(4, "Analyze Database", "run", new ffix() { // from class: dbjl
            @Override // defpackage.ffix
            public final Object invoke() {
                dbjv dbjvVar = dbjv.this;
                dbjvVar.b(new dbjs(dbjvVar, null));
                return ffcu.a;
            }
        }), new dbjd(5, "Checkpoint WAL", "run", new ffix() { // from class: dbjm
            @Override // defpackage.ffix
            public final Object invoke() {
                dbjv dbjvVar = dbjv.this;
                dbjvVar.b(new dbju(dbjvVar, null));
                return ffcu.a;
            }
        }));
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(g, 10)), 16));
        for (Object obj : g) {
            linkedHashMap.put(Integer.valueOf(((dbjd) obj).a), obj);
        }
        this.e = linkedHashMap;
        fgcm a = fgdm.a(false);
        this.f = a;
        this.g = a;
        this.h = odg.a(new ojc(new ojd(20, 0, false, 0, 0, 0, 58), new ffix() { // from class: dbjn
            @Override // defpackage.ffix
            public final Object invoke() {
                Map map = dbjv.this.e;
                map.getClass();
                return new dbjf(map);
            }
        }).a, this.i);
    }

    public final void a() {
        fgcm fgcmVar;
        Object c;
        do {
            fgcmVar = this.f;
            c = fgcmVar.c();
            ((Boolean) c).booleanValue();
        } while (!fgcmVar.g(c, false));
    }

    public final void b(ffji ffjiVar) {
        axol.k(this.i, null, new dbjo(this, ffjiVar, null), 3);
    }

    public final void c(boolean z) {
        b(new dbjp(this, z, null));
    }
}
