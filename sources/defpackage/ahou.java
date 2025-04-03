package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahou extends ahow {
    final /* synthetic */ ahoz a;
    private final ListenableFuture c;

    public ahou(ahoz ahozVar, String str, final int i, final int i2, int i3) {
        this.a = ahozVar;
        final ctyg ctygVar = (ctyg) ahozVar.h.b();
        elfl e = elfl.g(ctygVar.a(str)).i(eldl.d(new eroh() { // from class: ctxz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(Optional.empty());
                }
                List ap = ((edqc) optional.get()).ap();
                if (ap == null || ap.isEmpty()) {
                    return elfo.e(Optional.empty());
                }
                Stream filter = Collection.EL.stream(ap).filter(new Predicate() { // from class: ctyd
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
                        return true;
                    }
                });
                int i4 = engw.d;
                engw engwVar = (engw) filter.collect(endq.a);
                if (engwVar.isEmpty()) {
                    return elfo.e(Optional.empty());
                }
                final int i5 = i2;
                final int i6 = i;
                ctyg ctygVar2 = ctyg.this;
                edro e2 = edrp.e((edps) engwVar.get(0));
                edqo edqoVar = (edqo) e2;
                edqoVar.a = Integer.valueOf(i6);
                edqoVar.b = Integer.valueOf(i5);
                return elfl.g(duin.a(((edsg) ctygVar2.d.b()).a(e2.g()))).i(new eroh() { // from class: ctye
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return elfo.e(Optional.ofNullable(ctap.f(((edrq) obj2).a(), i6, i5)));
                    }
                }, ctygVar2.c).e(Throwable.class, new emwl() { // from class: ctyf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ((enrr) ((enrr) ((enrr) ctyg.a.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", 159, "PlacesMessagingClient.java")).q("Failed to get bitmap from fetch photo request.");
                        return Optional.empty();
                    }
                }, ctygVar2.c);
            }
        }), ctygVar.c).e(Throwable.class, new emwl() { // from class: ctya
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) ctyg.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/util/places/PlacesMessagingClient", "getPhoto", 169, "PlacesMessagingClient.java")).q("Failed to get photo metadata from fetch place request.");
                return Optional.empty();
            }
        }, ctygVar.c);
        this.c = e;
        erqj ahotVar = new ahot(this, str, i3);
        erqt.r(e, ((Boolean) ahozVar.g.b()).booleanValue() ? ahotVar : axou.a(ahotVar), ahozVar.f);
    }

    @Override // defpackage.ahow
    public final void a() {
        super.a();
        this.c.cancel(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
