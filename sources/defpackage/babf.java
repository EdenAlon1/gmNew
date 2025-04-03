package defpackage;

import android.content.ContentValues;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class babf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager");
    public final ejet b;
    public final dtuu c;
    public final ejvp d;
    public final akzt e;
    private final errl f;

    public babf(ejet ejetVar, errl errlVar, dtuu dtuuVar, ejvp ejvpVar, akzt akztVar) {
        this.b = ejetVar;
        this.f = errlVar;
        this.c = dtuuVar;
        this.d = ejvpVar;
        this.e = akztVar;
    }

    public static final int d() {
        Object apply;
        String[] strArr = btro.a;
        btrl btrlVar = new btrl(btro.a);
        btrlVar.z("getStoredAccountId");
        boolean z = true;
        apply = new Function() { // from class: babb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btrb) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(btro.c);
        btrc[] btrcVarArr = {(btrc) apply};
        int a2 = btro.b().a();
        Integer.valueOf(a2).getClass();
        int i = -1;
        if (((Integer) btro.b.getOrDefault(btrcVarArr[0].toString(), -1)).intValue() > a2) {
            dtub.w("columnReference.toString()", a2);
        }
        btrlVar.m(btrcVarArr);
        btrd btrdVar = (btrd) btrlVar.b().o();
        try {
            if (btrdVar.moveToFirst()) {
                int count = btrdVar.getCount();
                if (count > 1) {
                    z = false;
                }
                emxf.n(z, "Expected 0 or 1 linked accounts but found %s", count);
                i = btrdVar.c();
            }
            btrdVar.close();
            return i;
        } catch (Throwable th) {
            try {
                btrdVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl a() {
        final csgr csgrVar = new csgr();
        return elfo.g(new Callable() { // from class: babe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(babf.d());
            }
        }, this.f).i(new eroh() { // from class: baav
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Integer num = (Integer) obj;
                if (num.intValue() != -1) {
                    final csgr csgrVar2 = csgrVar;
                    final babf babfVar = babf.this;
                    return elfl.g(babfVar.b.a(num.intValue())).h(new emwl() { // from class: babc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eisx eisxVar = (eisx) obj2;
                            babf.this.e.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Success.Count");
                            return eisxVar;
                        }
                    }, erpp.a).f(Exception.class, new eroh() { // from class: babd
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            Exception exc = (Exception) obj2;
                            babf.this.e.c("Bugle.Cms.LinkedAccountManager.GetLinkedAccountAsync.Failure.Count");
                            csgs.a(exc, csgrVar2);
                            return elfo.d(exc);
                        }
                    }, erpp.a);
                }
                ensk h = babf.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "getLinkedAccountAsync", 164, "LinkedAccountManager.java")).q("LinkedAccountManager: No valid stored accountId, throwing NoLinkedAccountException.");
                throw new babn();
            }
        }, erpp.a);
    }

    public final void b() {
        efbd.b();
        ensk h = a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "clearLinkedAccount", 206, "LinkedAccountManager.java")).q("LinkedAccountManager: clearLinkedAccount triggered.");
        this.c.d("clearLinkedAccount", new Runnable() { // from class: baba
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = btro.a;
                btrh btrhVar = new btrh();
                btrhVar.f("clearLinkedAccount");
                btrhVar.d();
                if (csgj.a()) {
                    final babf babfVar = babf.this;
                    babfVar.c.g(new dtut() { // from class: baau
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("LAM::clearLinkedAccount::runAfterCommit");
                        }
                    }, "LinkedAccountManager#afterClearLinkedAccount", new Runnable() { // from class: baay
                        @Override // java.lang.Runnable
                        public final void run() {
                            ensk h2 = babf.a.h();
                            h2.Y(ente.a, "BugleCms");
                            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager", "clearLinkedAccount", 220, "LinkedAccountManager.java")).q("LinkedAccountManager: notify UI after clearLinkedAccount.");
                            babf babfVar2 = babf.this;
                            babfVar2.d.a(elfo.e(null), csgi.a);
                            babfVar2.d.a(elfo.e(null), csgi.b);
                        }
                    });
                }
            }
        });
    }

    public final void c(final eisx eisxVar) {
        efbd.b();
        boolean z = false;
        if (eisxVar != null && eisxVar.a() != -1) {
            z = true;
        }
        emxf.a(z);
        Optional optional = (Optional) this.c.c("LinkedAccountManager#setLinkedAccount", new emyl() { // from class: baaz
            @Override // defpackage.emyl
            public final Object get() {
                eisx eisxVar2 = eisxVar;
                int d = babf.d();
                if (d == eisxVar2.a()) {
                    return Optional.empty();
                }
                if (d != -1) {
                    return Optional.of(new IllegalStateException(String.format("Cannot link account; one is already linked with id: %s", Integer.valueOf(d))));
                }
                String[] strArr = btro.a;
                btqy btqyVar = new btqy();
                btqyVar.b(eisxVar2.a());
                btqv a2 = btqyVar.a();
                final dtve a3 = btro.a();
                dtub.b(btro.a(), "linked_account", a2, new Function() { // from class: btqt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dtve.this.S("linked_account", (ContentValues) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: btqu
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                if (csgj.a()) {
                    final babf babfVar = babf.this;
                    babfVar.c.g(new dtut() { // from class: baaw
                        @Override // defpackage.dtut
                        public final ekzz a() {
                            return eleg.f("LAM::setLinkedAccount::runAfterCommit");
                        }
                    }, "LinkedAccountManager#afterSetLinkedAccount", new Runnable() { // from class: baax
                        @Override // java.lang.Runnable
                        public final void run() {
                            babf babfVar2 = babf.this;
                            babfVar2.d.a(elfo.e(null), csgi.a);
                            babfVar2.d.a(elfo.e(null), csgi.b);
                        }
                    });
                }
                return Optional.empty();
            }
        });
        if (optional != null && optional.isPresent()) {
            throw ((RuntimeException) optional.get());
        }
    }
}
