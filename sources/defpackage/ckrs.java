package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckrs implements ckrd {
    public final ffbr a;
    public final ckby b;
    public final fazb c;
    public final errm d;
    public final errm e;
    private final akyw f;

    public ckrs(ffbr ffbrVar, ckby ckbyVar, akyw akywVar, fazb fazbVar, errm errmVar, errm errmVar2) {
        this.a = ffbrVar;
        this.b = ckbyVar;
        this.f = akywVar;
        this.c = fazbVar;
        this.d = errmVar;
        this.e = errmVar2;
    }

    public static eolv c(eomn eomnVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_GROUP;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eomnVar.getClass();
        eolvVar2.C = eomnVar;
        eolvVar2.b |= 4194304;
        return (eolv) eoluVar.build();
    }

    public final elfl a(String str, final epbu epbuVar) {
        return d(str, 7).h(new emwl() { // from class: ckrm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eomj eomjVar = (eomj) obj;
                eomjVar.copyOnWrite();
                eomn eomnVar = (eomn) eomjVar.instance;
                eomn eomnVar2 = eomn.a;
                epbu epbuVar2 = epbu.this;
                epbuVar2.getClass();
                eomnVar.i = epbuVar2;
                eomnVar.b |= 64;
                return ckrs.c((eomn) eomjVar.build());
            }
        }, this.e);
    }

    public final elfl b() {
        return elfo.g(new Callable() { // from class: ckrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (String) dimn.E().a().a();
            }
        }, this.d);
    }

    public final elfl d(final String str, final int i) {
        elfl g = elfo.g(new Callable() { // from class: ckrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ckrs.this.b.a(ckcf.t));
            }
        }, this.d);
        final akyw akywVar = this.f;
        akywVar.getClass();
        return g.h(new emwl() { // from class: ckrq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return akyw.this.a(((Integer) obj).intValue());
            }
        }, this.d).h(new emwl() { // from class: ckrr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eoqk eoqkVar = (eoqk) obj;
                eomj eomjVar = (eomj) eomn.a.createBuilder();
                eomjVar.copyOnWrite();
                eomn eomnVar = (eomn) eomjVar.instance;
                eomnVar.c = i - 1;
                eomnVar.b |= 1;
                eomjVar.copyOnWrite();
                eomn eomnVar2 = (eomn) eomjVar.instance;
                eoqkVar.getClass();
                eomnVar2.e = eoqkVar;
                eomnVar2.b |= 4;
                eqwf d = ((ckge) ((csjk) ckrs.this.c.b()).a()).d();
                eomjVar.copyOnWrite();
                eomn eomnVar3 = (eomn) eomjVar.instance;
                eomnVar3.f = d.N;
                eomnVar3.b |= 8;
                eomjVar.copyOnWrite();
                eomn eomnVar4 = (eomn) eomjVar.instance;
                String str2 = str;
                str2.getClass();
                eomnVar4.b |= 32;
                eomnVar4.h = str2;
                return eomjVar;
            }
        }, this.e);
    }
}
