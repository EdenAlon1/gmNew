package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clya {
    private final cqoh a;
    private final errl b;
    private final cmel c;
    private final ffbr d;

    public clya(cqoh cqohVar, errl errlVar, cmel cmelVar, ffbr ffbrVar) {
        this.a = cqohVar;
        this.b = errlVar;
        this.c = cmelVar;
        this.d = ffbrVar;
    }

    public static epbq b(clys clysVar) {
        epbp epbpVar = (epbp) epbq.a.createBuilder();
        long a = clysVar.a() + 1;
        epbpVar.copyOnWrite();
        epbq epbqVar = (epbq) epbpVar.instance;
        epbqVar.b |= 1;
        epbqVar.c = a;
        long b = clysVar.b();
        epbpVar.copyOnWrite();
        epbq epbqVar2 = (epbq) epbpVar.instance;
        epbqVar2.b |= 2;
        epbqVar2.d = b;
        return (epbq) epbpVar.build();
    }

    private final clxu g(clxx clxxVar, int i) {
        clxu clxuVar = (clxu) clxy.a.createBuilder();
        clxuVar.copyOnWrite();
        clxy clxyVar = (clxy) clxuVar.instance;
        clxyVar.d = clxxVar.a();
        clxyVar.b |= 2;
        clxuVar.copyOnWrite();
        clxy clxyVar2 = (clxy) clxuVar.instance;
        clxyVar2.e = i - 2;
        clxyVar2.b |= 4;
        clxuVar.copyOnWrite();
        clxy clxyVar3 = (clxy) clxuVar.instance;
        clxyVar3.c = 1;
        clxyVar3.b = 1 | clxyVar3.b;
        eyja d = eykm.d(this.a.f().toEpochMilli());
        clxuVar.copyOnWrite();
        clxy clxyVar4 = (clxy) clxuVar.instance;
        d.getClass();
        clxyVar4.f = d;
        clxyVar4.b |= 8;
        return clxuVar;
    }

    public final elfl a(final clxy clxyVar) {
        cmel cmelVar = this.c;
        elfl j = cmelVar.d.j(new emwl() { // from class: cmcs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmbx cmbxVar = (cmbx) obj;
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) cmbxVar.toBuilder();
                cmbfVar.copyOnWrite();
                ((cmbx) cmbfVar.instance).p = cmbx.emptyProtobufList();
                engw j2 = cmel.j(cmbxVar.p, clxy.this);
                cmbfVar.copyOnWrite();
                cmbx cmbxVar2 = (cmbx) cmbfVar.instance;
                eygr eygrVar = cmbxVar2.p;
                if (!eygrVar.c()) {
                    cmbxVar2.p = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(j2, cmbxVar2.p);
                return (cmbx) cmbfVar.build();
            }
        });
        ejvo ejvoVar = cmelVar.g;
        ejtv ejtvVar = new ejtv();
        ejtvVar.b(j);
        ejtvVar.a = new emwl() { // from class: cmct
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cmel.j((List) obj, clxy.this);
            }
        };
        ejtvVar.c(cmel.c);
        return elfl.g(ejvoVar.a(ejtvVar.a())).h(new emwl() { // from class: cmcu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }

    public final void c(epgr epgrVar, clys clysVar) {
        cmfb cmfbVar = (cmfb) this.d.b();
        Optional of = Optional.of(b(clysVar));
        epgrVar.getClass();
        axol.k(cmfbVar.a, null, new cmet(epgrVar, cmfbVar, of, null), 3);
    }

    public final void d(epgr epgrVar, Optional optional) {
        cmfb cmfbVar = (cmfb) this.d.b();
        Optional map = optional.map(new Function() { // from class: clxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return clya.b((clys) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        epgrVar.getClass();
        map.getClass();
        axol.k(cmfbVar.a, null, new cmeu(epgrVar, cmfbVar, map, null), 3);
    }

    public final void e(int i) {
        a((clxy) g(clxx.BANNER, i).build()).k(axnw.b(), this.b);
    }

    public final void f(int i) {
        a((clxy) g(clxx.BOTTOMSHEET, i).build()).k(axnw.b(), this.b);
    }
}
