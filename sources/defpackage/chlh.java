package defpackage;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chlh implements chln {
    static final cfva a = cfvl.r(147611892, "tachyon_data_migration");
    public static final /* synthetic */ int b = 0;
    private final comc c;
    private final chmb d;

    public chlh(comy comyVar, chmb chmbVar, akzt akztVar) {
        comu c = comv.c();
        c.d(comb.TACHYON_GAIA);
        c.f(chlr.a);
        c.e(new chlg(chmbVar, akztVar));
        c.c(new Supplier() { // from class: chla
            @Override // java.util.function.Supplier
            public final Object get() {
                return new chlm();
            }
        });
        this.c = comyVar.a(c.a());
        this.d = chmbVar;
    }

    @Override // defpackage.chln
    public final elfl a() {
        return !((Boolean) a.e()).booleanValue() ? elfl.g(this.d.a.a()).h(new emwl() { // from class: chlz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((chlr) obj).d.I();
            }
        }, erpp.a) : this.c.h().h(new emwl() { // from class: chlc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                return ((chlr) obj).d.I();
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl b() {
        return !((Boolean) a.e()).booleanValue() ? elfl.g(this.d.a.a()).h(new emwl() { // from class: chlv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chlr) obj).e);
            }
        }, erpp.a) : this.c.h().h(new emwl() { // from class: chlb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chlr) obj).e);
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl c(final String str) {
        return elfo.m(elfl.g(this.d.a.b(eldl.a(new emwl() { // from class: chly
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).c = str;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.c.j(new emwl() { // from class: chkt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).c = str;
                return (chlr) chlqVar.build();
            }
        })).a(new Callable() { // from class: chkz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = chlh.b;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl d(final byte[] bArr) {
        return elfo.m(elfl.g(this.d.a.b(eldl.a(new emwl() { // from class: chlu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                eyee x = eyee.x(bArr);
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).d = x;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.c.j(new emwl() { // from class: chkx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                eyee x = eyee.x(bArr);
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).d = x;
                return (chlr) chlqVar.build();
            }
        })).a(new Callable() { // from class: chky
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = chlh.b;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl e(final Long l) {
        return elfo.m(elfl.g(this.d.a.b(eldl.a(new emwl() { // from class: chlw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                long longValue = l.longValue();
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).e = longValue;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.c.j(new emwl() { // from class: chlf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                long longValue = l.longValue();
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).e = longValue;
                return (chlr) chlqVar.build();
            }
        })).a(new Callable() { // from class: chku
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = chlh.b;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl f(final chmd chmdVar) {
        return elfo.m(elfl.g(this.d.a.b(eldl.a(new emwl() { // from class: chlt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                chlr chlrVar = (chlr) chlqVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chlrVar.h = chmdVar2;
                chlrVar.b |= 2;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.c.j(new emwl() { // from class: chkv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                chlr chlrVar = (chlr) chlqVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chlrVar.h = chmdVar2;
                chlrVar.b |= 2;
                return (chlr) chlqVar.build();
            }
        })).a(new Callable() { // from class: chkw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = chlh.b;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.chln
    public final elfl g(final chmd chmdVar) {
        return elfo.m(elfl.g(this.d.a.b(eldl.a(new emwl() { // from class: chls
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                chlr chlrVar = (chlr) chlqVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chlrVar.g = chmdVar2;
                chlrVar.b |= 1;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.c.j(new emwl() { // from class: chld
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = chlh.b;
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                chlqVar.copyOnWrite();
                chlr chlrVar = (chlr) chlqVar.instance;
                chmd chmdVar2 = chmd.this;
                chmdVar2.getClass();
                chlrVar.g = chmdVar2;
                chlrVar.b |= 1;
                return (chlr) chlqVar.build();
            }
        })).a(new Callable() { // from class: chle
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = chlh.b;
                return null;
            }
        }, erpp.a);
    }
}
