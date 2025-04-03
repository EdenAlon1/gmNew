package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chie implements chhw {
    private final fbou a;
    private final fbot b;
    private final chhs c;
    private final Optional d;

    public chie(fbou fbouVar, fbot fbotVar, Optional optional, chhs chhsVar) {
        this.a = fbouVar;
        this.b = fbotVar;
        this.d = optional;
        this.c = chhsVar;
    }

    private final String h() {
        Optional map = this.d.map(new Function() { // from class: chic
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((chgx) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final chhs chhsVar = this.c;
        String str = (String) map.orElseGet(new Supplier() { // from class: chid
            @Override // java.util.function.Supplier
            public final Object get() {
                return chhs.this.f();
            }
        });
        return !emxe.c(str) ? str : (String) chgx.a.e();
    }

    @Override // defpackage.chhw
    public final elfl a(fbyg fbygVar) {
        return elfl.g(g().b(fbygVar));
    }

    @Override // defpackage.chhw
    public final elfl b(fbyw fbywVar) {
        return elfl.g(g().c(fbywVar));
    }

    @Override // defpackage.chhw
    public final elfl c(fcap fcapVar) {
        return elfl.g(g().d(fcapVar));
    }

    @Override // defpackage.chhw
    public final elfl d(fcch fcchVar) {
        return elfl.g(g().e(fcchVar));
    }

    @Override // defpackage.chhw
    public final elfl e(fbzv fbzvVar) {
        return elfl.g(g().f(fbzvVar));
    }

    @Override // defpackage.chhw
    public final void f(fcat fcatVar, ffbc ffbcVar) {
        efbd.b();
        ((fbou) ((fbou) ((fbou) chiu.b(this.a, true)).m(evbm.a, h())).l(new ffaw(this.c.e()))).b(fcatVar, ffbcVar);
    }

    final fbot g() {
        return (fbot) ((fbot) ((fbot) chiu.b(this.b, false)).m(evbm.a, h())).l(new ffaw(this.c.e()));
    }
}
