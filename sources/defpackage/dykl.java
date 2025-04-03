package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dykl implements dyij {
    public final dyth b;
    public final dzdc d;
    private final dyqz e;
    final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final errl a = dyia.b().a;

    public dykl(dyqz dyqzVar, dzdc dzdcVar, dyth dythVar) {
        this.e = dyqzVar;
        this.d = dzdcVar;
        this.b = dythVar;
    }

    @Override // defpackage.dyij
    public final void a(final dzja dzjaVar) {
        if (this.c.add(dzjaVar)) {
            final ListenableFuture f = erny.f(d(dzjaVar, null), new emwl() { // from class: dykc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dyii dyiiVar = (dyii) obj;
                    if (dyiiVar == null) {
                        return null;
                    }
                    dzja dzjaVar2 = dzjaVar;
                    dykl dyklVar = dykl.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    dyklVar.b(dzjaVar2).T(enkr.g(dyiiVar.a(), new emwl() { // from class: dyki
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return dzxe.a((dzpt) obj2);
                        }
                    }));
                    dyklVar.b.a(dzjaVar2).edit().putLong("BLOCK_LAST_SYNC_KEY", currentTimeMillis).commit();
                    return null;
                }
            }, erpp.a);
            this.a.submit(new Runnable() { // from class: dykd
                @Override // java.lang.Runnable
                public final void run() {
                    final ListenableFuture listenableFuture = f;
                    try {
                        erqt.b(listenableFuture).a(new Callable() { // from class: dykj
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return (Void) ListenableFuture.this.get();
                            }
                        }, erpp.a).get();
                    } catch (InterruptedException | ExecutionException e) {
                        dyhr.d("LitBlockController", "Failed to store block list", e);
                    }
                    dykl.this.c.remove(dzjaVar);
                }
            });
        }
    }

    public final dzwo b(dzja dzjaVar) {
        return this.e.b(dzjaVar);
    }

    public final dzwu c(final dzja dzjaVar, dzpt dzptVar, final emxg emxgVar) {
        return dzwn.d(b(dzjaVar).o(dzxe.a(dzptVar)), new emwl() { // from class: dykg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dzor dzorVar = (dzor) obj;
                if (emxgVar.a(dzorVar)) {
                    dykl.this.a(dzjaVar);
                }
                return Boolean.valueOf(dzorVar.a());
            }
        });
    }

    public final ListenableFuture d(final dzja dzjaVar, final String str) {
        dyxa c = dyxb.c();
        ((dyww) c).a = "fetch blocked conversation";
        c.b(dyxf.g);
        final dyxb a = c.a();
        final int a2 = (int) fdpn.a.get().a();
        return erny.f(erqt.n(new erog() { // from class: dykh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                UUID randomUUID = UUID.randomUUID();
                dzja dzjaVar2 = dzjaVar;
                dzfd dzfdVar = new dzfd(dzjaVar2, a2, str);
                dzdc dzdcVar = dykl.this.d;
                return dzdcVar.a.b(randomUUID, dzfdVar, erqt.i(new dzcj((fbfm) fbfm.h(new fbfl(), dzdcVar.a.d.c))), dzjaVar2, a, true);
            }
        }, this.a), new emwl() { // from class: dykk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyii dyiiVar = (dyii) obj;
                String b = dyiiVar.b();
                boolean c2 = emxe.c(b);
                dykl dyklVar = dykl.this;
                dzja dzjaVar2 = dzjaVar;
                if (c2) {
                    return dyiiVar;
                }
                try {
                    dyii dyiiVar2 = (dyii) dyklVar.d(dzjaVar2, b).get();
                    dyib dyibVar = new dyib();
                    dyibVar.b(engw.j(enfc.b(dyiiVar.a(), dyiiVar2.a())));
                    dyibVar.c(dyiiVar2.b());
                    return dyibVar.a();
                } catch (InterruptedException | ExecutionException e) {
                    dyhr.d("LitBlockController", "Failed to sync block list", e);
                    return null;
                }
            }
        }, this.a);
    }
}
