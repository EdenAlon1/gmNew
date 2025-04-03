package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjl implements dvjd {
    public static final entd a = entd.c("GnpSdk");
    public static final dvmb b = new dvmb();
    public final errl c;
    public final eagn d;
    public final eapp e;
    public final eapp f;
    public final eafv g;
    public final ealz h;
    public final easc i;
    public final ffbr j;
    public final String k;
    public final fazb l;
    public final dvcp m;
    public final eaov n;
    public final eanl o;

    public dvjl(errl errlVar, eaov eaovVar, eagn eagnVar, eapp eappVar, eapp eappVar2, eanl eanlVar, eafv eafvVar, ealz ealzVar, easc eascVar, ffbr ffbrVar, String str, fazb fazbVar, dvcp dvcpVar) {
        this.c = errlVar;
        this.n = eaovVar;
        this.d = eagnVar;
        this.e = eappVar;
        this.f = eappVar2;
        this.o = eanlVar;
        this.g = eafvVar;
        this.h = ealzVar;
        this.i = eascVar;
        this.j = ffbrVar;
        this.k = str;
        this.l = fazbVar;
        this.m = dvcpVar;
    }

    @Override // defpackage.dvjd
    public final ListenableFuture a(final evtp evtpVar, final String str, final int i) {
        final String str2;
        if (str == null) {
            evth evthVar = evtpVar.c;
            if (evthVar == null) {
                evthVar = evth.a;
            }
            emxf.m(!evthVar.c.isEmpty(), "Syncing signed-out user, yet no Zwieback cookie is provided.");
            evth evthVar2 = evtpVar.c;
            if (evthVar2 == null) {
                evthVar2 = evth.a;
            }
            str2 = evthVar2.c;
        } else {
            str2 = null;
        }
        eafv eafvVar = this.g;
        final easy a2 = easz.a(str);
        ListenableFuture g = erny.g(erny.g(erny.g(erqc.o(((dvmt) eafvVar.a(str)).c()), eldl.d(new eroh() { // from class: dvjh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Map map = (Map) obj;
                final dvjl dvjlVar = dvjl.this;
                final eagp eagpVar = ((Boolean) dvjlVar.j.b()).booleanValue() ? eagp.b : eagp.c;
                final int i2 = i;
                final easy easyVar = a2;
                final evtp evtpVar2 = evtpVar;
                return erny.f(erny.f(dvjlVar.i.a(easyVar, new enpx(eatw.b), eagpVar), new emwl() { // from class: dvjf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        exwa exwaVar;
                        exvn exvnVar = (exvn) obj2;
                        exut exutVar = (exut) exuu.a.createBuilder();
                        exvs exvsVar = (exvs) exvt.a.createBuilder();
                        evtp evtpVar3 = evtpVar2;
                        evth evthVar3 = evtpVar3.c;
                        if (evthVar3 == null) {
                            evthVar3 = evth.a;
                        }
                        evsw evswVar = evthVar3.d;
                        if (evswVar == null) {
                            evswVar = evsw.a;
                        }
                        evsp evspVar = evswVar.e;
                        if (evspVar == null) {
                            evspVar = evsp.a;
                        }
                        String str3 = evspVar.c == 4 ? (String) evspVar.d : "";
                        eagp eagpVar2 = eagpVar;
                        easy easyVar2 = easyVar;
                        dvjl dvjlVar2 = dvjl.this;
                        exvsVar.copyOnWrite();
                        exvt exvtVar = (exvt) exvsVar.instance;
                        str3.getClass();
                        exvtVar.b |= 1;
                        exvtVar.e = str3;
                        exvq exvqVar = (exvq) exvr.a.createBuilder();
                        exvqVar.copyOnWrite();
                        exvr exvrVar = (exvr) exvqVar.instance;
                        exvrVar.c = 3;
                        exvrVar.b |= 1;
                        extr extrVar = (extr) dvjlVar2.h.a(new ealy(dvjlVar2.o.e(), eagpVar2.b(), !easyVar2.b(), 0)).c();
                        exvqVar.copyOnWrite();
                        exvr exvrVar2 = (exvr) exvqVar.instance;
                        extrVar.getClass();
                        exvrVar2.d = extrVar;
                        exvrVar2.b |= 2;
                        exvsVar.copyOnWrite();
                        exvt exvtVar2 = (exvt) exvsVar.instance;
                        exvr exvrVar3 = (exvr) exvqVar.build();
                        exvrVar3.getClass();
                        exvtVar2.d = exvrVar3;
                        exvtVar2.c = 1;
                        exvt exvtVar3 = (exvt) exvsVar.build();
                        exutVar.copyOnWrite();
                        exuu exuuVar = (exuu) exutVar.instance;
                        exvtVar3.getClass();
                        exuuVar.d = exvtVar3;
                        exuuVar.b |= 2;
                        exutVar.copyOnWrite();
                        exuu exuuVar2 = (exuu) exutVar.instance;
                        eygi eygiVar = exuuVar2.h;
                        if (!eygiVar.c()) {
                            exuuVar2.h = eyfy.mutableCopy(eygiVar);
                        }
                        int i3 = i2;
                        exuuVar2.h.h(2);
                        exutVar.copyOnWrite();
                        exuu exuuVar3 = (exuu) exutVar.instance;
                        exuuVar3.g = i3 - 1;
                        exuuVar3.b |= 32;
                        exutVar.copyOnWrite();
                        exuu exuuVar4 = (exuu) exutVar.instance;
                        exuuVar4.i = 2;
                        exuuVar4.b |= 512;
                        exutVar.copyOnWrite();
                        exuu exuuVar5 = (exuu) exutVar.instance;
                        exvnVar.getClass();
                        exuuVar5.f = exvnVar;
                        exuuVar5.b |= 16;
                        if (TextUtils.isEmpty(((eagl) dvjlVar2.d).a)) {
                            ((ensz) ((ensz) dvjl.a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/rpc/impl/GrowthKitGnpApiWrapper", "toNotificationsUpdateAndFetchThreadsRequest", 294, "GrowthKitGnpApiWrapper.java")).q("No client ID is found when syncing using Chime, sync might fail.");
                        } else {
                            eagn eagnVar = dvjlVar2.d;
                            exutVar.copyOnWrite();
                            exuu exuuVar6 = (exuu) exutVar.instance;
                            exuuVar6.b |= 1;
                            exuuVar6.c = ((eagl) eagnVar).a;
                        }
                        enhv enhvVar = new enhv();
                        for (evto evtoVar : evtpVar3.d) {
                            evvt b2 = evvt.b(evtoVar.d);
                            if (b2 == null) {
                                b2 = evvt.UNRECOGNIZED;
                            }
                            enhvVar.h(b2, evtoVar);
                        }
                        enqu listIterator = enhvVar.f().map.entrySet().listIterator();
                        while (listIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            evvt evvtVar = (evvt) entry.getKey();
                            Collection<evto> collection = (Collection) entry.getValue();
                            exvu exvuVar = (exvu) exvv.a.createBuilder();
                            exym exymVar = (exym) exyn.a.createBuilder();
                            exymVar.copyOnWrite();
                            exyn exynVar = (exyn) exymVar.instance;
                            exynVar.c = 4;
                            exynVar.b |= 1;
                            exvuVar.copyOnWrite();
                            exvv exvvVar = (exvv) exvuVar.instance;
                            exyn exynVar2 = (exyn) exymVar.build();
                            exynVar2.getClass();
                            exvvVar.d = exynVar2;
                            exvvVar.b |= 1;
                            extb extbVar = (extb) exti.a.createBuilder();
                            extf extfVar = (extf) exth.a.createBuilder();
                            int ordinal = evvtVar.ordinal();
                            int i4 = 6;
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    i4 = 4;
                                } else if (ordinal == 2) {
                                    i4 = 3;
                                } else if (ordinal == 3) {
                                    i4 = 8;
                                } else if (ordinal == 4) {
                                    i4 = 9;
                                } else {
                                    if (ordinal != 6) {
                                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(evvtVar))));
                                    }
                                    i4 = 7;
                                }
                            }
                            extfVar.copyOnWrite();
                            exth exthVar = (exth) extfVar.instance;
                            exthVar.c = i4 - 1;
                            exthVar.b |= 1;
                            extfVar.copyOnWrite();
                            exth exthVar2 = (exth) extfVar.instance;
                            exthVar2.d = 4;
                            exthVar2.b |= 4;
                            extbVar.copyOnWrite();
                            exti extiVar = (exti) extbVar.instance;
                            exth exthVar3 = (exth) extfVar.build();
                            exthVar3.getClass();
                            extiVar.c = exthVar3;
                            extiVar.b = 4;
                            exvuVar.copyOnWrite();
                            exvv exvvVar2 = (exvv) exvuVar.instance;
                            exti extiVar2 = (exti) extbVar.build();
                            extiVar2.getClass();
                            exvvVar2.e = extiVar2;
                            exvvVar2.b |= 2;
                            for (evto evtoVar2 : collection) {
                                evtn evtnVar = evtoVar2.f;
                                if (evtnVar == null) {
                                    evtnVar = evtn.a;
                                }
                                if (evtnVar.equals(evtn.a)) {
                                    evub evubVar = evtoVar2.c;
                                    if (evubVar == null) {
                                        evubVar = evub.a;
                                    }
                                    exwaVar = (exwa) map.get(dvmu.b(evubVar));
                                } else {
                                    emwd m = dvjl.b.m();
                                    evtn evtnVar2 = evtoVar2.f;
                                    if (evtnVar2 == null) {
                                        evtnVar2 = evtn.a;
                                    }
                                    exwaVar = (exwa) m.fP(evtnVar2);
                                }
                                if (exwaVar != null) {
                                    exvz exvzVar = (exvz) exwaVar.toBuilder();
                                    eyja eyjaVar = evtoVar2.e;
                                    if (eyjaVar == null) {
                                        eyjaVar = eyja.a;
                                    }
                                    long a3 = eykm.a(eyjaVar);
                                    exvzVar.copyOnWrite();
                                    exwa exwaVar2 = (exwa) exvzVar.instance;
                                    exwaVar2.b |= 2;
                                    exwaVar2.d = a3;
                                    exvuVar.a(exvzVar);
                                } else {
                                    exvz exvzVar2 = (exvz) exwa.a.createBuilder();
                                    evub evubVar2 = evtoVar2.c;
                                    if (evubVar2 == null) {
                                        evubVar2 = evub.a;
                                    }
                                    String valueOf = String.valueOf(evubVar2.b);
                                    exvzVar2.copyOnWrite();
                                    exwa exwaVar3 = (exwa) exvzVar2.instance;
                                    valueOf.getClass();
                                    exwaVar3.b |= 1;
                                    exwaVar3.c = valueOf;
                                    eyja eyjaVar2 = evtoVar2.e;
                                    if (eyjaVar2 == null) {
                                        eyjaVar2 = eyja.a;
                                    }
                                    long a4 = eykm.a(eyjaVar2);
                                    exvzVar2.copyOnWrite();
                                    exwa exwaVar4 = (exwa) exvzVar2.instance;
                                    exwaVar4.b |= 2;
                                    exwaVar4.d = a4;
                                    exvuVar.a(exvzVar2);
                                }
                            }
                            exvv exvvVar3 = (exvv) exvuVar.build();
                            exutVar.copyOnWrite();
                            exuu exuuVar7 = (exuu) exutVar.instance;
                            exvvVar3.getClass();
                            eygr eygrVar = exuuVar7.e;
                            if (!eygrVar.c()) {
                                exuuVar7.e = eyfy.mutableCopy(eygrVar);
                            }
                            exuuVar7.e.add(exvvVar3);
                        }
                        return exutVar;
                    }
                }, dvjlVar.c), new emwl() { // from class: dvjg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        exut exutVar = (exut) obj2;
                        dvjl dvjlVar2 = dvjl.this;
                        eagt b2 = (dvjlVar2.o.e() ? dvjlVar2.f : dvjlVar2.e).b(easyVar);
                        if (b2 != null) {
                            String p = b2.p();
                            if (!TextUtils.isEmpty(p)) {
                                exvt exvtVar = ((exuu) exutVar.instance).d;
                                if (exvtVar == null) {
                                    exvtVar = exvt.a;
                                }
                                exvq exvqVar = (exvq) (exvtVar.c == 1 ? (exvr) exvtVar.d : exvr.a).toBuilder();
                                exvqVar.copyOnWrite();
                                exvr exvrVar = (exvr) exvqVar.instance;
                                p.getClass();
                                exvrVar.b |= 4;
                                exvrVar.e = p;
                                exvr exvrVar2 = (exvr) exvqVar.build();
                                exvt exvtVar2 = ((exuu) exutVar.instance).d;
                                if (exvtVar2 == null) {
                                    exvtVar2 = exvt.a;
                                }
                                exvs exvsVar = (exvs) exvtVar2.toBuilder();
                                exvsVar.copyOnWrite();
                                exvt exvtVar3 = (exvt) exvsVar.instance;
                                exvrVar2.getClass();
                                exvtVar3.d = exvrVar2;
                                exvtVar3.c = 1;
                                exutVar.copyOnWrite();
                                exuu exuuVar = (exuu) exutVar.instance;
                                exvt exvtVar4 = (exvt) exvsVar.build();
                                exvtVar4.getClass();
                                exuuVar.d = exvtVar4;
                                exuuVar.b |= 2;
                            }
                        }
                        return (exuu) exutVar.build();
                    }
                }, dvjlVar.c);
            }
        }), erpp.a), eldl.d(new eroh() { // from class: dvji
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return dvjl.this.n.a(a2, str2, (exuu) obj);
            }
        }), erpp.a), eldl.d(new eroh() { // from class: dvjj
            /* JADX WARN: Code restructure failed: missing block: B:121:0x02a4, code lost:
            
                if (defpackage.eyki.a(r7, r8) > 0) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x012e, code lost:
            
                if (r3.g.isEmpty() == false) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x01cb, code lost:
            
                if (((r4 == null ? defpackage.exyx.a : r4).b & 4) != 0) goto L84;
             */
            @Override // defpackage.eroh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 1044
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dvjj.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }), erpp.a);
        erqt.r(g, new dvjk(this, str, i), erpp.a);
        return g;
    }
}
