package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decv implements dgtt {
    public static final cfva a = cfvl.f(cfvl.b, "federated_analytics_suggestion_context_fetch_period_millis", TimeUnit.DAYS.toMillis(1));
    private final Optional b;
    private final errl c;
    private ListIterator d;
    private boolean e;
    private final cqoh f;

    public decv(Optional optional, errl errlVar, cqoh cqohVar) {
        this.b = optional;
        this.c = errlVar;
        this.f = cqohVar;
    }

    @Override // defpackage.dgtt
    public final void a(dgts dgtsVar) {
        elfo.g(new Callable() { // from class: dect
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return decv.this.c();
            }
        }, this.c).k(axou.a(new decu(dgtsVar)), this.c);
    }

    final synchronized ListIterator c() {
        if (this.e) {
            return this.d;
        }
        final long epochMilli = this.f.f().toEpochMilli() - ((Long) a.e()).longValue();
        this.b.isPresent();
        this.b.get();
        bvhd a2 = bvhn.a();
        a2.z("getP2pSmartSuggestionItemSuggestionSuggestionInfoAfterCutoffTimestamp");
        a2.d(new Function() { // from class: adgw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                bvhmVar.b(epochMilli);
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw x = a2.b().x(new emwl() { // from class: adgx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bvgp bvgpVar = (bvgp) obj;
                return new cfys(bvgpVar.c(), bdut.a((bvfs) bvgpVar.cO()));
            }
        });
        this.e = true;
        enqv it = x.iterator();
        this.d = it;
        return it;
    }

    @Override // defpackage.dgtt
    public final void b() {
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
