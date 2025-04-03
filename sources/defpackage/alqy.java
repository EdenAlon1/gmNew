package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqy implements alry {
    public final ffbr a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public alqy(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.alry
    public final fgmh a(final bcse bcseVar) {
        return (fgmh) ConcurrentMap.EL.computeIfAbsent(this.b, bcseVar.u(), new Function() { // from class: alqx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fglr fglrVar = (fglr) fglu.a.createBuilder();
                bcse bcseVar2 = bcseVar;
                boolean b = byyr.b(bcseVar2.b());
                fglrVar.copyOnWrite();
                fglu fgluVar = (fglu) fglrVar.instance;
                fgluVar.c |= 8;
                fgluVar.d = b;
                fglx fglxVar = (fglx) fgly.a.createBuilder();
                boolean ar = bcseVar2.ar();
                fglxVar.copyOnWrite();
                fgly fglyVar = (fgly) fglxVar.instance;
                fglyVar.b |= 1;
                fglyVar.c = ar;
                for (MessagePartCoreData messagePartCoreData : bcseVar2.g) {
                    if (messagePartCoreData.bl()) {
                        fglxVar.copyOnWrite();
                        fgly fglyVar2 = (fgly) fglxVar.instance;
                        fglyVar2.b |= 16;
                        fglyVar2.g = true;
                    } else if (messagePartCoreData.bD()) {
                        fglxVar.copyOnWrite();
                        fgly fglyVar3 = (fgly) fglxVar.instance;
                        fglyVar3.b = 4 | fglyVar3.b;
                        fglyVar3.e = true;
                    } else if (messagePartCoreData.ba()) {
                        fglxVar.copyOnWrite();
                        fgly fglyVar4 = (fgly) fglxVar.instance;
                        fglyVar4.b |= 8;
                        fglyVar4.f = true;
                    } else if (messagePartCoreData.bo()) {
                        fglxVar.copyOnWrite();
                        fgly fglyVar5 = (fgly) fglxVar.instance;
                        fglyVar5.b |= 2;
                        fglyVar5.d = true;
                    }
                }
                fglv fglvVar = (fglv) fglz.a.createBuilder();
                int i = bcseVar2.aX() ? 2 : bcseVar2.aC() ? 4 : bcseVar2.aR() ? 5 : bcseVar2.aM() ? 3 : 1;
                alqy alqyVar = alqy.this;
                fglvVar.copyOnWrite();
                fglz fglzVar = (fglz) fglvVar.instance;
                fglzVar.c = i - 1;
                fglzVar.b |= 1;
                eqna d = ((crgh) alqyVar.a.b()).d();
                fglvVar.copyOnWrite();
                fglz fglzVar2 = (fglz) fglvVar.instance;
                fglzVar2.d = d.e;
                fglzVar2.b |= 2;
                fgly fglyVar6 = (fgly) fglxVar.build();
                fglvVar.copyOnWrite();
                fglz fglzVar3 = (fglz) fglvVar.instance;
                fglyVar6.getClass();
                fglzVar3.f = fglyVar6;
                fglzVar3.b |= 8;
                boolean aQ = bcseVar2.aQ();
                fglvVar.copyOnWrite();
                fglz fglzVar4 = (fglz) fglvVar.instance;
                fglzVar4.b = 4 | fglzVar4.b;
                fglzVar4.e = aQ;
                fglz fglzVar5 = (fglz) fglvVar.build();
                fglrVar.copyOnWrite();
                fglu fgluVar2 = (fglu) fglrVar.instance;
                fglzVar5.getClass();
                fgluVar2.g = fglzVar5;
                fgluVar2.c |= 64;
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                    cfva cfvaVar = aoqm.a;
                    boolean A = ((Boolean) new aopr().get()).booleanValue() ? bcseVar2.r().A() : ((aoqw) bcseVar2.z.b()).i(bcseVar2.S());
                    fglrVar.copyOnWrite();
                    fglu fgluVar3 = (fglu) fglrVar.instance;
                    fgluVar3.c |= 32;
                    fgluVar3.f = A;
                }
                fgmg fgmgVar = (fgmg) fgmh.a.createBuilder();
                fgmgVar.e(fglu.b, (fglu) fglrVar.build());
                return (fgmh) fgmgVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alry
    public final fgmh b(fglt fgltVar) {
        fgmg fgmgVar = (fgmg) fgmh.a.createBuilder();
        eyfw eyfwVar = fglu.b;
        fglr fglrVar = (fglr) fglu.a.createBuilder();
        fglrVar.copyOnWrite();
        fglu fgluVar = (fglu) fglrVar.instance;
        fgluVar.h = fgltVar.i;
        fgluVar.c |= 128;
        fgmgVar.e(eyfwVar, (fglu) fglrVar.build());
        return (fgmh) fgmgVar.build();
    }

    @Override // defpackage.alry
    public final fgmh c(final alxr alxrVar, final boolean z, final boolean z2) {
        return (fgmh) ConcurrentMap.EL.computeIfAbsent(this.b, bdhb.b(alxrVar.b().a()), new Function() { // from class: alqw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fglr fglrVar = (fglr) fglu.a.createBuilder();
                fglrVar.copyOnWrite();
                fglu fgluVar = (fglu) fglrVar.instance;
                fgluVar.c |= 8;
                boolean z3 = z;
                fgluVar.d = z3;
                fglx fglxVar = (fglx) fgly.a.createBuilder();
                alxr alxrVar2 = alxrVar;
                boolean z4 = alxrVar2.g() instanceof appw;
                fglxVar.copyOnWrite();
                fgly fglyVar = (fgly) fglxVar.instance;
                fglyVar.b |= 1;
                fglyVar.c = z4;
                boolean z5 = alxrVar2.g() instanceof ufm;
                fglxVar.copyOnWrite();
                fgly fglyVar2 = (fgly) fglxVar.instance;
                fglyVar2.b |= 16;
                fglyVar2.g = z5;
                boolean A = le.A(alxrVar2.g().b());
                fglxVar.copyOnWrite();
                fgly fglyVar3 = (fgly) fglxVar.instance;
                fglyVar3.b |= 4;
                fglyVar3.e = A;
                boolean z6 = alxrVar2.g() instanceof apmt;
                fglxVar.copyOnWrite();
                fgly fglyVar4 = (fgly) fglxVar.instance;
                fglyVar4.b |= 8;
                fglyVar4.f = z6;
                boolean n = le.n(alxrVar2.g().b());
                fglxVar.copyOnWrite();
                fgly fglyVar5 = (fgly) fglxVar.instance;
                fglyVar5.b |= 2;
                fglyVar5.d = n;
                fgly fglyVar6 = (fgly) fglxVar.build();
                fglv fglvVar = (fglv) fglz.a.createBuilder();
                int i = z2 ? 5 : alxrVar2.a() == alxq.b ? 3 : (z3 || (alxrVar2.g() instanceof apmq)) ? 4 : alxrVar2.g() instanceof appw ? 2 : 1;
                alqy alqyVar = alqy.this;
                fglvVar.copyOnWrite();
                fglz fglzVar = (fglz) fglvVar.instance;
                fglzVar.c = i - 1;
                fglzVar.b |= 1;
                eqna d = ((crgh) alqyVar.a.b()).d();
                fglvVar.copyOnWrite();
                fglz fglzVar2 = (fglz) fglvVar.instance;
                fglzVar2.d = d.e;
                fglzVar2.b |= 2;
                fglvVar.copyOnWrite();
                fglz fglzVar3 = (fglz) fglvVar.instance;
                fglyVar6.getClass();
                fglzVar3.f = fglyVar6;
                fglzVar3.b |= 8;
                fglvVar.copyOnWrite();
                fglz fglzVar4 = (fglz) fglvVar.instance;
                fglzVar4.b |= 4;
                fglzVar4.e = alxrVar2 instanceof alyv;
                fglz fglzVar5 = (fglz) fglvVar.build();
                fglrVar.copyOnWrite();
                fglu fgluVar2 = (fglu) fglrVar.instance;
                fglzVar5.getClass();
                fgluVar2.g = fglzVar5;
                fgluVar2.c |= 64;
                if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                    alya d2 = alxrVar2.d();
                    if (d2 instanceof alxp) {
                        boolean A2 = ((alxp) d2).a().g().A();
                        fglrVar.copyOnWrite();
                        fglu fgluVar3 = (fglu) fglrVar.instance;
                        fgluVar3.c |= 32;
                        fgluVar3.f = A2;
                    }
                }
                fgmg fgmgVar = (fgmg) fgmh.a.createBuilder();
                fgmgVar.e(fglu.b, (fglu) fglrVar.build());
                return (fgmh) fgmgVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
