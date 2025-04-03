package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efyz extends lml {
    public boolean a = false;
    public String b;
    public final llf c;
    private final egfx d;

    public efyz(egfx egfxVar) {
        llf llfVar = new llf();
        this.c = llfVar;
        this.d = egfxVar;
        llfVar.p(egfxVar.g, new llh() { // from class: efyy
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw engwVar;
                engw engwVar2;
                engw engwVar3;
                egft egftVar = (egft) obj;
                efza efzaVar = new efza();
                int i = engw.d;
                efzaVar.c(enou.a);
                efzaVar.a(enou.a);
                efzaVar.b(enou.a);
                if (egftVar.a().g()) {
                    emxc a = egftVar.a();
                    if (a == null) {
                        throw new NullPointerException("Null errorState");
                    }
                    efzaVar.d = a;
                } else {
                    engw c = egftVar.c();
                    emxf.b(true, "limit is negative");
                    efzaVar.c(new enjj(c));
                    efzaVar.a(egftVar.b());
                    efzaVar.b(enjk.e(egftVar.c(), 12));
                }
                engw r = engw.r(egftVar.d());
                if (r == null) {
                    throw new NullPointerException("Null events");
                }
                efyz efyzVar = efyz.this;
                efzaVar.e = r;
                efyzVar.a = false;
                engw engwVar4 = efzaVar.a;
                if (engwVar4 != null && (engwVar = efzaVar.b) != null && (engwVar2 = efzaVar.c) != null && (engwVar3 = efzaVar.e) != null) {
                    efyzVar.c.j(new efzb(engwVar4, engwVar, engwVar2, efzaVar.d, engwVar3));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (efzaVar.a == null) {
                    sb.append(" topResults");
                }
                if (efzaVar.b == null) {
                    sb.append(" artCollections");
                }
                if (efzaVar.c == null) {
                    sb.append(" moreResults");
                }
                if (efzaVar.e == null) {
                    sb.append(" events");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        });
    }

    public final void a(String str) {
        this.b = str;
        this.a = true;
        ewlw ewlwVar = (ewlw) ewlx.a.createBuilder();
        ewlwVar.copyOnWrite();
        ewlx ewlxVar = (ewlx) ewlwVar.instance;
        egfx egfxVar = this.d;
        ewjg ewjgVar = egfxVar.c;
        ewjgVar.getClass();
        ewlxVar.c = ewjgVar;
        ewlxVar.b = 1 | ewlxVar.b;
        ewlwVar.copyOnWrite();
        ewlx ewlxVar2 = (ewlx) ewlwVar.instance;
        str.getClass();
        ewlxVar2.b |= 2;
        ewlxVar2.d = str;
        if (!egfxVar.f.equals(ewiq.a)) {
            ewiq ewiqVar = egfxVar.f;
            ewlwVar.copyOnWrite();
            ewlx ewlxVar3 = (ewlx) ewlwVar.instance;
            ewiqVar.getClass();
            ewlxVar3.e = ewiqVar;
            ewlxVar3.b |= 32;
        }
        ListenableFuture k = egfxVar.a.k((ewlx) ewlwVar.build());
        egdt a = egfxVar.e.a(fapt.OBAKE_ART_SEARCH_RESULTS);
        a.d();
        erqt.r(k, new egfw(egfxVar, a), egfxVar.b);
    }
}
