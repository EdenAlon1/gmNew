package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgst implements cgsu {
    private final adgk c;
    private final errl d;
    private static final entd b = entd.c("MmsPolicy");
    public static final cfva a = cfvl.f(cfvl.b, "mms_policy_query_timeout", 3000);

    public cgst(adgk adgkVar, errl errlVar) {
        this.c = adgkVar;
        this.d = errlVar;
    }

    private final elfl d(final Function function) {
        ekzz f = eleg.f("MmsPolicy#isMmsAllowedFuture");
        try {
            elfl i = this.c.a().i(new eroh() { // from class: cgsr
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    cfva cfvaVar = cgst.a;
                    optional.getClass();
                    return (ListenableFuture) optional.map(Function.this).orElse(elfo.e(true));
                }
            }, this.d);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean e(Function function) {
        try {
            return efbd.g() ? ((Boolean) d(function).get(((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue() : ((Boolean) dtnq.b(d(function), ((Long) a.e()).longValue(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException e) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'A', "MmsPolicy.java")).q("Interrupted while querying MmsController");
            return true;
        } catch (ExecutionException e2) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e2)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", '?', "MmsPolicy.java")).q("Failed to query MmsController");
            return true;
        } catch (TimeoutException e3) {
            ((ensz) ((ensz) ((ensz) b.j()).g(e3)).h("com/google/android/apps/messaging/shared/mmscontroller/MmsPolicy", "isEnabled", 'C', "MmsPolicy.java")).q("Timeout while querying MmsController");
            return true;
        }
    }

    public final boolean a() {
        return e(new Function() { // from class: cgss
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgso) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final boolean b() {
        return e(new Function() { // from class: cgsp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgso) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cgsu
    public final boolean c() {
        return e(new Function() { // from class: cgsq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgso) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
