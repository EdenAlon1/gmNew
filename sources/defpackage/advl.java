package defpackage;

import android.content.Context;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advl implements advi {
    public final advm a;
    public final advu b;
    public final advs c;
    public final advq d;
    public final adwc e;
    private final advo f;
    private final adwa g;
    private final advw h;
    private final advy i;
    private final adwe j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;

    public advl(advn advnVar, advv advvVar, advt advtVar, advr advrVar, adwd adwdVar, advp advpVar, adwb adwbVar, advx advxVar, advz advzVar, adwf adwfVar, adud adudVar, aduk adukVar, ffbr ffbrVar, aduo aduoVar, adug adugVar) {
        Optional of = Optional.of(adudVar);
        this.k = of;
        Optional of2 = Optional.of(adukVar);
        this.l = of2;
        Optional of3 = ((Boolean) adwg.b.e()).booleanValue() ? Optional.of((aduc) ffbrVar.b()) : Optional.empty();
        this.m = of3;
        Optional of4 = ((Boolean) csks.a.e()).booleanValue() ? Optional.of(aduoVar) : Optional.empty();
        this.n = of4;
        Optional of5 = ((Boolean) adwg.c.e()).booleanValue() ? Optional.of(adugVar) : Optional.empty();
        this.o = of5;
        int i = engw.d;
        engw engwVar = enou.a;
        Context context = (Context) advnVar.a.b();
        context.getClass();
        engwVar.getClass();
        this.a = new advm(context, engwVar);
        engw b = b(engw.v(of, of2, of3, of4, of5));
        Context context2 = (Context) advvVar.a.b();
        context2.getClass();
        b.getClass();
        this.b = new advu(context2, b);
        engw b2 = b(engw.v(of, of2, of3, of4, of5));
        Context context3 = (Context) advtVar.a.b();
        context3.getClass();
        b2.getClass();
        this.c = new advs(context3, b2);
        engw b3 = b(engw.v(of, of2, of3, of4, of5));
        Context context4 = (Context) advrVar.a.b();
        context4.getClass();
        b3.getClass();
        this.d = new advq(context4, b3);
        engw b4 = b(engw.v(of, of2, of3, of4, of5));
        Context context5 = (Context) adwdVar.a.b();
        context5.getClass();
        b4.getClass();
        this.e = new adwc(context5, b4);
        engw b5 = b(engw.u(of, of2, of4, of5));
        Context context6 = (Context) advpVar.a.b();
        context6.getClass();
        b5.getClass();
        this.f = new advo(context6, b5);
        engw b6 = b(engw.u(of, of2, of4, of5));
        Context context7 = (Context) adwbVar.a.b();
        context7.getClass();
        b6.getClass();
        this.g = new adwa(context7, b6);
        engw b7 = b(engw.u(of, of2, of4, of5));
        Context context8 = (Context) advxVar.a.b();
        context8.getClass();
        b7.getClass();
        this.h = new advw(context8, b7);
        engw engwVar2 = enou.a;
        Context context9 = (Context) advzVar.a.b();
        context9.getClass();
        engwVar2.getClass();
        this.i = new advy(context9, engwVar2);
        engw b8 = b(engw.t(of2, of4, of5));
        Context context10 = (Context) adwfVar.a.b();
        context10.getClass();
        b8.getClass();
        this.j = new adwe(context10, b8);
    }

    private static engw b(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).filter(new Predicate() { // from class: advj
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
            public final boolean test(Object obj) {
                return ((Optional) obj).isPresent();
            }
        }).map(new Function() { // from class: advk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (adtw) ((Optional) obj).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    @Override // defpackage.advi
    public final engw a() {
        return engw.A(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a);
    }
}
