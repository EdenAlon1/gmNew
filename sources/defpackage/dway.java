package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dway implements dvwj {
    public final dwac a;
    public final dvwr b;
    private final dwbq c;

    public dway(dwac dwacVar, dvwr dvwrVar, dwbq dwbqVar) {
        this.a = dwacVar;
        this.b = dvwrVar;
        this.c = dwbqVar;
    }

    @Override // defpackage.dvwj
    public final ListenableFuture a(final dvwl dvwlVar) {
        eyfw checkIsLite;
        String g;
        eyfw checkIsLite2;
        emxc emxcVar;
        eyfw checkIsLite3;
        eyfw checkIsLite4;
        final dwaa dwaaVar = (dwaa) dvwlVar.a;
        dvxr a = dvzw.a(dwaaVar);
        checkIsLite = eyfy.checkIsLite(dwbb.a);
        a.b(checkIsLite);
        if (a.r.o(checkIsLite.d)) {
            dvxr a2 = dvzw.a(dwaaVar);
            checkIsLite4 = eyfy.checkIsLite(dwbb.a);
            a2.b(checkIsLite4);
            Object l = a2.r.l(checkIsLite4.d);
            g = ((dwba) (l == null ? checkIsLite4.b : checkIsLite4.c(l))).b;
        } else {
            g = this.a.g(dwaaVar);
        }
        if (g.isEmpty()) {
            return erqt.i(null);
        }
        final dfli dfliVar = (dfli) this.a.c(dwaaVar).f();
        final ListenableFuture d = this.a.d(dwaaVar, dvwlVar.b);
        dwac dwacVar = this.a;
        ListenableFuture listenableFuture = dvwlVar.b;
        final ListenableFuture h = dwacVar.h();
        final ListenableFuture e = dwacVar.e(dwaaVar, dvwlVar.b);
        dwbq dwbqVar = this.c;
        List list = dwaaVar.b;
        final ListenableFuture i = erqt.i(null);
        final dvxk dvxkVar = dwaaVar.c.a;
        final ArrayList arrayList = new ArrayList();
        dwbqVar.a.a(dvxkVar, dvxkVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        dwbqVar.b.a(dvxkVar, dvxkVar.d, null, arrayList2);
        final ListenableFuture a3 = erqt.c(enfc.b(arrayList, arrayList2)).a(new Callable() { // from class: dwbp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eyfw checkIsLite5;
                eyfw checkIsLite6;
                eyfw checkIsLite7;
                eyfw checkIsLite8;
                epmd epmdVar = (epmd) epme.a.createBuilder();
                epmdVar.copyOnWrite();
                epme epmeVar = (epme) epmdVar.instance;
                dwaa dwaaVar2 = dwaa.this;
                erhm erhmVar = dwaaVar2.a;
                erhmVar.getClass();
                epmeVar.c = erhmVar;
                epmeVar.b |= 1;
                if (!dwaaVar2.e) {
                    erhm a4 = dwas.a(dwaaVar2, true);
                    emxf.m(a4 != null, "No Parent Event");
                    epmdVar.copyOnWrite();
                    epme epmeVar2 = (epme) epmdVar.instance;
                    a4.getClass();
                    epmeVar2.e = a4;
                    epmeVar2.b |= 2;
                }
                dvxr a5 = dvzw.a(dwaaVar2);
                checkIsLite5 = eyfy.checkIsLite(dwbw.a);
                a5.b(checkIsLite5);
                if (a5.r.o(checkIsLite5.d)) {
                    epmf epmfVar = (epmf) epmg.a.createBuilder();
                    erhk erhkVar = a5.d;
                    if (erhkVar == null) {
                        erhkVar = erhk.a;
                    }
                    erhm erhmVar2 = erhkVar.e;
                    if (erhmVar2 == null) {
                        erhmVar2 = erhm.a;
                    }
                    epmfVar.copyOnWrite();
                    epmg epmgVar = (epmg) epmfVar.instance;
                    erhmVar2.getClass();
                    epmgVar.c = erhmVar2;
                    epmgVar.b |= 1;
                    epmdVar.copyOnWrite();
                    epme epmeVar3 = (epme) epmdVar.instance;
                    epmg epmgVar2 = (epmg) epmfVar.build();
                    epmgVar2.getClass();
                    epmeVar3.h = epmgVar2;
                    epmeVar3.b |= 128;
                }
                erhk erhkVar2 = dvzw.b(dwaaVar2).d;
                if (erhkVar2 == null) {
                    erhkVar2 = erhk.a;
                }
                dvxk dvxkVar2 = dvxkVar;
                epnv epnvVar = (epnv) epnw.a.createBuilder();
                epnvVar.copyOnWrite();
                epnw epnwVar = (epnw) epnvVar.instance;
                erhkVar2.getClass();
                epnwVar.c = erhkVar2;
                epnwVar.b |= 1;
                int a6 = erku.a(dvxkVar2.c);
                if (a6 == 0) {
                    a6 = 1;
                }
                epnvVar.copyOnWrite();
                epnw epnwVar2 = (epnw) epnvVar.instance;
                epnwVar2.b |= 16;
                epnwVar2.e = a6 - 1;
                int a7 = erku.a(dvxkVar2.c);
                if (a7 == 0) {
                    a7 = 1;
                }
                epnvVar.copyOnWrite();
                epnw epnwVar3 = (epnw) epnvVar.instance;
                epnwVar3.b |= 16;
                epnwVar3.e = a7 - 1;
                Iterator<E> it = dvxkVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            checkIsLite6 = eyfy.checkIsLite(dvzr.b);
                            dvxkVar2.b(checkIsLite6);
                            Object l2 = dvxkVar2.r.l(checkIsLite6.d);
                            int a8 = erks.a(((dvzt) (l2 == null ? checkIsLite6.b : checkIsLite6.c(l2))).c);
                            if (a8 == 0) {
                                a8 = 1;
                            }
                            epnvVar.copyOnWrite();
                            epnw epnwVar4 = (epnw) epnvVar.instance;
                            epnwVar4.b |= 32;
                            epnwVar4.f = a8 - 1;
                            break;
                        case 100000002:
                            checkIsLite7 = eyfy.checkIsLite(dvzr.c);
                            dvxkVar2.b(checkIsLite7);
                            Object l3 = dvxkVar2.r.l(checkIsLite7.d);
                            int a9 = erkp.a(((erkq) (l3 == null ? checkIsLite7.b : checkIsLite7.c(l3))).b);
                            if (a9 == 0) {
                                a9 = 1;
                            }
                            epnvVar.copyOnWrite();
                            epnw epnwVar5 = (epnw) epnvVar.instance;
                            epnwVar5.b |= 64;
                            epnwVar5.g = a9 - 1;
                            break;
                        case 100000003:
                            checkIsLite8 = eyfy.checkIsLite(dwbs.b);
                            dvxkVar2.b(checkIsLite8);
                            Object l4 = dvxkVar2.r.l(checkIsLite8.d);
                            int i2 = ((dwaw) (l4 == null ? checkIsLite8.b : checkIsLite8.c(l4))).b;
                            epnvVar.copyOnWrite();
                            epnw epnwVar6 = (epnw) epnvVar.instance;
                            epnwVar6.b |= 128;
                            epnwVar6.h = i2;
                            break;
                    }
                }
                epmb epmbVar = (epmb) epmc.a.createBuilder();
                long j = dwaaVar2.d;
                if (j != -1) {
                    eyfw eyfwVar = epml.b;
                    epmh epmhVar = (epmh) epmi.a.createBuilder();
                    epmj epmjVar = (epmj) epmk.a.createBuilder();
                    epmjVar.copyOnWrite();
                    epmk epmkVar = (epmk) epmjVar.instance;
                    epmkVar.b |= 1;
                    epmkVar.c = j;
                    epmk epmkVar2 = (epmk) epmjVar.build();
                    epmhVar.copyOnWrite();
                    epmi epmiVar = (epmi) epmhVar.instance;
                    epmkVar2.getClass();
                    epmiVar.c = epmkVar2;
                    epmiVar.b = 1 | epmiVar.b;
                    epmbVar.e(eyfwVar, (epmi) epmhVar.build());
                }
                List list2 = arrayList;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((dwah) erqt.q((ListenableFuture) it2.next())).a(epmbVar);
                    }
                }
                List list3 = arrayList2;
                epnvVar.copyOnWrite();
                epnw epnwVar7 = (epnw) epnvVar.instance;
                epmc epmcVar = (epmc) epmbVar.build();
                epmcVar.getClass();
                epnwVar7.j = epmcVar;
                epnwVar7.b |= 16384;
                if (!list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        ((dwah) erqt.q((ListenableFuture) it3.next())).a(epnvVar);
                    }
                }
                epnx[] epnxVarArr = (epnx[]) erqt.q(i);
                if (epnxVarArr != null) {
                    for (epnx epnxVar : epnxVarArr) {
                        epnvVar.copyOnWrite();
                        epnw epnwVar8 = (epnw) epnvVar.instance;
                        epoa epoaVar = (epoa) epnxVar.build();
                        epoaVar.getClass();
                        eygr eygrVar = epnwVar8.i;
                        if (!eygrVar.c()) {
                            epnwVar8.i = eyfy.mutableCopy(eygrVar);
                        }
                        epnwVar8.i.add(epoaVar);
                    }
                }
                epnw epnwVar9 = (epnw) epnvVar.build();
                epmdVar.copyOnWrite();
                epme epmeVar4 = (epme) epmdVar.instance;
                epnwVar9.getClass();
                epmeVar4.f = epnwVar9;
                epmeVar4.b |= 16;
                return (epme) epmdVar.build();
            }
        }, erpp.a);
        dvxr b = dwaaVar.e ? dvzw.b(dwaaVar) : dvzw.a(dwaaVar);
        checkIsLite2 = eyfy.checkIsLite(dwao.a);
        b.b(checkIsLite2);
        if (b.r.o(checkIsLite2.d)) {
            checkIsLite3 = eyfy.checkIsLite(dwao.a);
            b.b(checkIsLite3);
            Object l2 = b.r.l(checkIsLite3.d);
            emxcVar = emxc.j(Integer.valueOf(((dwan) (l2 == null ? checkIsLite3.b : checkIsLite3.c(l2))).b));
        } else {
            this.a.a(dwaaVar);
            emxcVar = emux.a;
        }
        final emxc emxcVar2 = emxcVar;
        final String str = g;
        return erqt.d(d, a3, h, e).b(eldl.c(new erog() { // from class: dwax
            @Override // defpackage.erog
            public final ListenableFuture a() {
                eyfw checkIsLite5;
                eyfw checkIsLite6;
                dvwp l3 = dvwq.l();
                l3.b(str);
                dvwn dvwnVar = (dvwn) l3;
                dvwnVar.e = dfliVar;
                l3.c((eyhs) erqt.q(d));
                dvwnVar.a = (epme) erqt.q(a3);
                dvwnVar.b = (Integer) emxcVar2.f();
                dvwnVar.c = (int[]) erqt.q(h);
                dway dwayVar = dway.this;
                dwac dwacVar2 = dwayVar.a;
                dwaa dwaaVar2 = dwaaVar;
                l3.d(dwacVar2.f(dwaaVar2));
                dwayVar.a.b(dwaaVar2);
                int[] iArr = (int[]) erqt.q(e);
                dvxr b2 = dvzw.b(dwaaVar2);
                checkIsLite5 = eyfy.checkIsLite(dwcx.a);
                b2.b(checkIsLite5);
                if (b2.r.o(checkIsLite5.d) || iArr != null) {
                    dvxr b3 = dvzw.b(dwaaVar2);
                    checkIsLite6 = eyfy.checkIsLite(dwcx.a);
                    b3.b(checkIsLite6);
                    Object l4 = b3.r.l(checkIsLite6.d);
                    HashSet hashSet = new HashSet(((dwcw) (l4 == null ? checkIsLite6.b : checkIsLite6.c(l4))).b);
                    if (iArr != null) {
                        hashSet.addAll(ermn.j(iArr));
                    }
                    dvwnVar.d = ermn.l(hashSet);
                }
                return dwayVar.b.a(l3.e(), dvwlVar.b);
            }
        }), erpp.a);
    }

    @Override // defpackage.dvwj
    public final Set b() {
        return new enpx(dwaa.class);
    }
}
