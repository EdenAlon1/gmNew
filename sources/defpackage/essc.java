package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essc extends ffhv implements ffji {
    int a;
    final /* synthetic */ essj b;
    final /* synthetic */ fcek c;
    final /* synthetic */ esqr d;
    final /* synthetic */ Instant e;
    final /* synthetic */ essw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public essc(essj essjVar, fcek fcekVar, esqr esqrVar, Instant instant, essw esswVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = essjVar;
        this.c = fcekVar;
        this.d = esqrVar;
        this.e = instant;
        this.f = esswVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            essj essjVar = this.b;
            final fcek fcekVar = this.c;
            final esqr esqrVar = this.d;
            this.a = 1;
            String str = fcekVar.c;
            final cpll cpllVar = essjVar.a.a;
            Object c = fgfz.c(((cpke) cpllVar.d.b()).c(str, fcekVar.e).h(new emwl() { // from class: cplj
                @Override // defpackage.emwl
                public final Object apply(Object obj3) {
                    esqr esqrVar2 = esqrVar;
                    String str2 = fcekVar.c;
                    final enip n = enip.n(cpkn.a(esqrVar2));
                    enip enipVar = (enip) DesugarArrays.stream(awvh.values()).filter(new Predicate() { // from class: cpkz
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj4) {
                            entd entdVar = cpll.a;
                            return !awvh.UNKNOWN_TYPE.equals((awvh) obj4);
                        }
                    }).filter(new Predicate() { // from class: cplc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj4) {
                            entd entdVar = cpll.a;
                            return !enip.this.contains((awvh) obj4);
                        }
                    }).collect(endq.b);
                    awvs awvsVar = (awvs) awvt.c.createBuilder();
                    awvsVar.copyOnWrite();
                    awvt awvtVar = (awvt) awvsVar.instance;
                    str2.getClass();
                    awvtVar.d |= 1;
                    awvtVar.e = str2;
                    awvsVar.copyOnWrite();
                    awvt awvtVar2 = (awvt) awvsVar.instance;
                    eygi eygiVar = awvtVar2.i;
                    if (!eygiVar.c()) {
                        awvtVar2.i = eyfy.mutableCopy(eygiVar);
                    }
                    Iterator<E> it = n.iterator();
                    while (it.hasNext()) {
                        awvtVar2.i.h(((awvh) it.next()).f);
                    }
                    awvsVar.copyOnWrite();
                    awvt awvtVar3 = (awvt) awvsVar.instance;
                    eygi eygiVar2 = awvtVar3.j;
                    if (!eygiVar2.c()) {
                        awvtVar3.j = eyfy.mutableCopy(eygiVar2);
                    }
                    Iterator<E> it2 = enipVar.iterator();
                    while (it2.hasNext()) {
                        awvtVar3.j.h(((awvh) it2.next()).f);
                    }
                    cpll cpllVar2 = cpll.this;
                    awvsVar.copyOnWrite();
                    awvt awvtVar4 = (awvt) awvsVar.instance;
                    awui awuiVar = cpllVar2.f;
                    awuiVar.getClass();
                    awvtVar4.r = awuiVar;
                    awvtVar4.d |= 512;
                    return (awvt) awvsVar.build();
                }
            }, cpllVar.e).i(new eroh() { // from class: cpkp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj3) {
                    return cpll.this.b((awvt) obj3, "handleGroupFeaturesUpdate");
                }
            }, cpllVar.e), this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new essc(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
