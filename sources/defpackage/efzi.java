package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzi extends lml {
    public final llf a;
    public emxc b;
    public emxc c;
    public String d = "";
    public int e;
    private final egfr f;

    public efzi(egfr egfrVar) {
        this.f = egfrVar;
        llf llfVar = new llf();
        this.a = llfVar;
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
        llfVar.p(egfrVar.f, new llh() { // from class: efzg
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((egfn) obj);
                efzi efziVar = efzi.this;
                efziVar.b = j;
                efziVar.a();
            }
        });
        llfVar.p(egfrVar.g, new llh() { // from class: efzh
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((egfz) obj);
                efzi efziVar = efzi.this;
                efziVar.c = j;
                efziVar.a();
            }
        });
    }

    public final void a() {
        engw engwVar;
        int i;
        engw engwVar2;
        efze efzeVar = new efze();
        efzeVar.c(this.e);
        int i2 = engw.d;
        efzeVar.b(enou.a);
        efzeVar.d(enou.a);
        engr engrVar = new engr();
        if (this.b.g() && this.e == 1) {
            if (((egfn) this.b.c()).a().g()) {
                efzeVar.a(((egfn) this.b.c()).a());
                efzeVar.c(3);
            } else {
                efzeVar.b(((egfn) this.b.c()).b());
            }
            engrVar.h(((egfn) this.b.c()).c());
        }
        if (this.c.g() && this.e == 2) {
            if (((egfz) this.c.c()).a().g()) {
                efzeVar.a(((egfz) this.c.c()).a());
                efzeVar.c(3);
            } else {
                efzeVar.d(((egfz) this.c.c()).b());
            }
            engrVar.h(((egfz) this.c.c()).c());
        }
        engw g = engrVar.g();
        if (g == null) {
            throw new NullPointerException("Null events");
        }
        efzeVar.d = g;
        llf llfVar = this.a;
        engw engwVar3 = efzeVar.a;
        if (engwVar3 != null && (engwVar = efzeVar.b) != null && (i = efzeVar.e) != 0 && (engwVar2 = efzeVar.d) != null) {
            llfVar.j(new efzf(engwVar3, engwVar, i, efzeVar.c, engwVar2));
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (efzeVar.a == null) {
            sb.append(" searchInterests");
        }
        if (efzeVar.b == null) {
            sb.append(" searchSuggestions");
        }
        if (efzeVar.e == 0) {
            sb.append(" searchState");
        }
        if (efzeVar.d == null) {
            sb.append(" events");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        ewki ewkiVar = (ewki) ewkj.a.createBuilder();
        ewkiVar.copyOnWrite();
        ewkj ewkjVar = (ewkj) ewkiVar.instance;
        egfr egfrVar = this.f;
        ewjg ewjgVar = egfrVar.c;
        ewjgVar.getClass();
        ewkjVar.c = ewjgVar;
        ewkjVar.b |= 1;
        ewkiVar.copyOnWrite();
        ewkj ewkjVar2 = (ewkj) ewkiVar.instance;
        ewkjVar2.b |= 2;
        ewkjVar2.d = 8;
        ListenableFuture f = egfrVar.a.f((ewkj) ewkiVar.build());
        egdt a = egfrVar.e.a(fapt.OBAKE_ART_SEARCH_INTERESTS);
        a.d();
        erqt.r(f, new egfp(egfrVar, a), egfrVar.b);
        this.e = 1;
    }

    public final void c(String str) {
        ewla ewlaVar = (ewla) ewlb.a.createBuilder();
        ewlaVar.copyOnWrite();
        ewlb ewlbVar = (ewlb) ewlaVar.instance;
        egfr egfrVar = this.f;
        ewjg ewjgVar = egfrVar.c;
        ewjgVar.getClass();
        ewlbVar.c = ewjgVar;
        ewlbVar.b |= 1;
        ewlaVar.copyOnWrite();
        ewlb ewlbVar2 = (ewlb) ewlaVar.instance;
        str.getClass();
        ewlbVar2.b |= 2;
        ewlbVar2.d = str;
        ListenableFuture h = egfrVar.a.h((ewlb) ewlaVar.build());
        egdt a = egfrVar.e.a(fapt.OBAKE_ART_SEARCH_INTERESTS);
        a.d();
        erqt.r(h, new egfq(egfrVar, a), egfrVar.b);
        this.e = 2;
        this.d = str;
    }
}
