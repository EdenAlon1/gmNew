package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cppx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cppy b;
    final /* synthetic */ aoku c;
    final /* synthetic */ fcbq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cppx(cppy cppyVar, aoku aokuVar, fcbq fcbqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cppyVar;
        this.c = aokuVar;
        this.d = fcbqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cppx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        fcks fcksVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final cppy cppyVar = this.b;
            aoku aokuVar = this.c;
            this.a = 1;
            Optional e = aokuVar.e();
            final ffji ffjiVar = new ffji() { // from class: cppt
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    awui awuiVar = (awui) obj2;
                    crgh crghVar = (crgh) cppy.this.b.b();
                    awuiVar.getClass();
                    return crghVar.c(awuiVar);
                }
            };
            Optional map = e.map(new Function() { // from class: cppu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    entd entdVar = cppy.a;
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final ffji ffjiVar2 = new ffji() { // from class: cppv
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    crgf crgfVar = (crgf) obj2;
                    entd entdVar = cppy.a;
                    return Boolean.valueOf(crgfVar == crgf.c);
                }
            };
            obj = map.map(new Function() { // from class: cppw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    entd entdVar = cppy.a;
                    return ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((ensz) cppy.a.h()).q("Advertising Tachygram capability.");
            fcbq fcbqVar = this.d;
            fckr fckrVar = (fckr) fcks.a.createBuilder();
            fckrVar.getClass();
            DesugarCollections.unmodifiableList(((fcks) fckrVar.instance).b).getClass();
            fckrVar.a(cgye.TACHYGRAM.h);
            eyfy build = fckrVar.build();
            build.getClass();
            fcks fcksVar2 = (fcks) build;
            fcbqVar.copyOnWrite();
            fcbr fcbrVar = (fcbr) fcbqVar.instance;
            fcbr fcbrVar2 = fcbr.a;
            fcks fcksVar3 = fcbrVar.l;
            if (fcksVar3 != null && fcksVar3 != (fcksVar = fcks.a)) {
                fckr fckrVar2 = (fckr) fcksVar.createBuilder(fcksVar3);
                fckrVar2.mergeFrom((fckr) fcksVar2);
                fcksVar2 = (fcks) fckrVar2.buildPartial();
            }
            fcbrVar.l = fcksVar2;
            fcbrVar.b |= 8;
        }
        return this.d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cppx(this.b, this.c, this.d, ffguVar);
    }
}
