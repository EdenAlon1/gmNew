package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cllh extends cljq {
    private final clkt a;
    private final cltj b;
    private final chco c;

    public cllh(cltj cltjVar, clkt clktVar, chco chcoVar) {
        this.b = cltjVar;
        this.a = clktVar;
        this.c = chcoVar;
    }

    @Override // defpackage.cljq
    public final void b(clqm clqmVar, awxh awxhVar) {
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        for (clpk clpkVar : clpcVar.g) {
            awuk awukVar = (awuk) awul.a.createBuilder();
            awun awunVar = (awun) awup.a.createBuilder();
            clnm clnmVar = clpkVar.c;
            if (clnmVar == null) {
                clnmVar = clnm.a;
            }
            String str = clnmVar.c;
            awunVar.copyOnWrite();
            awup awupVar = (awup) awunVar.instance;
            str.getClass();
            awupVar.b |= 1;
            awupVar.c = str;
            clnm clnmVar2 = clpkVar.c;
            if (clnmVar2 == null) {
                clnmVar2 = clnm.a;
            }
            String str2 = clnmVar2.d;
            awunVar.copyOnWrite();
            awup awupVar2 = (awup) awunVar.instance;
            str2.getClass();
            awupVar2.b |= 2;
            awupVar2.d = str2;
            awup awupVar3 = (awup) awunVar.build();
            awukVar.copyOnWrite();
            awul awulVar = (awul) awukVar.instance;
            awupVar3.getClass();
            awulVar.c = awupVar3;
            awulVar.b |= 1;
            eyee eyeeVar = clpkVar.d;
            awukVar.copyOnWrite();
            awul awulVar2 = (awul) awukVar.instance;
            eyeeVar.getClass();
            awulVar2.b |= 2;
            awulVar2.d = eyeeVar;
            awxhVar.c((awul) awukVar.build());
        }
    }

    @Override // defpackage.cljq
    public final void c(clqm clqmVar, awxh awxhVar) {
        clns clnsVar = clqmVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        str.getClass();
        awxkVar.c |= 512;
        awxkVar.m = str;
    }

    @Override // defpackage.cljq
    public final void d(clqm clqmVar, awxh awxhVar) {
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        if ((clpcVar.c & 16) != 0) {
            clpc clpcVar2 = clqmVar.e;
            if (clpcVar2 == null) {
                clpcVar2 = clpc.b;
            }
            fayv fayvVar = clpcVar2.i;
            if (fayvVar == null) {
                fayvVar = fayv.a;
            }
            awxhVar.copyOnWrite();
            awxk awxkVar = (awxk) awxhVar.instance;
            eygj eygjVar = awxk.a;
            fayvVar.getClass();
            awxkVar.n = fayvVar;
            awxkVar.c |= 1024;
        }
    }

    @Override // defpackage.cljq
    public final void e(clqm clqmVar, awxh awxhVar) {
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        clqx clqxVar = clpcVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str = clqxVar.c;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        str.getClass();
        awxkVar.c |= 256;
        awxkVar.l = str;
    }

    @Override // defpackage.cljq
    public final void f(clqm clqmVar, awxh awxhVar) {
        clns clnsVar = clqmVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clns clnsVar2 = clqmVar.d;
        if (clnsVar2 == null) {
            clnsVar2 = clns.a;
        }
        clqv clqvVar = clnsVar2.d;
        if (clqvVar == null) {
            clqvVar = clqv.a;
        }
        awui a = this.b.a(clnsVar, clqvVar);
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        a.getClass();
        awxkVar.g = a;
        awxkVar.c |= 8;
    }

    @Override // defpackage.cljq
    public final void g(clqm clqmVar, awxh awxhVar) {
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        Stream stream = Collection.EL.stream(new eygk(clpcVar.k, clpc.a));
        final clkt clktVar = this.a;
        Stream map = stream.map(new Function() { // from class: clle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (awxj) clkt.this.fP((cloc) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        awxhVar.a((Iterable) map.collect(endq.a));
    }

    @Override // defpackage.cljq
    public final void h(clqm clqmVar, awxh awxhVar) {
        clns clnsVar = clqmVar.d;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        clqv clqvVar = clpcVar.e;
        if (clqvVar == null) {
            clqvVar = clqv.a;
        }
        awui a = this.b.a(clnsVar, clqvVar);
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        a.getClass();
        awxkVar.d = a;
        awxkVar.c |= 1;
    }

    @Override // defpackage.cljq
    public final void i(clqm clqmVar, awxh awxhVar) {
        clpc clpcVar = clqmVar.e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        eyja eyjaVar = clpcVar.h;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        eyjaVar.getClass();
        awxkVar.p = eyjaVar;
        awxkVar.c |= 2048;
    }

    @Override // defpackage.cljq
    public final void j(clqm clqmVar, awxh awxhVar) {
        axac createBuilder = axad.a.createBuilder();
        clsn clsnVar = clqmVar.c;
        if (clsnVar == null) {
            clsnVar = clsn.a;
        }
        String str = clsnVar.c;
        createBuilder.copyOnWrite();
        axad axadVar = (axad) createBuilder.instance;
        str.getClass();
        axadVar.b |= 1;
        axadVar.c = str;
        axad build = createBuilder.build();
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        build.getClass();
        awxkVar.r = build;
        awxkVar.c |= 8192;
    }

    @Override // defpackage.cljq
    public final void k(final awxh awxhVar) {
        Optional c = this.c.c();
        awxhVar.getClass();
        c.ifPresentOrElse(new Consumer() { // from class: cllf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                awxh awxhVar2 = awxh.this;
                awui awuiVar = (awui) obj;
                awxhVar2.copyOnWrite();
                awxk awxkVar = (awxk) awxhVar2.instance;
                eygj eygjVar = awxk.a;
                awuiVar.getClass();
                awxkVar.j = awuiVar;
                awxkVar.c |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: cllg
            @Override // java.lang.Runnable
            public final void run() {
                throw new IllegalArgumentException("RCS self identity is not present.");
            }
        });
    }

    @Override // defpackage.cljq
    public final void l(awxh awxhVar) {
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eqyl eqylVar = eqyl.RCS_SMAPI;
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aa = eqylVar.h;
        eopqVar.c |= 2097152;
        eopq eopqVar2 = (eopq) eoopVar.build();
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        eopqVar2.getClass();
        awxkVar.q = eopqVar2;
        awxkVar.c |= 4096;
    }
}
