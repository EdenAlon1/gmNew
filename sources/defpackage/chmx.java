package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chmx {
    public final comc a;
    public final ctyx b;

    public chmx(comy comyVar, ctyx ctyxVar) {
        this.b = ctyxVar;
        comu c = comv.c();
        c.d(comb.TACHYON_ANONYMOUS);
        c.f(chlp.a);
        c.c(new Supplier() { // from class: chmu
            @Override // java.util.function.Supplier
            public final Object get() {
                return new chmw();
            }
        });
        this.a = comyVar.a(c.a());
    }

    public final elfl a() {
        return this.a.j(new emwl() { // from class: chmr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlo chloVar = (chlo) ((chlp) obj).toBuilder();
                chloVar.copyOnWrite();
                ((chlp) chloVar.instance).c = chlp.a.c;
                return (chlp) chloVar.build();
            }
        }).h(new emwl() { // from class: chms
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final elfl b() {
        return this.a.h().h(new emwl() { // from class: chme
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlp chlpVar = (chlp) obj;
                return Long.valueOf(chlpVar != null ? chlpVar.g : 0L);
            }
        }, erpp.a);
    }

    public final elfl c() {
        return this.a.h().h(new emwl() { // from class: chmt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chlp) obj).c.I();
            }
        }, erpp.a);
    }

    public final elfl d(final long j) {
        return this.a.j(new emwl() { // from class: chmv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlo chloVar = (chlo) ((chlp) obj).toBuilder();
                chloVar.copyOnWrite();
                ((chlp) chloVar.instance).d = j;
                return (chlp) chloVar.build();
            }
        }).h(new emwl() { // from class: chmf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
