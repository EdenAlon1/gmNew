package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.libraries.mdi.download.debug.sting.MddDebugActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmk implements cgmf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/mdd/MddApiLib");
    public final ffbr b;
    private final ffbr c;
    private final errl d;
    private final errl e;
    private final ffbr f;

    public cgmk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, errl errlVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.d = errlVar;
        this.e = errlVar2;
    }

    private final elfl k(String str) {
        dwub dwubVar = (dwub) this.b.b();
        dwrp f = dwrq.f();
        f.b(str);
        return elfl.g(dwubVar.e(f.a()));
    }

    @Override // defpackage.cgmf
    public final elfl a() {
        dwub dwubVar = (dwub) this.b.b();
        dwrr i = dwrs.i();
        i.b(true);
        return elfl.g(dwubVar.f(i.c())).h(new emwl() { // from class: cgmj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream filter = Collection.EL.stream((engw) obj).filter(new Predicate() { // from class: cgmg
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
                    public final boolean test(Object obj2) {
                        return Objects.nonNull((dwns) obj2);
                    }
                });
                int i2 = engw.d;
                return (engw) filter.collect(endq.a);
            }
        }, this.e);
    }

    @Override // defpackage.cgmf
    public final elfl b(String str) {
        dwub dwubVar = (dwub) this.b.b();
        dwqo n = dwqp.n();
        n.c(str);
        return elfl.g(dwubVar.c(n.a()));
    }

    @Override // defpackage.cgmf
    public final elfl c() {
        return elfl.g(((dwqt) this.f.b()).a((dwub) this.b.b()));
    }

    @Override // defpackage.cgmf
    public final ListenableFuture d() {
        return erny.g(erqt.i(null), new eroh() { // from class: cgmh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((dwub) cgmk.this.b.b()).g("MDD.WIFI.CHARGING.PERIODIC.TASK");
            }
        }, this.d);
    }

    @Override // defpackage.cgmf
    public final Optional e(Activity activity) {
        return Optional.of(new Intent(activity, (Class<?>) MddDebugActivity.class));
    }

    @Override // defpackage.cgmf
    public final String f() {
        return ((dwub) this.b.b()).k();
    }

    @Override // defpackage.cgmf
    public final Optional g(String str) {
        csix.h();
        try {
            elfl k = k(str);
            long intValue = ((Integer) ctjd.O.e()).intValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dtnq.c();
            dwns dwnsVar = (dwns) ersn.b(k, intValue, timeUnit);
            if (dwnsVar != null) {
                ensk h = a.h();
                h.Y(ente.a, "BugleMDD");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 96, "MddApiLib.java")).B("Retrieved File Group Name: %s, File Count = %d", dwnsVar.c, dwnsVar.h.size());
                j(str, dwnsVar);
                return Optional.of(dwnsVar);
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleMDD");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 102, "MddApiLib.java")).q("Retrieved File Group is null");
            i(str);
            return Optional.empty();
        } catch (ExecutionException | TimeoutException e) {
            ensk i = a.i();
            i.Y(ente.a, "BugleMDD");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroup", 90, "MddApiLib.java")).t("Exception getting group: %s", str);
            i(str);
            return Optional.empty();
        }
    }

    @Override // defpackage.cgmf
    public final elfl h(final String str) {
        return k(str).h(new emwl() { // from class: cgmi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cgmk cgmkVar = cgmk.this;
                String str2 = str;
                dwns dwnsVar = (dwns) obj;
                if (dwnsVar != null) {
                    ensk h = cgmk.a.h();
                    h.Y(ente.a, "BugleMDD");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroupAsync", 115, "MddApiLib.java")).B("Retrieved File Group Name: %s, File Count = %d", dwnsVar.c, dwnsVar.h.size());
                    cgmkVar.j(str2, dwnsVar);
                    return Optional.of(dwnsVar);
                }
                ensk h2 = cgmk.a.h();
                h2.Y(ente.a, "BugleMDD");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/mdd/MddApiLib", "maybeGetFileGroupAsync", 121, "MddApiLib.java")).q("Retrieved File Group is null");
                cgmkVar.i(str2);
                return Optional.empty();
            }
        }, this.e);
    }

    public final void i(String str) {
        ((cgns) this.c.b()).c(2, 3, str, 0L);
    }

    public final void j(String str, dwns dwnsVar) {
        ((cgns) this.c.b()).c(2, 2, str, dwnsVar.f);
    }
}
