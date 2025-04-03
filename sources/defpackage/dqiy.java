package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqiy {
    public static final enru a = enru.c("com/google/android/libraries/compose/core/data/usage/EntityUsageProcessor");
    public final ffsk b;
    public final dqki c;
    public final ernh d;
    public final dqkk e;
    public final dqji f;
    private final dqjj h;
    private final ffbz i = ffca.a(new ffix() { // from class: dqim
        @Override // defpackage.ffix
        public final Object invoke() {
            dqiy dqiyVar = dqiy.this;
            return ffqy.c(dqiyVar.b, null, new dqiw(dqiyVar, null), 3);
        }
    });
    public final ffbz g = ffca.a(new ffix() { // from class: dqin
        @Override // defpackage.ffix
        public final Object invoke() {
            dqiy dqiyVar = dqiy.this;
            return ffqy.c(dqiyVar.b, null, new dqix(dqiyVar, null), 3);
        }
    });

    public dqiy(dqjj dqjjVar, ffsk ffskVar, dqki dqkiVar, ernh ernhVar, dqkk dqkkVar, dqkd dqkdVar) {
        this.h = dqjjVar;
        this.b = ffskVar;
        this.c = dqkiVar;
        this.d = ernhVar;
        this.e = dqkkVar;
        this.f = dqjjVar.a(dqkdVar, new ffji() { // from class: dqil
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((dqij) obj).a;
            }
        });
    }

    public static /* synthetic */ Object e(dqiy dqiyVar, Object obj, dqgm dqgmVar, String str, ffgu ffguVar, int i) {
        Instant a2 = (i & 4) != 0 ? dqiyVar.d.a() : null;
        if ((i & 8) != 0) {
            str = null;
        }
        Object a3 = dqiyVar.c.a(new dqij(obj, dqgmVar, a2, str), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (a3 != ffhhVar) {
            a3 = ffcu.a;
        }
        return a3 == ffhhVar ? a3 : ffcu.a;
    }

    public final ffss a() {
        return (ffss) this.i.a();
    }

    public final ffxx b(final dqgm dqgmVar) {
        return (ffxx) this.e.e("EntityUsageProcessor#observeFrecency", new ffix() { // from class: dqip
            @Override // defpackage.ffix
            public final Object invoke() {
                return new fgcp(new dqis(dqiy.this, dqgmVar, null));
            }
        });
    }

    public final fgdj c(final dqgm dqgmVar) {
        dqgmVar.getClass();
        return (fgdj) this.e.e("EntityUsageProcessor#observeFrecency", new ffix() { // from class: dqik
            @Override // defpackage.ffix
            public final Object invoke() {
                dqiy dqiyVar = dqiy.this;
                ffxx b = dqiyVar.b(dqgmVar);
                int i = fgcz.a;
                return fgbn.b(b, dqiyVar.b, fgcy.b, ffne.a);
            }
        });
    }

    public final boolean d() {
        return a().z();
    }
}
